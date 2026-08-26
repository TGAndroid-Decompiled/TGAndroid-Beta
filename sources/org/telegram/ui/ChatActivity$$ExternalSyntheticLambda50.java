package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.ChatActivity.AnonymousClass93;
import org.telegram.ui.Components.ChatGreetingsView;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.Components.ReactedUsersListView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.URLSpanBotCommand;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.chat.layouts.ButtonOnClickListener;
import org.telegram.ui.Components.chat.layouts.ButtonOnLongClickListener;
import org.telegram.ui.Components.chat.layouts.ChatActivityChannelButtonsLayout;
import org.telegram.ui.Delegates.ChatActivityMemberRequestsDelegate;

public final class ChatActivity$$ExternalSyntheticLambda50 implements AlertDialog.OnButtonClickListener, ChatGreetingsView.Listener, MessagesStorage.BooleanCallback, ReactedUsersListView.OnCustomEmojiSelectedListener, ResultCallback, GroupCreateActivity.ContactsAddActivityDelegate, ContactAddActivity.ContactAddActivityDelegate, ChatActivityMemberRequestsDelegate.ChangeVisibilityDelegate, ButtonOnClickListener, ButtonOnLongClickListener, RecyclerListView.OnItemLongClickListener, ChatActivityChannelButtonsLayout.OnButtonsTotalWidthChanged, RecyclerAnimationScrollHelper.ScrollListener, FlagSecureReason.FlagSecureCondition, PinchToZoomHelper.ClipBoundsListener {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda50(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public void didAddToContacts() {
        ChatActivity chatActivity = this.f$0;
        if (chatActivity.undoView != null || chatActivity.getParentActivity() == null) {
            return;
        }
        chatActivity.createUndoView();
        chatActivity.undoView.showWithAction(chatActivity.dialog_id, 8, chatActivity.currentUser, (Object) null, (Runnable) null, (Runnable) null);
    }

    @Override
    public void didSelectUsers(int i, ArrayList arrayList) {
        ChatActivity chatActivity = this.f$0;
        chatActivity.getMessagesController().addUsersToChat(chatActivity.currentChat, chatActivity, arrayList, i, null, null, null);
        chatActivity.getMessagesController().hidePeerSettingsBar(chatActivity.dialog_id, chatActivity.currentUser, chatActivity.currentChat);
        chatActivity.updateTopPanel(true);
        chatActivity.updateInfoTopView(true);
    }

    @Override
    public void getClipTopBottom(float[] fArr) {
        ChatActivity chatActivity = this.f$0;
        fArr[1] = chatActivity.chatListView.getBottom() - chatActivity.blurredViewBottomOffset;
        fArr[0] = (chatActivity.chatListView.getTop() + chatActivity.chatListViewPaddingTop) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void needAddBot(TLRPC.User user) {
    }

    @Override
    public void onClick(int i) {
        ChatActivity chatActivity = this.f$0;
        if (i == 1) {
            chatActivity.onPageDownClicked();
            return;
        }
        if (i == 2) {
            chatActivity.loadLastUnreadMention();
            return;
        }
        if (i == 3) {
            chatActivity.wasManualScroll = true;
            chatActivity.getMessagesController().getNextReactionMention(chatActivity.dialog_id, chatActivity.getTopicId(), chatActivity.reactionsMentionCount, new ChatActivity$$ExternalSyntheticLambda99(chatActivity, 1));
            return;
        }
        if (i == 4) {
            chatActivity.wasManualScroll = true;
            chatActivity.getMessagesController().getNextPollVotesMention(chatActivity.dialog_id, chatActivity.getTopicId(), chatActivity.pollVotesMentionCount, new ChatActivity$$ExternalSyntheticLambda99(chatActivity, 2));
            return;
        }
        if (i == 6) {
            chatActivity.goToNextOrPrevSearchMessage(true);
            return;
        }
        if (i == 5) {
            chatActivity.goToNextOrPrevSearchMessage(false);
        } else if (i == 0) {
            ChatActivity.AnonymousClass78 anonymousClass78 = chatActivity.chatAttachAlert;
            if (anonymousClass78 != null) {
                anonymousClass78.setEditingMessageObject(null, 0);
            }
            chatActivity.openAttachMenu();
        }
    }

    @Override
    public void onComplete(Object obj) {
        EmojiThemes emojiThemes = (EmojiThemes) obj;
        ChatActivity chatActivity = this.f$0;
        ChatActivity.ThemeDelegate themeDelegate = chatActivity.themeDelegate;
        themeDelegate.setCurrentTheme(emojiThemes, themeDelegate.wallpaper, chatActivity.openAnimationStartTime != 0, null, false);
    }

    @Override
    public void onError(Throwable th) {
        ResultCallback.CC.$default$onError(this, th);
    }

    @Override
    public void onGreetings(TLRPC.Document document) {
        switch (this.$r8$classId) {
            case 3:
                this.f$0.lambda$createEmptyView$304(document);
                break;
            default:
                this.f$0.lambda$createEmptyView$305(document);
                break;
        }
    }

    @Override
    public boolean onItemClick(int i, View view) {
        ChatActivity chatActivity = this.f$0;
        boolean z = false;
        if (chatActivity.getParentActivity() != null) {
            MentionsAdapter adapter = chatActivity.mentionContainer.getAdapter();
            if ((adapter.searchResultHashtags != null || adapter.searchResultCommands != null) && i != 0) {
                MentionsAdapter adapter2 = chatActivity.mentionContainer.getAdapter();
                if (adapter2.foundContextBot == null || adapter2.inlineMediaEnabled) {
                    Object item = chatActivity.mentionContainer.getAdapter().getItem(i - 1);
                    if (item instanceof MentionsAdapter.EphemeralCommand) {
                        MentionsAdapter.EphemeralCommand ephemeralCommand = (MentionsAdapter.EphemeralCommand) item;
                        if (chatActivity.mentionContainer.getAdapter().searchResultCommands != null && URLSpanBotCommand.enabled) {
                            chatActivity.chatActivityEnterView.setFieldText("");
                            ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity.chatActivityEnterView;
                            String str = ephemeralCommand.command;
                            TLRPC.Chat chat = chatActivity.currentChat;
                            if (chat != null && chat.megagroup) {
                                z = true;
                            }
                            anonymousClass39.setCommand(null, str, true, z);
                            return true;
                        }
                    } else if (item instanceof String) {
                        if (chatActivity.mentionContainer.getAdapter().searchResultCommands == null) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity.getParentActivity(), 0, chatActivity.themeDelegate);
                            String string = LocaleController.getString(R.string.AppName);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = string;
                            alertDialog.message = LocaleController.getString(R.string.ClearSearch);
                            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new ChatActivity$$ExternalSyntheticLambda50(chatActivity, 11));
                            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            chatActivity.showDialog(alertDialog);
                            return true;
                        }
                        if (URLSpanBotCommand.enabled) {
                            chatActivity.chatActivityEnterView.setFieldText("");
                            ChatActivity.AnonymousClass39 anonymousClass310 = chatActivity.chatActivityEnterView;
                            String str2 = (String) item;
                            TLRPC.Chat chat2 = chatActivity.currentChat;
                            if (chat2 != null && chat2.megagroup) {
                                z = true;
                            }
                            anonymousClass310.setCommand(null, str2, true, z);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void onScroll() {
        ChatActivity chatActivity = this.f$0;
        chatActivity.invalidateMergedVisibleBlurredPositionsAndSources$1(1);
        chatActivity.invalidateMessagesVisiblePart();
    }

    @Override
    public void run(boolean z) {
        ChatActivity chatActivity = this.f$0;
        NotificationCenter notificationCenter = chatActivity.getNotificationCenter();
        int i = NotificationCenter.closeChats;
        notificationCenter.removeObserver(chatActivity, i);
        chatActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
        chatActivity.finishFragment();
        chatActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(chatActivity.dialog_id), chatActivity.currentUser, chatActivity.currentChat, Boolean.valueOf(z));
    }

    @Override
    public void setVisible(boolean z, boolean z2) {
        ChatActivity chatActivity = this.f$0;
        chatActivity.topPanelLayout.setViewVisible(chatActivity.pendingRequestsDelegate.getView(), z, z2);
    }

    @Override
    public void showCustomEmojiAlert(ArrayList arrayList) {
        switch (this.$r8$classId) {
            case 10:
                final ChatActivity chatActivity = this.f$0;
                if (chatActivity.getParentActivity() != null && chatActivity.getParentActivity() != null) {
                    EmojiPacksAlert emojiPacksAlert = new EmojiPacksAlert(chatActivity, chatActivity.getParentActivity(), chatActivity.themeDelegate, arrayList) {
                        public AnonymousClass108(final ChatActivity chatActivity2, Activity activity, Theme.ResourcesProvider resourcesProvider, ArrayList arrayList2) {
                            super(chatActivity2, activity, resourcesProvider, arrayList2);
                        }

                        @Override
                        public final void lambda$showGiftOfferSheet$15() {
                            super.lambda$showGiftOfferSheet$15();
                            ChatActivity chatActivity2 = ChatActivity.this;
                            chatActivity2.getClass();
                            chatActivity2.dimBehindView(false, true, 0.0f);
                        }
                    };
                    emojiPacksAlert.setCalcMandatoryInsets(chatActivity2.isKeyboardVisible());
                    emojiPacksAlert.setDimBehind(false);
                    chatActivity2.closeMenu(false);
                    chatActivity2.showDialog(emojiPacksAlert);
                    break;
                }
                break;
            default:
                final ChatActivity chatActivity2 = this.f$0;
                if (chatActivity2.getParentActivity() != null && chatActivity2.getParentActivity() != null) {
                    EmojiPacksAlert emojiPacksAlert2 = new EmojiPacksAlert(chatActivity2, chatActivity2.getParentActivity(), chatActivity2.themeDelegate, arrayList2) {
                        public AnonymousClass136(final ChatActivity chatActivity3, Activity activity, Theme.ResourcesProvider resourcesProvider, ArrayList arrayList2) {
                            super(chatActivity3, activity, resourcesProvider, arrayList2);
                        }

                        @Override
                        public final void lambda$showGiftOfferSheet$15() {
                            super.lambda$showGiftOfferSheet$15();
                            ChatActivity chatActivity3 = ChatActivity.this;
                            chatActivity3.getClass();
                            chatActivity3.dimBehindView(false, true, 0.0f);
                        }
                    };
                    emojiPacksAlert2.setCalcMandatoryInsets(chatActivity3.isKeyboardVisible());
                    emojiPacksAlert2.setDimBehind(false);
                    chatActivity3.closeMenu(false);
                    chatActivity3.showDialog(emojiPacksAlert2);
                    break;
                }
                break;
        }
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        ResultCallback.CC.$default$onError(this, tL_error);
    }

    @Override
    public boolean run() {
        ChatActivity chatActivity = this.f$0;
        return chatActivity.currentEncryptedChat != null || chatActivity.isPeerNoForwards();
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                ChatActivity.AnonymousClass46 anonymousClass46 = this.f$0.bottomOverlayChatText;
                if (anonymousClass46 != null) {
                    anonymousClass46.callOnClick();
                }
                break;
            case 2:
                this.f$0.lambda$onFragmentCreate$16(alertDialog, i);
                break;
            case 3:
            case 4:
            case 8:
            case 10:
            case 14:
            case 15:
            default:
                ChatActivity chatActivity = this.f$0;
                MessageObject messageObject = (MessageObject) chatActivity.pinnedMessageObjects.get(Integer.valueOf(chatActivity.currentPinnedMessageId));
                if (messageObject == null) {
                    messageObject = (MessageObject) chatActivity.messagesDict[0].get(chatActivity.currentPinnedMessageId);
                }
                chatActivity.unpinMessage(messageObject);
                break;
            case 5:
                ChatActivity chatActivity2 = this.f$0;
                MessagePreviewParams messagePreviewParams = chatActivity2.messagePreviewParams;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, chatActivity2.dialog_id);
                }
                chatActivity2.fallbackFieldPanel();
                break;
            case 6:
                this.f$0.openForwardingPreview(1);
                break;
            case 7:
                ChatActivity chatActivity3 = this.f$0;
                chatActivity3.getMessagesController().unblockPeer(chatActivity3.currentUser.id);
                break;
            case 9:
                this.f$0.lambda$showQuickRepliesRemoveAlert$362(alertDialog, i);
                break;
            case 11:
                MentionsAdapter adapter = this.f$0.mentionContainer.getAdapter();
                adapter.searchAdapterHelper.clearRecentHashtags();
                adapter.searchResultHashtags.clear();
                adapter.notifyDataSetChanged();
                MentionsContainerView.AnonymousClass4 anonymousClass4 = adapter.delegate;
                if (anonymousClass4 != null) {
                    anonymousClass4.needChangePanelVisibility(false);
                }
                break;
            case 12:
                ChatActivity chatActivity4 = this.f$0;
                chatActivity4.getClass();
                chatActivity4.showDialog(chatActivity4.new AnonymousClass93(chatActivity4.getParentActivity(), chatActivity4));
                break;
            case 13:
                ChatActivity chatActivity5 = this.f$0;
                chatActivity5.createUndoView();
                UndoView undoView = chatActivity5.undoView;
                if (undoView != null) {
                    undoView.showWithAction(0L, 75, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                    break;
                }
                break;
            case 16:
                ChatActivity chatActivity6 = this.f$0;
                MessagePreviewParams messagePreviewParams2 = chatActivity6.messagePreviewParams;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    chatActivity6.openForwardingPreview(0);
                    break;
                }
                break;
            case 17:
                this.f$0.hideFieldPanel(true);
                break;
        }
    }
}
