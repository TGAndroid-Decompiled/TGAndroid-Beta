package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.FBool;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.Cells.SharedLinkCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda342;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda35;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.ThemeActivity;

public final class ChatActivity$$ExternalSyntheticLambda124 implements AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final long f$4;

    public ChatActivity$$ExternalSyntheticLambda124(Object obj, KeyEvent.Callback callback, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = (NotificationCenter.NotificationCenterDelegate) obj;
        this.f$1 = callback;
        this.f$2 = obj2;
        this.f$4 = j;
        this.f$3 = obj3;
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$showOpenGameAlert$373((TLRPC.TL_game) this.f$1, (MessageObject) this.f$2, (String) this.f$3, this.f$4);
                break;
            default:
                TopicsTabsView topicsTabsView = (TopicsTabsView) this.f$0;
                topicsTabsView.getClass();
                ArrayList arrayList = (ArrayList) this.f$1;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    long j = this.f$4;
                    if (i2 >= size) {
                        HashSet hashSet = topicsTabsView.excludeTopics;
                        HashSet hashSet2 = (HashSet) this.f$2;
                        hashSet.addAll(hashSet2);
                        topicsTabsView.updateTabs$1();
                        BulletinFactory.of(topicsTabsView.fragment).createUndoBulletin(LocaleController.getPluralString("TopicsDeleted", hashSet2.size()), false, new LaunchActivity$$ExternalSyntheticLambda121(topicsTabsView, hashSet2, arrayList, j, 27), new ShareAlert$$ExternalSyntheticLambda29(topicsTabsView, arrayList, (QrActivity$5$$ExternalSyntheticLambda1) this.f$3, 25)).show();
                        alertDialog.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (j == ((Integer) obj).intValue()) {
                            topicsTabsView.selectTopic(0L, false);
                        }
                    }
                }
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, final float f, final float f2) throws Throwable {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long peerId;
        int iIntValue = i;
        final SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) this.f$0;
        SharedMediaLayout.AnonymousClass16 anonymousClass16 = (SharedMediaLayout.AnonymousClass16) this.f$1;
        int i2 = anonymousClass16.selectedType;
        BaseFragment baseFragment = sharedMediaLayout.profileActivity;
        if (i2 == 7) {
            if (view instanceof UserCell) {
                SharedMediaLayout.ChatUsersAdapter chatUsersAdapter = sharedMediaLayout.chatUsersAdapter;
                if (!chatUsersAdapter.sortedUsers.isEmpty()) {
                    iIntValue = ((Integer) chatUsersAdapter.sortedUsers.get(iIntValue)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = chatUsersAdapter.chatInfo.participants.participants.get(iIntValue);
                if (iIntValue < 0 || iIntValue >= chatUsersAdapter.chatInfo.participants.participants.size()) {
                    return;
                }
                sharedMediaLayout.onMemberClick(chatParticipant, false, view);
                return;
            }
            RecyclerView.Adapter adapter = anonymousClass16.listView.getAdapter();
            SharedMediaLayout.GroupUsersSearchAdapter groupUsersSearchAdapter = sharedMediaLayout.groupUsersSearchAdapter;
            if (adapter == groupUsersSearchAdapter) {
                TLObject item = groupUsersSearchAdapter.getItem(iIntValue);
                if (item instanceof TLRPC.ChannelParticipant) {
                    peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) item).peer);
                } else if (!(item instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    peerId = ((TLRPC.ChatParticipant) item).user_id;
                }
                if (peerId == 0 || peerId == baseFragment.getUserConfig().getClientUserId()) {
                    return;
                }
                baseFragment.presentFragment(new ProfileActivity(FBool.m(peerId, "user_id"), null));
                return;
            }
            return;
        }
        if (i2 == 6 && (view instanceof ProfileSearchCell)) {
            TLRPC.Chat chat = ((ProfileSearchCell) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (baseFragment.getMessagesController().checkCanOpenChat(bundle, baseFragment)) {
                if (!chat.forum) {
                    baseFragment.presentFragment(new ChatActivity(bundle));
                    return;
                } else {
                    HashSet hashSet = TopicsFragment.settingsPreloaded;
                    baseFragment.presentFragment(TopicsFragment.getTopicsOrChat(baseFragment.getMessagesController(), baseFragment.getMessagesStorage(), bundle));
                    return;
                }
            }
            return;
        }
        if (i2 == 1 && (view instanceof SharedDocumentCell)) {
            sharedMediaLayout.onItemClick(iIntValue, (FrameLayout) view, ((SharedDocumentCell) view).getMessage(), anonymousClass16.selectedType);
            return;
        }
        if (i2 == 3 && (view instanceof SharedLinkCell)) {
            sharedMediaLayout.onItemClick(iIntValue, (FrameLayout) view, ((SharedLinkCell) view).getMessage(), anonymousClass16.selectedType);
            return;
        }
        if ((i2 == 2 || i2 == 4) && (view instanceof SharedAudioCell)) {
            sharedMediaLayout.onItemClick(iIntValue, (FrameLayout) view, ((SharedAudioCell) view).getMessage(), anonymousClass16.selectedType);
            return;
        }
        if (i2 == 5 && (view instanceof ContextLinkCell)) {
            sharedMediaLayout.onItemClick(iIntValue, (FrameLayout) view, (MessageObject) ((ContextLinkCell) view).getParentObject(), anonymousClass16.selectedType);
            return;
        }
        if (i2 == 0 && (view instanceof SharedPhotoVideoCell2)) {
            final SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
            MessageObject messageObject = sharedPhotoVideoCell2.getMessageObject();
            if (messageObject == null || !messageObject.isSensitive()) {
                MessageObject messageObject2 = sharedPhotoVideoCell2.currentMessageObject;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && sharedPhotoVideoCell2.spoilerRevealProgress == 0.0f && !sharedPhotoVideoCell2.currentMessageObject.isMediaSpoilersRevealedInSharedMedia) {
                    sharedPhotoVideoCell2.startRevealMedia(f, f2);
                    return;
                } else {
                    if (messageObject != null) {
                        sharedMediaLayout.onItemClick(iIntValue, (FrameLayout) view, messageObject, anonymousClass16.selectedType);
                        return;
                    }
                    return;
                }
            }
            if (baseFragment == null) {
                return;
            }
            final int currentAccount = baseFragment.getCurrentAccount();
            final MessagesController messagesController = MessagesController.getInstance(currentAccount);
            final Context context = (Context) this.f$2;
            final AlertDialog alertDialog = new AlertDialog(context, 3, null);
            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 200L);
            messagesController.getContentSettings(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    BaseFragment baseFragment2;
                    final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                    SharedMediaLayout sharedMediaLayout2 = sharedMediaLayout;
                    alertDialog.dismissUnless(200L);
                    final MessagesController messagesController2 = messagesController;
                    final boolean z = messagesController2.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController2.verifyAgeBotUsername);
                    boolean z2 = (contentsettings == null || !contentsettings.sensitive_can_change) && z;
                    final boolean[] zArr = new boolean[1];
                    final Context context2 = context;
                    FrameLayout frameLayout = new FrameLayout(context2);
                    BaseFragment baseFragment3 = sharedMediaLayout2.profileActivity;
                    if (z) {
                        zArr[0] = true;
                    } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                        CheckBoxCell checkBoxCell = new CheckBoxCell(context2, 1, 17, false, baseFragment3 == null ? null : baseFragment3.getResourceProvider());
                        checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
                        checkBoxCell.setText(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                        checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                        frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        checkBoxCell.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(10, zArr));
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(context2, 0, baseFragment3 == null ? null : baseFragment3.getResourceProvider());
                    String string = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                    AlertDialog alertDialog2 = builder.alertDialog;
                    alertDialog2.title = string;
                    alertDialog2.message = LocaleController.getString(z2 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                    builder.setView(frameLayout);
                    alertDialog2.customViewOffset = 9;
                    builder.setNegativeButton(LocaleController.getString(z2 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                    if (z2) {
                        baseFragment2 = baseFragment3;
                    } else {
                        String string2 = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                        final float f3 = f2;
                        final int i3 = currentAccount;
                        final SharedPhotoVideoCell2 sharedPhotoVideoCell3 = sharedPhotoVideoCell2;
                        final float f4 = f;
                        baseFragment2 = baseFragment3;
                        builder.setPositiveButton(string2, new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog3, int i4) {
                                TL_account.contentSettings contentsettings2;
                                SharedMediaLayout$$ExternalSyntheticLambda65 sharedMediaLayout$$ExternalSyntheticLambda65 = new SharedMediaLayout$$ExternalSyntheticLambda65(sharedPhotoVideoCell3, f4, f3);
                                if (!zArr[0]) {
                                    sharedMediaLayout$$ExternalSyntheticLambda65.run(Boolean.FALSE);
                                    return;
                                }
                                if (!z && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                    sharedMediaLayout$$ExternalSyntheticLambda65.run(Boolean.TRUE);
                                } else {
                                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                    ThemeActivity.verifyAge(i3, context2, new OAuthSheet$$ExternalSyntheticLambda13(3, messagesController2, sharedMediaLayout$$ExternalSyntheticLambda65), safeLastFragment == null ? null : safeLastFragment.getResourceProvider());
                                }
                            }
                        });
                    }
                    if (baseFragment2 == null || baseFragment2.getContext() == null) {
                        builder.show();
                    } else {
                        baseFragment2.showDialog(alertDialog2);
                    }
                }
            });
            return;
        }
        if (SharedMediaLayout.isAnyStoryPageType(i2) && (view instanceof SharedPhotoVideoCell2)) {
            MessageObject messageObject3 = ((SharedPhotoVideoCell2) view).getMessageObject();
            if (messageObject3 != null) {
                sharedMediaLayout.onItemClick(iIntValue, (FrameLayout) view, messageObject3, anonymousClass16.selectedType);
                return;
            }
            return;
        }
        int i3 = anonymousClass16.selectedType;
        if (i3 == 10) {
            if (((view instanceof ProfileSearchCell) || f2 < AndroidUtilities.dp(60.0f)) && iIntValue >= 0) {
                SharedMediaLayout.ChannelRecommendationsAdapter channelRecommendationsAdapter = sharedMediaLayout.channelRecommendationsAdapter;
                if (iIntValue < channelRecommendationsAdapter.chats.size()) {
                    Bundle bundle2 = new Bundle();
                    TLObject tLObject = (TLObject) channelRecommendationsAdapter.chats.get(iIntValue);
                    if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    } else if (!(tLObject instanceof TLRPC.User)) {
                        return;
                    } else {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    }
                    baseFragment.presentFragment(new ChatActivity(bundle2));
                    return;
                }
                return;
            }
            return;
        }
        if (i3 != 11) {
            if (i3 == 15 && (view instanceof ChatMessageCell)) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                MessageObject messageObject4 = chatMessageCell.getMessageObject();
                anonymousClass16.listView.stopScroll();
                int currentAccount2 = baseFragment.getCurrentAccount();
                MessagesController messagesController2 = baseFragment.getMessagesController();
                long j = this.f$4;
                TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j));
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$3;
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(anonymousClass16, resourcesProvider, chatMessageCell);
                itemOptionsMakeOptions.offsetByContainer = true;
                itemOptionsMakeOptions.setGravity(messageObject4.isOutOwner() ? 5 : 3);
                itemOptionsMakeOptions.add(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new PollItemMenu$$ExternalSyntheticLambda12(sharedMediaLayout, j, messageObject4, 14), false);
                if (!messageObject4.isPollClosed()) {
                    if (messageObject4.canUnvote()) {
                        itemOptionsMakeOptions.add(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new SharedMediaLayout$$ExternalSyntheticLambda35(sharedMediaLayout, resourcesProvider, currentAccount2, messageObject4), false);
                    }
                    if (!messageObject4.isForwarded() && ((messageObject4.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                        itemOptionsMakeOptions.add(R.drawable.msg_pollstop, LocaleController.getString(messageObject4.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new SharedMediaLayout$$ExternalSyntheticLambda35(sharedMediaLayout, resourcesProvider, messageObject4, currentAccount2), false);
                    }
                }
                itemOptionsMakeOptions.show();
                return;
            }
            return;
        }
        RecyclerView.Adapter adapter2 = anonymousClass16.listView.getAdapter();
        SharedMediaLayout.SavedMessagesSearchAdapter savedMessagesSearchAdapter = sharedMediaLayout.savedMessagesSearchAdapter;
        if (adapter2 != savedMessagesSearchAdapter) {
            boolean z = sharedMediaLayout.isActionModeShowed;
            SharedMediaLayout.SavedDialogsAdapter savedDialogsAdapter = sharedMediaLayout.savedDialogsAdapter;
            if (z) {
                if (savedDialogsAdapter.itemTouchHelper.mActionState == 0) {
                    savedDialogsAdapter.select(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (iIntValue < 0 || iIntValue >= savedDialogsAdapter.dialogs.size()) {
                return;
            }
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) savedDialogsAdapter.dialogs.get(iIntValue);
            bundle3.putLong("user_id", baseFragment.getUserConfig().getClientUserId());
            bundle3.putInt("chatMode", 3);
            ChatActivity chatActivity = new ChatActivity(bundle3);
            chatActivity.threadMessageId = savedDialog.dialogId;
            baseFragment.presentFragment(chatActivity);
            return;
        }
        if (iIntValue < 0) {
            return;
        }
        int size = savedMessagesSearchAdapter.dialogs.size();
        ArrayList arrayList = savedMessagesSearchAdapter.dialogs;
        if (iIntValue < size) {
            SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(iIntValue);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", baseFragment.getUserConfig().getClientUserId());
            bundle4.putInt("chatMode", 3);
            ChatActivity chatActivity2 = new ChatActivity(bundle4);
            chatActivity2.threadMessageId = savedDialog2.dialogId;
            baseFragment.presentFragment(chatActivity2);
            return;
        }
        final int size2 = iIntValue - arrayList.size();
        ArrayList arrayList2 = savedMessagesSearchAdapter.messages;
        if (size2 < arrayList2.size()) {
            MessageObject messageObject5 = (MessageObject) arrayList2.get(size2);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", baseFragment.getUserConfig().getClientUserId());
            bundle5.putInt("message_id", messageObject5.getId());
            ChatActivity chatActivity3 = new ChatActivity(bundle5) {
                public boolean firstCreateView = true;
                public final int val$pos;

                public AnonymousClass23(Bundle bundle6) {
                    super(bundle6);
                    i = size2;
                    this.firstCreateView = true;
                }

                @Override
                public final void onTransitionAnimationStart(boolean z2, boolean z3) {
                    if (this.firstCreateView) {
                        ActionBarMenuItem actionBarMenuItem = this.searchItem;
                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                        SavedMessagesSearchAdapter savedMessagesSearchAdapter2 = sharedMediaLayout2.savedMessagesSearchAdapter;
                        if (actionBarMenuItem != null) {
                            openSearchWithText("");
                            this.searchItem.setSearchFieldText(savedMessagesSearchAdapter2.lastQuery, false);
                        }
                        ChatActivity.AnonymousClass52 anonymousClass52 = this.actionBarSearchTags;
                        if (anonymousClass52 != null) {
                            anonymousClass52.setChosen(savedMessagesSearchAdapter2.lastReaction, false);
                        }
                        sharedMediaLayout2.profileActivity.getMediaDataController().portSavedSearchResults(getClassGuid(), savedMessagesSearchAdapter2.lastReaction, savedMessagesSearchAdapter2.lastQuery, savedMessagesSearchAdapter2.cachedMessages, savedMessagesSearchAdapter2.loadedMessages, i, savedMessagesSearchAdapter2.count, savedMessagesSearchAdapter2.endReached);
                        this.firstCreateView = false;
                    }
                    super.onTransitionAnimationStart(z2, z3);
                }
            };
            chatActivity3.highlightMessageId = messageObject5.getId();
            baseFragment.presentFragment(chatActivity3);
        }
    }

    public ChatActivity$$ExternalSyntheticLambda124(ChatActivity chatActivity, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j) {
        this.$r8$classId = 0;
        this.f$0 = chatActivity;
        this.f$1 = tL_game;
        this.f$2 = messageObject;
        this.f$3 = str;
        this.f$4 = j;
    }

    public ChatActivity$$ExternalSyntheticLambda124(TopicsTabsView topicsTabsView, ArrayList arrayList, long j, HashSet hashSet, QrActivity$5$$ExternalSyntheticLambda1 qrActivity$5$$ExternalSyntheticLambda1) {
        this.$r8$classId = 2;
        this.f$0 = topicsTabsView;
        this.f$1 = arrayList;
        this.f$4 = j;
        this.f$2 = hashSet;
        this.f$3 = qrActivity$5$$ExternalSyntheticLambda1;
    }
}
