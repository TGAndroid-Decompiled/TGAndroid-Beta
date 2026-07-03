package org.telegram.ui.community;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.community.sheet.CommunityChatsToAddSheet;

public abstract class CommunityUtils {
    public static void fillLinkedPeers(int i, ArrayList arrayList, long j, boolean z) {
        boolean z2;
        MessagesController.CommunityPeersDialog communityPeersDialogBuildCommunityPeers = MessagesController.getInstance(i).buildCommunityPeers(j);
        if (communityPeersDialogBuildCommunityPeers == null) {
            return;
        }
        if (communityPeersDialogBuildCommunityPeers.chatsYouAreIn.isEmpty()) {
            z2 = false;
        } else {
            arrayList.add(UItem.asHeader(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
            Iterator<MessagesController.CommunityPeerDialog> it = communityPeersDialogBuildCommunityPeers.chatsYouAreIn.iterator();
            while (it.hasNext()) {
                arrayList.add(DialogCellFactory.asCell(it.next().chat));
            }
            z2 = z;
        }
        if (!communityPeersDialogBuildCommunityPeers.chatsYouCanView.isEmpty()) {
            if (z2) {
                arrayList.add(UItem.asSpace(22, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(UItem.asHeader(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
            Iterator<MessagesController.CommunityPeerDialog> it2 = communityPeersDialogBuildCommunityPeers.chatsYouCanView.iterator();
            while (it2.hasNext()) {
                arrayList.add(DialogCellFactory.asCell(it2.next().chat));
            }
            z2 = z;
        }
        if (communityPeersDialogBuildCommunityPeers.chatsYouCanJoin.isEmpty()) {
            z = z2;
        } else {
            if (z2) {
                arrayList.add(UItem.asSpace(24, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(UItem.asHeader(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
            Iterator<MessagesController.CommunityPeerDialog> it3 = communityPeersDialogBuildCommunityPeers.chatsYouCanJoin.iterator();
            while (it3.hasNext()) {
                arrayList.add(DialogCellFactory.asCell(it3.next().chat));
            }
        }
        if (communityPeersDialogBuildCommunityPeers.chatsOther.isEmpty()) {
            return;
        }
        if (z) {
            arrayList.add(UItem.asSpace(26, AndroidUtilities.dp(12.0f)));
        }
        arrayList.add(UItem.asHeader(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
        Iterator<MessagesController.CommunityPeerDialog> it4 = communityPeersDialogBuildCommunityPeers.chatsOther.iterator();
        while (it4.hasNext()) {
            arrayList.add(DialogCellFactory.asCell(it4.next().chat));
        }
    }

    public static void fillPendingRequests(int i, ArrayList arrayList, ArrayList arrayList2, LongSparseArray longSparseArray, CommunityPendingRequestCell.ClickDelegate clickDelegate) {
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList2.get(i2);
            long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
            if (longSparseArray == null || !longSparseArray.containsKey(peerDialogId)) {
                long j = -peerDialogId;
                arrayList.add(CommunityPendingRequestCell.Factory.asPendingRequest(MessagesController.getInstance(i).getChat(Long.valueOf(j)), MessagesController.getInstance(i).getChatFull(j), MessagesController.getInstance(i).getUser(Long.valueOf(communityPeerRequest.requested_by)), !communityPeerRequest.visible, clickDelegate, i2 < size + (-1)));
            }
            i2++;
        }
    }

    public static class PendingRequests implements CommunityPendingRequestCell.ClickDelegate {
        private final BulletinFactory bulletinFactory;
        private TLRPC.Chat community;
        private final long communityId;
        private final Context context;
        private final int currentAccount;
        private Delegate delegate;
        private Runnable doCommitRunnable;
        private boolean finished;
        private long lastViewTime;
        private boolean loading;
        private String nextOffset;
        private AlertDialog progressDialog;
        private int reqId;
        private final Theme.ResourcesProvider resourcesProvider;
        private int totalCount;
        private int unreadPendingRequests;
        private final LongSparseArray hiddenJoinRequests = new LongSparseArray();
        private ArrayList pendingRequests = new ArrayList();

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
            this.lastViewTime = MessagesController.getMainSettings(i).getLong("community_requests_last_view_time_" + j, 0L);
        }

        public void setDelegate(Delegate delegate) {
            this.delegate = delegate;
        }

        public boolean isSingle() {
            ArrayList arrayList;
            return this.finished && this.totalCount == 1 && (arrayList = this.pendingRequests) != null && arrayList.size() == 1;
        }

        public void fillItems(ArrayList arrayList) {
            ArrayList arrayList2 = this.pendingRequests;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                return;
            }
            CommunityUtils.fillPendingRequests(this.currentAccount, arrayList, this.pendingRequests, this.hiddenJoinRequests, this);
            if (this.finished) {
                return;
            }
            arrayList.add(UItem.asFlicker(29));
        }

        public boolean isFinished() {
            return this.finished;
        }

        public int getTotalCount() {
            return this.totalCount;
        }

        public int getUnreadCount() {
            return this.unreadPendingRequests;
        }

        public void markAsViewed() {
            long currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            this.lastViewTime = currentTime;
            MessagesController.getMainSettings(this.currentAccount).edit().putLong("community_requests_last_view_time_" + this.communityId, currentTime).apply();
            calcUnreadPendingRequests();
        }

        private void calcUnreadPendingRequests() {
            this.unreadPendingRequests = 0;
            ArrayList arrayList = this.pendingRequests;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!this.hiddenJoinRequests.containsKey(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.pendingRequests.get(i)).peer))) {
                    if (r2.date <= this.lastViewTime) {
                        return;
                    } else {
                        this.unreadPendingRequests++;
                    }
                }
            }
        }

        public void loadNext() {
            if (this.loading || this.finished || !ChatObject.canUserDoAdminAction(this.community, 27)) {
                return;
            }
            this.loading = true;
            MessagesController.getInstance(this.currentAccount).fetchCommunityPendingJoinRequests(this.communityId, this.nextOffset, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$loadNext$0((TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                }
            });
        }

        public void lambda$loadNext$0(TL_communities.PeerLinkRequests peerLinkRequests, TLRPC.TL_error tL_error) {
            this.loading = false;
            if (peerLinkRequests != null) {
                ArrayList arrayList = this.pendingRequests;
                if (arrayList == null) {
                    this.pendingRequests = new ArrayList(peerLinkRequests.requests);
                } else {
                    arrayList.addAll(peerLinkRequests.requests);
                }
                String str = peerLinkRequests.next_offset;
                this.nextOffset = str;
                this.totalCount = peerLinkRequests.total_count;
                this.finished = str == null;
                calcUnreadPendingRequests();
                Delegate delegate = this.delegate;
                if (delegate != null) {
                    delegate.updateAdapter();
                }
            }
        }

        public void checkLoadNext(UniversalRecyclerView universalRecyclerView) {
            if (this.loading || this.finished || universalRecyclerView.layoutManager.findLastVisibleItemPosition() + 10 <= universalRecyclerView.adapter.getItemCount()) {
                return;
            }
            loadNext();
        }

        public void commit() {
            Runnable runnable = this.doCommitRunnable;
            if (runnable != null) {
                runnable.run();
            }
            this.doCommitRunnable = null;
        }

        private void onResolveJoinRequest(final long j, final boolean z) {
            int i;
            int i2;
            this.hiddenJoinRequests.put(j, null);
            this.totalCount--;
            calcUnreadPendingRequests();
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.updateAdapter();
            }
            if (z) {
                i = R.string.CommunityRequestApprovedToast;
            } else {
                i = R.string.CommunityRequestDeclinedToast;
            }
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i, DialogObject.getShortName(this.currentAccount, j)));
            commit();
            this.doCommitRunnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onResolveJoinRequest$2(j, z);
                }
            };
            Bulletin.UsersLayout usersLayout = new Bulletin.UsersLayout(this.context, false, this.resourcesProvider);
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (chat != null) {
                usersLayout.avatarsImageView.setCount(1);
                usersLayout.avatarsImageView.setObject(0, UserConfig.selectedAccount, chat);
                i2 = 1;
            } else {
                i2 = 0;
            }
            usersLayout.avatarsImageView.setTranslationX(AndroidUtilities.dp(7.0f));
            usersLayout.avatarsImageView.setScaleX(1.333f);
            usersLayout.avatarsImageView.setScaleY(1.333f);
            usersLayout.avatarsImageView.commitTransition(false);
            usersLayout.textView.setSingleLine(false);
            usersLayout.textView.setMaxLines(2);
            usersLayout.textView.setTextSize(1, 14.0f);
            usersLayout.textView.setText(spannableStringBuilderReplaceTags);
            if (usersLayout.textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int iDp = AndroidUtilities.dp(74 - ((3 - i2) * 12));
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) usersLayout.textView.getLayoutParams()).rightMargin = iDp;
                } else {
                    ((ViewGroup.MarginLayoutParams) usersLayout.textView.getLayoutParams()).leftMargin = iDp;
                }
            }
            if (LocaleController.isRTL) {
                usersLayout.avatarsImageView.setTranslationX(AndroidUtilities.dp(32 - ((i2 - 1) * 12)));
            }
            usersLayout.setButton(new Bulletin.UndoButton(this.context, true, false, this.resourcesProvider).setText(LocaleController.getString(R.string.UndoNoCaps)).setUndoAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onResolveJoinRequest$3(j);
                }
            }).setDelayedAction(this.doCommitRunnable));
            this.bulletinFactory.create(usersLayout, 5000).show();
        }

        public void lambda$onResolveJoinRequest$2(long j, boolean z) {
            this.doCommitRunnable = null;
            this.hiddenJoinRequests.remove(j);
            ArrayList arrayList = this.pendingRequests;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.pendingRequests.get(size)).peer) == j) {
                        this.pendingRequests.remove(size);
                    }
                }
            }
            calcUnreadPendingRequests();
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.updateAdapter();
            }
            MessagesController.getInstance(this.currentAccount).resolveCommunityJoinPendingRequest(this.communityId, j, !z, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$onResolveJoinRequest$1((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                }
            });
        }

        public void lambda$onResolveJoinRequest$1(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
            if (tL_error != null) {
                this.bulletinFactory.showForError(tL_error);
            }
        }

        public void lambda$onResolveJoinRequest$3(long j) {
            this.doCommitRunnable = null;
            this.hiddenJoinRequests.remove(j);
            this.totalCount++;
            calcUnreadPendingRequests();
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.updateAdapter();
            }
        }

        public void onResolveAllJoinRequests(boolean z) {
            onResolveAllJoinRequests(z, true);
        }

        private void onResolveAllJoinRequests(final boolean z, boolean z2) {
            TextView textView;
            if (this.progressDialog == null && this.reqId == 0) {
                if (z2) {
                    AlertDialog alertDialogCreateSimpleConfirmAlert = AlertsCreator.createSimpleConfirmAlert(this.context, this.resourcesProvider, LocaleController.getString(z ? R.string.CommunityAddAllChatsTitle : R.string.CommunityDeclineAllTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralString(z ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", this.totalCount, new Object[0])), LocaleController.getString(z ? R.string.Add : R.string.Decline), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onResolveAllJoinRequests$4(z);
                        }
                    });
                    alertDialogCreateSimpleConfirmAlert.show();
                    if (z || (textView = (TextView) alertDialogCreateSimpleConfirmAlert.getButton(-1)) == null) {
                        return;
                    }
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    return;
                }
                commit();
                AlertDialog alertDialog = new AlertDialog(this.context, 3, this.resourcesProvider);
                this.progressDialog = alertDialog;
                alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        this.f$0.lambda$onResolveAllJoinRequests$5(dialogInterface);
                    }
                });
                this.progressDialog.showDelayed(500L);
                this.reqId = MessagesController.getInstance(this.currentAccount).resolveCommunityAllJoinPendingRequests(this.communityId, !z, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        this.f$0.lambda$onResolveAllJoinRequests$6((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                    }
                });
            }
        }

        public void lambda$onResolveAllJoinRequests$4(boolean z) {
            onResolveAllJoinRequests(z, false);
        }

        public void lambda$onResolveAllJoinRequests$5(DialogInterface dialogInterface) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.progressDialog = null;
            this.reqId = 0;
        }

        public void lambda$onResolveAllJoinRequests$6(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
            this.progressDialog.dismiss();
            this.progressDialog = null;
            this.reqId = 0;
            if (tL_error != null) {
                this.bulletinFactory.showForError(tL_error);
                return;
            }
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.close();
            }
        }

        @Override
        public void onClickApprove(long j) {
            onResolveJoinRequest(j, true);
        }

        @Override
        public void onClickDecline(long j) {
            onResolveJoinRequest(j, false);
        }

        @Override
        public void onClickGroupOwner(long j) {
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.onClickGroupOwner(j);
            }
        }
    }

    public static void showChatsToAddToCommunity(final AlertDialog[] alertDialogArr, final BaseFragment baseFragment, final int i, final TLRPC.Chat chat) {
        if (alertDialogArr[0] != null) {
            return;
        }
        final int iFetchChatsToAddToCommunity = MessagesController.getInstance(i).fetchChatsToAddToCommunity(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                CommunityUtils.lambda$showChatsToAddToCommunity$0(alertDialogArr, baseFragment, i, chat, (ArrayList) obj, (TLRPC.TL_error) obj2);
            }
        });
        ConnectionsManager.getInstance(i).bindRequestToGuid(iFetchChatsToAddToCommunity, baseFragment.getClassGuid());
        AlertDialog alertDialog = new AlertDialog(baseFragment.getContext(), 3);
        alertDialogArr[0] = alertDialog;
        alertDialog.showDelayed(500L);
        alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                CommunityUtils.lambda$showChatsToAddToCommunity$1(i, iFetchChatsToAddToCommunity, alertDialogArr, dialogInterface);
            }
        });
    }

    public static void lambda$showChatsToAddToCommunity$0(AlertDialog[] alertDialogArr, BaseFragment baseFragment, int i, TLRPC.Chat chat, ArrayList arrayList, TLRPC.TL_error tL_error) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
            alertDialogArr[0] = null;
        }
        if (tL_error != null) {
            BulletinFactory.of(baseFragment).showForError(tL_error);
        } else if (arrayList != null) {
            if (arrayList.isEmpty()) {
                BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.info, LocaleController.getString(R.string.CommunityNoChatsToAdd)).show();
            } else {
                showChatsToAddSheet(baseFragment, i, chat, arrayList);
            }
        }
    }

    public static void lambda$showChatsToAddToCommunity$1(int i, int i2, AlertDialog[] alertDialogArr, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
        alertDialogArr[0] = null;
    }

    private static void showChatsToAddSheet(final BaseFragment baseFragment, final int i, final TLRPC.Chat chat, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            baseFragment.showDialog(new CommunityChatsToAddSheet(baseFragment.getContext(), arrayList, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    CommunityUtils.lambda$showChatsToAddSheet$3(baseFragment, chat, i, (TLRPC.Chat) obj);
                }
            }));
        } else {
            BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.info, "").show();
        }
    }

    public static void lambda$showChatsToAddSheet$3(final BaseFragment baseFragment, final TLRPC.Chat chat, final int i, final TLRPC.Chat chat2) {
        baseFragment.showDialog(new CommunityAddOptionsSheet(baseFragment.getContext(), chat, chat2, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                CommunityUtils.lambda$showChatsToAddSheet$2(baseFragment, i, chat2, chat, (Boolean) obj);
            }
        }));
    }

    public static void lambda$showChatsToAddSheet$2(BaseFragment baseFragment, int i, TLRPC.Chat chat, TLRPC.Chat chat2, Boolean bool) {
        linkToCommunityAndConvertIfNeeded(baseFragment, i, chat, chat2.id, bool.booleanValue());
    }

    public static void linkToCommunityAndConvertIfNeeded(final BaseFragment baseFragment, final int i, TLRPC.Chat chat, final long j, final boolean z) {
        if (!ChatObject.isChannel(chat)) {
            final AlertDialog alertDialog = new AlertDialog(baseFragment.getContext(), 3);
            alertDialog.showDelayed(250L);
            MessagesController.getInstance(i).convertToMegaGroup(baseFragment.getParentActivity(), chat.id, baseFragment, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j2) {
                    CommunityUtils.lambda$linkToCommunityAndConvertIfNeeded$4(alertDialog, baseFragment, i, j, z, j2);
                }
            });
            return;
        }
        linkToCommunityWithoutConvert(baseFragment, i, chat.id, j, z);
    }

    public static void lambda$linkToCommunityAndConvertIfNeeded$4(AlertDialog alertDialog, BaseFragment baseFragment, int i, long j, boolean z, long j2) {
        alertDialog.dismiss();
        if (j2 == 0) {
            return;
        }
        linkToCommunityWithoutConvert(baseFragment, i, j2, j, z);
    }

    public static void linkToCommunityWithoutConvert(final BaseFragment baseFragment, int i, final long j, long j2, boolean z) {
        MessagesController.getInstance(i).linkCommunity(-j, j2, z, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                CommunityUtils.lambda$linkToCommunityWithoutConvert$5(baseFragment, j, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void lambda$linkToCommunityWithoutConvert$5(BaseFragment baseFragment, long j, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                onCommunityLinkSuccess(baseFragment, -j, 2);
                return;
            } else {
                BulletinFactory.of(baseFragment).showForError(tL_error);
                return;
            }
        }
        onCommunityLinkSuccess(baseFragment, -j, 1);
    }

    public static void onCommunityLinkSuccess(BaseFragment baseFragment, long j, final int i) {
        INavigationLayout parentLayout;
        final ChatActivity chatActivity;
        int size;
        List list = null;
        if (AndroidUtilities.isTablet()) {
            parentLayout = null;
            chatActivity = null;
        } else {
            parentLayout = baseFragment.getParentLayout();
            if (parentLayout != null) {
                List fragmentStack = parentLayout.getFragmentStack();
                size = fragmentStack.size() - 2;
                while (size >= 0) {
                    BaseFragment baseFragment2 = (BaseFragment) fragmentStack.get(size);
                    if (baseFragment2 instanceof ChatActivity) {
                        chatActivity = (ChatActivity) baseFragment2;
                        if (chatActivity.getDialogId() == j) {
                            list = fragmentStack;
                            break;
                        }
                    }
                    size--;
                }
                chatActivity = null;
                list = fragmentStack;
            } else {
                chatActivity = null;
            }
        }
        size = -1;
        final boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(j, baseFragment.getCurrentAccount());
        if (size != -1) {
            for (int size2 = list.size() - 2; size2 > size; size2--) {
                parentLayout.removeFragmentFromStack((BaseFragment) list.get(size2));
            }
            baseFragment.finishFragment();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() throws Resources.NotFoundException, IOException, NumberFormatException {
                    CommunityUtils.lambda$onCommunityLinkSuccess$6(i, chatActivity, zIsChannelAndNotMegaGroup);
                }
            }, 250L);
            return;
        }
        if (!(baseFragment instanceof DialogsActivity)) {
            baseFragment.finishFragment();
        }
        showCommunityLinkSuccessToast(BulletinFactory.global(), i, zIsChannelAndNotMegaGroup);
    }

    public static void lambda$onCommunityLinkSuccess$6(int i, ChatActivity chatActivity, boolean z) throws Resources.NotFoundException, IOException, NumberFormatException {
        if (i != 2) {
            chatActivity.onPageDownClicked();
            chatActivity.startFireworks();
        }
        showCommunityLinkSuccessToast(BulletinFactory.of(chatActivity), i, z);
    }

    public static void showCommunityLinkSuccessToast(BulletinFactory bulletinFactory, int i, boolean z) {
        String string;
        int i2;
        int i3 = i == 2 ? R.raw.timer_toast : R.raw.contact_check;
        int i4 = i == 2 ? 24 : 36;
        if (i == 0) {
            string = LocaleController.getString(R.string.CommunityCommunityCreated);
        } else if (i == 1) {
            if (z) {
                i2 = R.string.CommunityCommunityJoinedChannel;
            } else {
                i2 = R.string.CommunityCommunityJoinedGroup;
            }
            string = LocaleController.getString(i2);
        } else {
            string = LocaleController.getString(R.string.CommunityCommunityPending);
        }
        bulletinFactory.createSimpleBulletin(i3, string, i4).show();
    }

    public static CommunityChatType getCommunityChatType(int i, TLRPC.Chat chat) {
        TLRPC.ChatFull chatFull;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (chat != null && chat.linked_community_id != 0 && (chatFull = MessagesController.getInstance(i).getChatFull(chat.linked_community_id)) != null && (arrayList = chatFull.linked_peers) != null) {
            Iterator<TL_communities.CommunityPeer> it = arrayList.iterator();
            while (it.hasNext()) {
                TL_communities.CommunityPeer next = it.next();
                if (DialogObject.getPeerDialogId(next.peer) == (-chat.id)) {
                    return getCommunityChatType(chat, next);
                }
            }
        }
        return null;
    }

    public static CommunityChatType getCommunityChatType(TLRPC.Chat chat, TL_communities.CommunityPeer communityPeer) {
        if (chat == null || communityPeer == null) {
            return null;
        }
        if (ChatObject.isInChat(chat)) {
            return CommunityChatType.YouAreIn;
        }
        if (ChatObject.isPublic(chat) || communityPeer.can_view_history) {
            return CommunityChatType.YouCanView;
        }
        if (ChatObject.isCommunityPeerHidden(communityPeer)) {
            return CommunityChatType.HiddenUnavailable;
        }
        return CommunityChatType.YouCanSendJoinRequest;
    }

    public static CharSequence buildServiceMessageText(MessageObject messageObject, String str, String str2, boolean z) {
        int i;
        String string;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        boolean z2 = DialogObject.getPeerDialogId(message.peer_id) == DialogObject.getPeerDialogId(message.from_id);
        boolean z3 = tL_messageActionChangeCommunity.community_id == 0;
        if (z2) {
            if (z3) {
                if (z) {
                    i6 = R.string.CommunityServiceMessageChannelRemovedUnknown;
                } else {
                    i6 = R.string.CommunityServiceMessageGroupRemovedUnknown;
                }
                return AndroidUtilities.replaceTags(LocaleController.getString(i6));
            }
            if (z) {
                i5 = R.string.CommunityServiceMessageChannelAddedUnknown;
            } else {
                i5 = R.string.CommunityServiceMessageGroupAddedUnknown;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i5, str));
        }
        if (messageObject.isOut()) {
            if (z3) {
                if (z) {
                    i4 = R.string.CommunityServiceMessageChannelYouRemoved;
                } else {
                    i4 = R.string.CommunityServiceMessageGroupYouRemoved;
                }
                string = LocaleController.getString(i4);
            } else {
                if (z) {
                    i3 = R.string.CommunityServiceMessageChannelYouAdded;
                } else {
                    i3 = R.string.CommunityServiceMessageGroupYouAdded;
                }
                string = LocaleController.formatString(i3, str);
            }
        } else if (z3) {
            if (z) {
                i2 = R.string.CommunityServiceMessageChannelRemoved;
            } else {
                i2 = R.string.CommunityServiceMessageGroupRemoved;
            }
            string = LocaleController.formatString(i2, str2);
        } else {
            if (z) {
                i = R.string.CommunityServiceMessageChannelAdded;
            } else {
                i = R.string.CommunityServiceMessageGroupAdded;
            }
            string = LocaleController.formatString(i, str2, str);
        }
        return AndroidUtilities.replaceTags(string);
    }

    public static class DialogCellFactory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new DialogCellFactory());
        }

        @Override
        public boolean equals(UItem uItem, UItem uItem2) {
            return uItem.id == uItem2.id;
        }

        @Override
        public boolean contentsEquals(UItem uItem, UItem uItem2) {
            return equals(uItem, uItem2);
        }

        @Override
        public DialogCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            DialogCell dialogCell = new DialogCell(null, context, false, false, i, resourcesProvider);
            dialogCell.insideCommunityList = true;
            return dialogCell;
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            DialogCell dialogCell = (DialogCell) view;
            TLRPC.Chat chat = (TLRPC.Chat) uItem.object;
            dialogCell.isHiddenInCommunity = ChatObject.isChatHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.id);
            dialogCell.insideCommunityListNoDialog = dialog == null;
            if (dialog != null) {
                dialogCell.setCustomMessageWithoutRebuild(null);
                dialogCell.setDialog(dialog, 0, 0);
            } else {
                dialogCell.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
                dialogCell.setDialog(-chat.id, null, 0, false, false);
            }
        }

        public static UItem asCell(TLRPC.Chat chat) {
            UItem uItemOfFactory = UItem.ofFactory(DialogCellFactory.class);
            uItemOfFactory.id = chat != null ? SessionDetails$$ExternalSyntheticBackport0.m(chat.id) : 0;
            uItemOfFactory.object = chat;
            return uItemOfFactory;
        }
    }
}
