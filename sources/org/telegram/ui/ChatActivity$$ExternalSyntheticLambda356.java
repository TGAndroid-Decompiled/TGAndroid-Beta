package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ActiveGiftAuctionsHintCell;
import org.telegram.ui.Cells.BotHelpCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda14;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.GroupMedia;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AdminLogFilterAlert2;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda188;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatAttachAlertPollLayout$$ExternalSyntheticLambda24;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.DeleteMessagesBottomSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.ReactedUsersListView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class ChatActivity$$ExternalSyntheticLambda356 implements CountdownTimer.Callback, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, CheckBoxBase.ProgressDelegate, Utilities.Callback2Return, RecyclerListView.OnItemLongClickListener, AlertDialog.OnButtonClickListener, Utilities.Callback5, LanguageDetector.ExceptionCallback, ReactedUsersListView.OnCustomEmojiSelectedListener, MessagesStorage.BooleanCallback, BotHelpCell.BotHelpCellDelegate, EditWidgetActivity.EditWidgetActivityDelegate, RecyclerListView.OnItemClickListenerExtended {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$$ExternalSyntheticLambda356(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    public void didPressUrl(String str) {
        ChatActivity.ChatActivityAdapter chatActivityAdapter = (ChatActivity.ChatActivityAdapter) this.f$0;
        chatActivityAdapter.getClass();
        boolean zStartsWith = str.startsWith("@");
        ChatActivity chatActivity = ChatActivity.this;
        if (zStartsWith) {
            chatActivity.getMessagesController().openByUserName(str.substring(1), chatActivity, 0);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            DialogsActivity dialogsActivity = new DialogsActivity(null);
            dialogsActivity.searchString = str;
            chatActivity.presentFragment(dialogsActivity);
        } else {
            if (!str.startsWith("/")) {
                ChatActivity.this.processExternalUrl(0, str, null, null, false);
                return;
            }
            chatActivity.chatActivityEnterView.setCommand(null, str, false, false);
            if (chatActivity.chatActivityEnterView.getFieldText() == null) {
                chatActivity.hideFieldPanel(false);
            }
        }
    }

    @Override
    public void didSelectDialogs() {
        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) this.f$0;
        chatsWidgetConfigActivity.getClass();
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.creatingAppWidgetId);
        chatsWidgetConfigActivity.setResult(-1, intent);
        chatsWidgetConfigActivity.finish();
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ChatActionCell.ChatActionCellDelegate chatActionCellDelegate;
        int iBlendOver;
        MessageObject messageObject;
        switch (this.$r8$classId) {
            case 2:
                ChatActionCell chatActionCell = (ChatActionCell) this.f$0;
                if (z) {
                    RLottieDrawable lottieAnimation = chatActionCell.imageReceiver.getLottieAnimation();
                    if (lottieAnimation != null) {
                        MessageObject messageObject2 = chatActionCell.currentMessageObject;
                        if (messageObject2 == null || messageObject2.playedGiftAnimation) {
                            if (lottieAnimation.currentFrame < 1) {
                                lottieAnimation.isRunning = false;
                                lottieAnimation.checkChoreographer$1();
                                lottieAnimation.setCurrentFrame(lottieAnimation.metaData[0] - 1, false, false);
                            }
                            break;
                        } else {
                            messageObject2.playedGiftAnimation = true;
                            lottieAnimation.setCurrentFrame(0, false, false);
                            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda14(lottieAnimation, 0));
                            if (messageObject2.wasUnread || chatActionCell.forceWasUnread) {
                                messageObject2.wasUnread = false;
                                chatActionCell.forceWasUnread = false;
                                try {
                                    chatActionCell.performHapticFeedback(3, 2);
                                    break;
                                } catch (Exception unused) {
                                }
                                if (chatActionCell.getContext() instanceof LaunchActivity) {
                                    ((LaunchActivity) chatActionCell.getContext()).fireworksOverlay.start(false);
                                }
                                TLRPC.VideoSize videoSize = chatActionCell.giftEffectAnimation;
                                if (videoSize != null && (chatActionCellDelegate = chatActionCell.delegate) != null) {
                                    chatActionCellDelegate.needShowEffectOverlay(chatActionCell, chatActionCell.giftSticker, videoSize);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    chatActionCell.getClass();
                    break;
                }
                break;
            default:
                SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) this.f$0;
                ImageReceiver imageReceiver2 = sharedPhotoVideoCell2.imageReceiver;
                if (z && !z2 && (messageObject = sharedPhotoVideoCell2.currentMessageObject) != null && messageObject.hasMediaSpoilers() && imageReceiver2.getBitmap() != null) {
                    ImageReceiver imageReceiver3 = sharedPhotoVideoCell2.blurImageReceiver;
                    if (imageReceiver3.getBitmap() != null) {
                        imageReceiver3.getBitmap().recycle();
                    }
                    imageReceiver3.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver2.getBitmap()));
                }
                if (z && !z2 && sharedPhotoVideoCell2.check2 && imageReceiver2.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver2.getBitmap());
                    sharedPhotoVideoCell2.imageReceiverColor = dominantColor;
                    CheckBoxBase checkBoxBase = sharedPhotoVideoCell2.checkBoxBase;
                    if (checkBoxBase != null && checkBoxBase.backgroundColor != (iBlendOver = Theme.blendOver(dominantColor, Theme.multAlpha(0.25f, -1)))) {
                        checkBoxBase.backgroundColor = iBlendOver;
                        checkBoxBase.invalidate();
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        int i2 = this.$r8$classId;
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i = this.$r8$classId;
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        int i2 = 1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity$$ExternalSyntheticLambda22) obj).run();
                break;
            case 9:
                ((ChannelCreateActivity) obj).lambda$showDoneCancelDialog$2(alertDialog);
                break;
            case 13:
                ChatActivity chatActivity = ChatActivity.this;
                chatActivity.finishFragment();
                chatActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, chatActivity.businessLink);
                break;
            case 17:
                ChatActivity chatActivity2 = ChatActivity.this;
                ChatThemeController.getInstance(((BaseFragment) chatActivity2).currentAccount).clearWallpaper(chatActivity2.dialog_id, true, true);
                break;
            case 18:
                ChatLinkActivity chatLinkActivity = (ChatLinkActivity) obj;
                boolean z = chatLinkActivity.isChannel;
                if (!z || chatLinkActivity.info.linked_chat_id != 0) {
                    AlertDialog[] alertDialogArr = {new AlertDialog(chatLinkActivity.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(chatLinkActivity.currentChat);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chatLinkActivity.currentChat);
                    }
                    AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda8(chatLinkActivity, alertDialogArr, chatLinkActivity.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ChatActivity$$ExternalSyntheticLambda208(21, chatLinkActivity, alertDialogArr)), i2), 500L);
                }
                break;
            case 19:
                ((ChatUsersActivity$$ExternalSyntheticLambda11) obj).run(1);
                break;
            case 22:
                ((AIEditorAlert.CreateAiStyleAlert) obj).lambda$new$4(alertDialog);
                break;
            case 24:
                ((ChatUsersActivity$$ExternalSyntheticLambda13) obj).run();
                break;
            case 25:
                ((LinkManager$3$$ExternalSyntheticLambda0) obj).run();
                break;
            case 26:
                ((OAuthSheet$$ExternalSyntheticLambda9) obj).run();
                break;
            case 27:
                ((AlertsCreator$$ExternalSyntheticLambda188) obj).run();
                break;
            case 28:
                ((DeleteMessagesBottomSheet$$ExternalSyntheticLambda8) obj).run();
                break;
            default:
                ((ChatAttachAlertPollLayout$$ExternalSyntheticLambda24) obj).run();
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((AdminLogFilterAlert2) this.f$0).lambda$new$0(view, f, i);
    }

    @Override
    public void onTimerUpdate(long j) {
        ((ActiveGiftAuctionsHintCell.CountDown) this.f$0).updateTimer(j);
    }

    @Override
    public void run(boolean z) {
        switch (this.$r8$classId) {
            case 14:
                ChatActivity chatActivity = ChatActivity.this;
                chatActivity.performHistoryClear(chatActivity.threadMessageId, true);
                break;
            case 15:
                ChatActivity.AnonymousClass93 anonymousClass93 = (ChatActivity.AnonymousClass93) this.f$0;
                if (!z) {
                    anonymousClass93.getClass();
                    break;
                } else {
                    ChatActivity chatActivity2 = ChatActivity.this;
                    chatActivity2.createUndoView();
                    UndoView undoView = chatActivity2.undoView;
                    if (undoView != null) {
                        undoView.showWithAction(0L, 76, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                        break;
                    }
                }
                break;
            default:
                ChatUsersActivity.AnonymousClass9 anonymousClass9 = (ChatUsersActivity.AnonymousClass9) this.f$0;
                if (!z) {
                    anonymousClass9.getClass();
                } else {
                    ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
                    if (((BaseFragment) chatUsersActivity).parentLayout != null) {
                        BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) ((BaseFragment) chatUsersActivity).parentLayout, 2, ((ActionBarLayout) ((BaseFragment) chatUsersActivity).parentLayout).getFragmentStack());
                        if (!(baseFragment instanceof ChatEditActivity)) {
                            chatUsersActivity.finishFragment();
                        } else {
                            baseFragment.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatUsersActivity.chatId);
                            ChatEditActivity chatEditActivity = new ChatEditActivity(bundle);
                            chatEditActivity.setInfo(chatUsersActivity.info);
                            ((ActionBarLayout) ((BaseFragment) chatUsersActivity).parentLayout).addFragmentToStack(ArticleViewer.IBlock.CC.m((ActionBarLayout) ((BaseFragment) chatUsersActivity).parentLayout, 1), chatEditActivity);
                            chatUsersActivity.finishFragment();
                            chatEditActivity.undoView.showWithAction(0L, 76, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                        }
                    }
                }
                break;
        }
    }

    @Override
    public void setProgress() {
        switch (this.$r8$classId) {
            case 4:
                HintDialogCell hintDialogCell = (HintDialogCell) this.f$0;
                float progress = 1.0f - (hintDialogCell.checkBox.getProgress() * 0.143f);
                BackupImageView backupImageView = hintDialogCell.imageView;
                backupImageView.setScaleX(progress);
                backupImageView.setScaleY(progress);
                hintDialogCell.invalidate();
                break;
            default:
                ShareDialogCell shareDialogCell = (ShareDialogCell) this.f$0;
                float progress2 = 1.0f - (shareDialogCell.checkBox.getProgress() * 0.143f);
                BackupImageView backupImageView2 = shareDialogCell.imageView;
                backupImageView2.setScaleX(progress2);
                backupImageView2.setScaleY(progress2);
                shareDialogCell.invalidate();
                break;
        }
    }

    @Override
    public void showCustomEmojiAlert(ArrayList arrayList) {
        final ChatActivity.AnonymousClass106 anonymousClass106 = (ChatActivity.AnonymousClass106) this.f$0;
        ChatActivity chatActivity = ChatActivity.this;
        if (chatActivity.getParentActivity() == null || chatActivity.getParentActivity() == null) {
            return;
        }
        EmojiPacksAlert emojiPacksAlert = new EmojiPacksAlert(chatActivity, chatActivity.getParentActivity(), chatActivity.themeDelegate, arrayList) {
            @Override
            public final void lambda$showGiftOfferSheet$15() {
                super.lambda$showGiftOfferSheet$15();
                ChatActivity chatActivity2 = ChatActivity.this;
                chatActivity2.getClass();
                chatActivity2.dimBehindView(false, true, 0.0f);
            }
        };
        emojiPacksAlert.setCalcMandatoryInsets(chatActivity.isKeyboardVisible());
        emojiPacksAlert.setDimBehind(false);
        chatActivity.closeMenu(false);
        chatActivity.showDialog(emojiPacksAlert);
    }

    public ChatActivity$$ExternalSyntheticLambda356(ChatActivity.AnonymousClass16.AnonymousClass1 anonymousClass1, boolean z) {
        this.$r8$classId = 14;
        this.f$0 = anonymousClass1;
    }

    @Override
    public boolean onItemClick(int i, View view) {
        ThemesHorizontalListCell themesHorizontalListCell = (ThemesHorizontalListCell) this.f$0;
        themesHorizontalListCell.getClass();
        themesHorizontalListCell.showOptionsForTheme(((ThemesHorizontalListCell.InnerThemeView) view).themeInfo);
        return true;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        return (CharSequence) ((ChatActivity$$ExternalSyntheticLambda29) this.f$0).run((Integer) obj2);
    }

    @Override
    public void run(Exception exc) {
        ((BotHelpCell) this.f$0).setClickable(false);
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        UItem uItem = (UItem) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ChannelMonetizationLayout.ChannelTransactionsView.Page page = (ChannelMonetizationLayout.ChannelTransactionsView.Page) this.f$0;
        page.getClass();
        Object obj6 = uItem.object;
        boolean z = obj6 instanceof TL_stars.StarsTransaction;
        ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView = ChannelMonetizationLayout.ChannelTransactionsView.this;
        if (z) {
            StarsIntroActivity.showTransactionSheet(page.getContext(), true, channelTransactionsView.dialogId, page.currentAccount, (TL_stars.StarsTransaction) uItem.object, page.resourcesProvider);
            return;
        }
        if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
            ChannelMonetizationLayout.showTransactionSheet(page.getContext(), page.currentAccount, (TL_stats.BroadcastRevenueTransaction) uItem.object, channelTransactionsView.dialogId, page.resourcesProvider);
        }
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        GroupMedia groupMedia;
        ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$0;
        MessageObject messageObject = chatMessageCell.currentMessageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((groupMedia = chatMessageCell.groupMedia) != null && groupMedia.hidden)) {
            return (message.noforwards && !messageObject.isEphemeral()) || chatMessageCell.currentMessageObject.isVoiceOnce() || chatMessageCell.currentMessageObject.hasRevealedExtendedMedia();
        }
        return true;
    }
}
