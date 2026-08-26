package org.telegram.ui.community;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import com.google.android.exoplayer2.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda57;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda286;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda17;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda5;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda57;

public abstract class CommunityUtils {

    public final class DialogCellFactory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new DialogCellFactory());
        }

        public static UItem asCell(MessagesController.CommunityPeerDialog communityPeerDialog, CommunitySheet communitySheet) {
            TLRPC.User user = communityPeerDialog.user;
            if (user != null) {
                UItem uItemOfFactory = UItem.ofFactory(DialogCellFactory.class);
                long j = user.id;
                uItemOfFactory.longValue = j;
                uItemOfFactory.id = (int) (j ^ (j >>> 32));
                uItemOfFactory.object = user;
                uItemOfFactory.object2 = communitySheet;
                return uItemOfFactory;
            }
            TLRPC.Chat chat = communityPeerDialog.chat;
            UItem uItemOfFactory2 = UItem.ofFactory(DialogCellFactory.class);
            long j2 = chat != null ? -chat.id : 0L;
            uItemOfFactory2.longValue = j2;
            uItemOfFactory2.id = (int) (j2 ^ (j2 >>> 32));
            uItemOfFactory2.object = chat;
            uItemOfFactory2.object2 = communitySheet;
            return uItemOfFactory2;
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            DialogCell dialogCell = (DialogCell) view;
            dialogCell.setDialogCellDelegate((DialogCell.DialogCellDelegate) uItem.object2);
            Object obj = uItem.object;
            if (obj instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                dialogCell.isHiddenInCommunity = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
                TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.id);
                dialogCell.insideCommunityListNoDialog = dialog == null;
                if (dialog != null) {
                    dialogCell.setCustomMessageWithoutRebuild(null);
                    dialogCell.setDialog(dialog, 0, 0);
                    return;
                } else {
                    dialogCell.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
                    dialogCell.setDialog(-chat.id, null, 0, false, false);
                    return;
                }
            }
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                dialogCell.isHiddenInCommunity = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
                TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.id);
                dialogCell.insideCommunityListNoDialog = dialog2 == null;
                if (dialog2 != null) {
                    dialogCell.setCustomMessageWithoutRebuild(null);
                    dialogCell.setDialog(dialog2, 0, 0);
                } else {
                    dialogCell.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                    dialogCell.setDialog(user.id, null, 0, false, false);
                }
            }
        }

        @Override
        public final boolean contentsEquals(UItem uItem, UItem uItem2) {
            return equals(uItem, uItem2);
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            DialogCell dialogCell = new DialogCell(null, context, false, i, resourcesProvider);
            dialogCell.insideCommunityList = true;
            return dialogCell;
        }

        @Override
        public final boolean equals(UItem uItem, UItem uItem2) {
            return uItem.id == uItem2.id;
        }
    }

    public final class PendingRequests implements CommunityPendingRequestCell.ClickDelegate {
        public final BulletinFactory bulletinFactory;
        public final TLRPC.Chat community;
        public final long communityId;
        public final Context context;
        public final int currentAccount;
        public Delegate delegate;
        public ChatActivity$$ExternalSyntheticLambda286 doCommitRunnable;
        public boolean finished;
        public long lastViewTime;
        public boolean loading;
        public String nextOffset;
        public AlertDialog progressDialog;
        public int reqId;
        public final Theme.ResourcesProvider resourcesProvider;
        public int totalCount;
        public int unreadPendingRequests;
        public final LongSparseArray hiddenJoinRequests = new LongSparseArray();
        public ArrayList pendingRequests = new ArrayList();

        public interface Delegate {
            void close();

            void onClickGroupOwner(long j);

            void updateAdapter();
        }

        public PendingRequests(Context context, Theme.ResourcesProvider resourcesProvider, BulletinFactory bulletinFactory, int i, long j) {
            this.context = context;
            this.resourcesProvider = resourcesProvider;
            this.bulletinFactory = bulletinFactory;
            this.currentAccount = i;
            this.communityId = j;
            this.community = MessagesController.getInstance(i).getChat(Long.valueOf(j));
            this.lastViewTime = MessagesController.getMainSettings(i).getLong(Log.m(j, "community_requests_last_view_time_"), 0L);
        }

        public final void calcUnreadPendingRequests() {
            this.unreadPendingRequests = 0;
            ArrayList arrayList = this.pendingRequests;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) this.pendingRequests.get(i);
                if (!this.hiddenJoinRequests.containsKey(DialogObject.getPeerDialogId(communityPeerRequest.peer))) {
                    if (communityPeerRequest.date <= this.lastViewTime) {
                        return;
                    } else {
                        this.unreadPendingRequests++;
                    }
                }
            }
        }

        public final void fillItems(ArrayList arrayList) {
            ArrayList arrayList2 = this.pendingRequests;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                return;
            }
            ArrayList arrayList3 = this.pendingRequests;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    LongSparseArray longSparseArray = this.hiddenJoinRequests;
                    if (longSparseArray == null || !longSparseArray.containsKey(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z = !communityPeerRequest.visible;
                        boolean z2 = i < size + (-1);
                        int i2 = CommunityPendingRequestCell.Factory.$r8$clinit;
                        UItem uItemOfFactory = UItem.ofFactory(CommunityPendingRequestCell.Factory.class);
                        uItemOfFactory.object = new CommunityPendingRequestCell.Data(peerDialogId, user, z);
                        uItemOfFactory.object2 = this;
                        uItemOfFactory.hideDivider = !z2;
                        arrayList.add(uItemOfFactory);
                    }
                    i++;
                }
            }
            if (this.finished) {
                return;
            }
            UItem uItem = new UItem(34);
            uItem.intValue = 29;
            arrayList.add(uItem);
        }

        public final void loadNext() {
            if (this.loading || this.finished || !ChatObject.canUserDoAdminAction(this.community, 27)) {
                return;
            }
            this.loading = true;
            MessagesController.getInstance(this.currentAccount).fetchCommunityPendingJoinRequests(this.communityId, this.nextOffset, new CommunityUtils$PendingRequests$$ExternalSyntheticLambda2(this, 1));
        }

        public final void markAsViewed() {
            int i = this.currentAccount;
            long currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            this.lastViewTime = currentTime;
            MessagesController.getMainSettings(i).edit().putLong("community_requests_last_view_time_" + this.communityId, currentTime).apply();
            calcUnreadPendingRequests();
        }

        public final void onResolveAllJoinRequests(boolean z, boolean z2) {
            TextView textView;
            if (this.progressDialog == null && this.reqId == 0) {
                if (z2) {
                    AlertDialog alertDialogCreateSimpleConfirmAlert = AlertsCreator.createSimpleConfirmAlert(this.context, this.resourcesProvider, LocaleController.getString(z ? R.string.CommunityAddAllChatsTitle : R.string.CommunityDeclineAllTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralString(z ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", this.totalCount, new Object[0])), LocaleController.getString(z ? R.string.Add : R.string.Decline), new TodoItemMenu$$ExternalSyntheticLambda5(16, this, z));
                    alertDialogCreateSimpleConfirmAlert.show();
                    if (z || (textView = (TextView) alertDialogCreateSimpleConfirmAlert.getButton(-1)) == null) {
                        return;
                    }
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    return;
                }
                ChatActivity$$ExternalSyntheticLambda286 chatActivity$$ExternalSyntheticLambda286 = this.doCommitRunnable;
                if (chatActivity$$ExternalSyntheticLambda286 != null) {
                    chatActivity$$ExternalSyntheticLambda286.run();
                }
                this.doCommitRunnable = null;
                AlertDialog alertDialog = new AlertDialog(this.context, 3, this.resourcesProvider);
                this.progressDialog = alertDialog;
                alertDialog.setOnCancelListener(new LinkManager$$ExternalSyntheticLambda17(this, 10));
                AlertDialog alertDialog2 = this.progressDialog;
                AndroidUtilities.cancelRunOnUIThread(alertDialog2.showRunnable);
                AndroidUtilities.runOnUIThread(alertDialog2.showRunnable, 500L);
                this.reqId = MessagesController.getInstance(this.currentAccount).resolveCommunityAllJoinPendingRequests(this.communityId, !z, new CommunityUtils$PendingRequests$$ExternalSyntheticLambda2(this, 0));
            }
        }

        public final void onResolveJoinRequest(long j, boolean z) {
            int i;
            this.hiddenJoinRequests.put(null, j);
            int i2 = 1;
            this.totalCount--;
            calcUnreadPendingRequests();
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.updateAdapter();
            }
            int i3 = z ? R.string.CommunityRequestApprovedToast : R.string.CommunityRequestDeclinedToast;
            int i4 = this.currentAccount;
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i3, DialogObject.getShortName(i4, j)));
            ChatActivity$$ExternalSyntheticLambda286 chatActivity$$ExternalSyntheticLambda286 = this.doCommitRunnable;
            if (chatActivity$$ExternalSyntheticLambda286 != null) {
                chatActivity$$ExternalSyntheticLambda286.run();
            }
            this.doCommitRunnable = new ChatActivity$$ExternalSyntheticLambda286(this, j, z, 6);
            Context context = this.context;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Bulletin.UsersLayout usersLayout = new Bulletin.UsersLayout(context, resourcesProvider, false);
            TLObject userOrChat = MessagesController.getInstance(i4).getUserOrChat(j);
            AvatarsImageView avatarsImageView = usersLayout.avatarsImageView;
            if (userOrChat != null) {
                avatarsImageView.setCount(1);
                avatarsImageView.avatarsDrawable.setObject(0, userOrChat, UserConfig.selectedAccount);
                i = 1;
            } else {
                i = 0;
            }
            avatarsImageView.setTranslationX(AndroidUtilities.dp(7.0f));
            avatarsImageView.setScaleX(1.333f);
            avatarsImageView.setScaleY(1.333f);
            avatarsImageView.avatarsDrawable.commitTransition(false, true);
            LinkSpanDrawable.LinksTextView linksTextView = usersLayout.textView;
            linksTextView.setSingleLine(false);
            linksTextView.setMaxLines(2);
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setText(spannableStringBuilderReplaceTags);
            if (linksTextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int iDp = AndroidUtilities.dp(74 - ((3 - i) * 12));
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) linksTextView.getLayoutParams()).rightMargin = iDp;
                } else {
                    ((ViewGroup.MarginLayoutParams) linksTextView.getLayoutParams()).leftMargin = iDp;
                }
            }
            if (LocaleController.isRTL) {
                avatarsImageView.setTranslationX(AndroidUtilities.dp(32 - ((i - 1) * 12)));
            }
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context, resourcesProvider, true, true);
            String string = LocaleController.getString(R.string.UndoNoCaps);
            TextView textView = undoButton.undoTextView;
            if (textView != null) {
                textView.setText(string);
            }
            undoButton.undoAction = new RichEditor$$ExternalSyntheticLambda57(this, j, i2);
            undoButton.delayedAction = this.doCommitRunnable;
            usersLayout.setButton(undoButton);
            this.bulletinFactory.create(usersLayout, 5000).show();
        }
    }

    public static SpannableStringBuilder buildServiceMessageText(MessageObject messageObject, String str, String str2, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        boolean z3 = DialogObject.getPeerDialogId(message.peer_id) == DialogObject.getPeerDialogId(message.from_id);
        boolean z4 = tL_messageActionChangeCommunity.community_id == 0;
        if (z3) {
            if (z4) {
                if (z2) {
                    i6 = R.string.CommunityServiceMessageBotRemovedUnknown;
                } else {
                    i6 = z ? R.string.CommunityServiceMessageChannelRemovedUnknown : R.string.CommunityServiceMessageGroupRemovedUnknown;
                }
                return AndroidUtilities.replaceTags(LocaleController.getString(i6));
            }
            if (z2) {
                i5 = R.string.CommunityServiceMessageBotAddedUnknown;
            } else {
                i5 = z ? R.string.CommunityServiceMessageChannelAddedUnknown : R.string.CommunityServiceMessageGroupAddedUnknown;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i5, str));
        }
        if (messageObject.isOut()) {
            if (z4) {
                if (z2) {
                    i4 = R.string.CommunityServiceMessageBotYouRemoved;
                } else {
                    i4 = z ? R.string.CommunityServiceMessageChannelYouRemoved : R.string.CommunityServiceMessageGroupYouRemoved;
                }
                return AndroidUtilities.replaceTags(LocaleController.getString(i4));
            }
            if (z2) {
                i3 = R.string.CommunityServiceMessageBotYouAdded;
            } else {
                i3 = z ? R.string.CommunityServiceMessageChannelYouAdded : R.string.CommunityServiceMessageGroupYouAdded;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i3, str));
        }
        if (z4) {
            if (z2) {
                i2 = R.string.CommunityServiceMessageBotRemoved;
            } else {
                i2 = z ? R.string.CommunityServiceMessageChannelRemoved : R.string.CommunityServiceMessageGroupRemoved;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i2, str2));
        }
        if (z2) {
            i = R.string.CommunityServiceMessageBotAdded;
        } else {
            i = z ? R.string.CommunityServiceMessageChannelAdded : R.string.CommunityServiceMessageGroupAdded;
        }
        return AndroidUtilities.replaceTags(LocaleController.formatString(i, str2, str));
    }

    public static int getCommunityChatType(int i, long j) {
        long j2;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j > 0) {
            user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            if (user == null) {
                return 0;
            }
            j2 = user.linked_community_id;
            chat = null;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            if (chat2 == null) {
                return 0;
            }
            j2 = chat2.linked_community_id;
            chat = chat2;
            user = null;
        }
        if (j2 != 0 && (chatFull = MessagesController.getInstance(i).getChatFull(j2)) != null && (arrayList = chatFull.linked_peers) != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                i2++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (DialogObject.getPeerDialogId(communityPeer2.peer) == j) {
                    return getCommunityChatType(communityPeer2, chat, user, user != null ? MessagesController.getInstance(i).getDialog(user.id) : null);
                }
            }
        }
        return 0;
    }

    public static void onCommunityLinkSuccess(BaseFragment baseFragment, long j, int i) {
        INavigationLayout parentLayout;
        ChatActivity chatActivity;
        int size;
        boolean zIsChannelAndNotMegaGroup;
        int size2;
        List<BaseFragment> list = null;
        if (AndroidUtilities.isTablet()) {
            parentLayout = null;
            chatActivity = null;
        } else {
            parentLayout = baseFragment.getParentLayout();
            if (parentLayout != null) {
                List<BaseFragment> fragmentStack = ((ActionBarLayout) parentLayout).getFragmentStack();
                size = fragmentStack.size() - 2;
                while (true) {
                    if (size >= 0) {
                        BaseFragment baseFragment2 = fragmentStack.get(size);
                        if (baseFragment2 instanceof ChatActivity) {
                            chatActivity = (ChatActivity) baseFragment2;
                            if (chatActivity.getDialogId() == j) {
                                list = fragmentStack;
                                break;
                            }
                        }
                        size--;
                    } else {
                        chatActivity = null;
                        list = fragmentStack;
                    }
                }
                zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(j, baseFragment.getCurrentAccount());
                if (size != -1) {
                    if (!(baseFragment instanceof DialogsActivity)) {
                        baseFragment.finishFragment();
                    }
                    showCommunityLinkSuccessToast(BulletinFactory.global(), i, zIsChannelAndNotMegaGroup);
                    return;
                }
                for (size2 = list.size() - 2; size2 > size; size2--) {
                    BaseFragment baseFragment3 = list.get(size2);
                    parentLayout.getClass();
                    ((ActionBarLayout) parentLayout).removeFragmentFromStack(baseFragment3, false);
                }
                baseFragment.finishFragment();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda9(i, chatActivity, zIsChannelAndNotMegaGroup), 250L);
            }
            chatActivity = null;
        }
        size = -1;
        zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(j, baseFragment.getCurrentAccount());
        if (size != -1) {
            if (!(baseFragment instanceof DialogsActivity)) {
                baseFragment.finishFragment();
            }
            showCommunityLinkSuccessToast(BulletinFactory.global(), i, zIsChannelAndNotMegaGroup);
            return;
        }
        while (size2 > size) {
            BaseFragment baseFragment4 = list.get(size2);
            parentLayout.getClass();
            ((ActionBarLayout) parentLayout).removeFragmentFromStack(baseFragment4, false);
        }
        baseFragment.finishFragment();
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda9(i, chatActivity, zIsChannelAndNotMegaGroup), 250L);
    }

    public static void showChatsToAddToCommunity(final AlertDialog[] alertDialogArr, BaseFragment baseFragment, final int i, TLRPC.Chat chat) {
        if (alertDialogArr[0] != null) {
            return;
        }
        final int iFetchChatsToAddToCommunity = MessagesController.getInstance(i).fetchChatsToAddToCommunity(new ArticleViewer$$ExternalSyntheticLambda57(alertDialogArr, baseFragment, i, chat, 7));
        ConnectionsManager.getInstance(i).bindRequestToGuid(iFetchChatsToAddToCommunity, baseFragment.getClassGuid());
        AlertDialog alertDialog = new AlertDialog(baseFragment.getContext(), 3, null);
        alertDialogArr[0] = alertDialog;
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
        alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                ConnectionsManager.getInstance(i).cancelRequest(iFetchChatsToAddToCommunity, true);
                alertDialogArr[0] = null;
            }
        });
    }

    public static void showCommunityLinkSuccessToast(BulletinFactory bulletinFactory, int i, boolean z) {
        String string;
        int i2 = i == 2 ? R.raw.timer_toast : R.raw.contact_check;
        int i3 = i == 2 ? 24 : 36;
        if (i == 0) {
            string = LocaleController.getString(R.string.CommunityCommunityCreated);
        } else if (i == 1) {
            string = LocaleController.getString(z ? R.string.CommunityCommunityJoinedChannel : R.string.CommunityCommunityJoinedGroup);
        } else {
            string = LocaleController.getString(R.string.CommunityCommunityPending);
        }
        bulletinFactory.createSimpleBulletin(i2, i3, string).show();
    }

    public static int getCommunityChatType(TL_communities.CommunityPeer communityPeer, TLRPC.Chat chat, TLRPC.User user, TLRPC.Dialog dialog) {
        if (communityPeer == null) {
            return 0;
        }
        if (user != null) {
            return dialog != null ? 1 : 2;
        }
        if (chat == null) {
            return 0;
        }
        if (ChatObject.isInChat(chat)) {
            return 1;
        }
        if (ChatObject.isPublic(chat) || communityPeer.can_view_history) {
            return 2;
        }
        return ChatObject.isCommunityPeerHidden(communityPeer) ? 4 : 3;
    }
}
