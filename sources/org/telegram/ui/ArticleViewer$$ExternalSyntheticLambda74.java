package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.StateSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.AudioFocusManager;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.Log;
import com.stripe.android.Stripe;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.BotButton;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda142;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda188;
import org.telegram.ui.Components.AutoDeletePopupWrapper;
import org.telegram.ui.Components.CaptionPhotoViewer;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayoutPreview;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.MenuToItemOptions;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.Swatch;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.EntityView$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.PhotoViewerWebView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.SearchField$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.HintView2;

public final class ArticleViewer$$ExternalSyntheticLambda74 implements Runnable {
    public final int $r8$classId;
    public final int f$0;
    public final Object f$1;

    public ArticleViewer$$ExternalSyntheticLambda74(int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = obj;
    }

    @Override
    public final void run() {
        AudioAttributes audioAttributes;
        CharSequence charSequenceReplaceTags;
        int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        final int i4 = this.f$0;
        Object obj = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                MessagesController.getInstance(i4).loadFullChat(((TLRPC.Chat) obj).id, 0, true);
                break;
            case 1:
                AudioFocusManager audioFocusManager = AudioFocusManager.this;
                if (i4 == -3 || i4 == -2) {
                    if (i4 == -2 || ((audioAttributes = audioFocusManager.audioAttributes) != null && audioAttributes.contentType == 1)) {
                        audioFocusManager.executePlayerCommand(0);
                        audioFocusManager.setAudioFocusState(2);
                    } else {
                        audioFocusManager.setAudioFocusState(3);
                    }
                } else if (i4 == -1) {
                    audioFocusManager.executePlayerCommand(-1);
                    audioFocusManager.abandonAudioFocusIfHeld();
                } else if (i4 != 1) {
                    audioFocusManager.getClass();
                    Log.w("AudioFocusManager", "Unknown focus change type: " + i4);
                } else {
                    audioFocusManager.setAudioFocusState(1);
                    audioFocusManager.executePlayerCommand(1);
                }
                break;
            case 2:
                AlertDialog[] alertDialogArr = (AlertDialog[]) obj;
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    try {
                        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i4, true);
                            }
                        });
                        alertDialogArr[0].show();
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 3:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i4).clientUserId);
                ((ActionBarLayout) ((INavigationLayout) obj)).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 4:
                ConnectionsManager.lambda$onUpdateConfig$21(i4, (TLRPC.TL_config) obj);
                break;
            case 5:
                ((DialogsSearchAdapter) obj).notifyItemChanged(i4);
                break;
            case 6:
                ((AutoDeleteMessagesActivity) ((Stripe.AnonymousClass1) obj).this$0).selectDate(i4, true);
                break;
            case 7:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i4).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i4).stepThis().dispose();
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 8:
                ChatMessageCell chatMessageCell = (ChatMessageCell) obj;
                int i5 = chatMessageCell.pressedBotButton;
                if (i4 == i5) {
                    BotButton botButton = (BotButton) chatMessageCell.botButtons.get(i5);
                    if (botButton != null) {
                        BaseCell.RippleDrawableSafe rippleDrawableSafe = botButton.selectorDrawable;
                        if (rippleDrawableSafe != null) {
                            rippleDrawableSafe.setState(StateSet.NOTHING);
                        }
                        botButton.setPressed(false);
                        if (!chatMessageCell.currentMessageObject.scheduled) {
                            if (botButton.buttonCustom != null) {
                                chatMessageCell.cancelCheckLongPress();
                            } else if (botButton.button != null) {
                                chatMessageCell.cancelCheckLongPress();
                                ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate = chatMessageCell.delegate;
                                if (chatMessageCellDelegate != null) {
                                    chatMessageCellDelegate.didLongPressBotButton(chatMessageCell, botButton.button);
                                }
                            }
                        }
                    }
                    chatMessageCell.pressedBotButton = -1;
                    chatMessageCell.invalidateOutbounds();
                }
                break;
            case 9:
                ChannelMonetizationLayout.ChannelTransactionsView.this.loadTransactions(i4);
                break;
            case 10:
                ChatActivity.this.scrollToMessageId(this.f$0, 0, true, 0, true, 0);
                break;
            case 11:
                ChatActivity chatActivity = ((ChatActivity.AnonymousClass127) obj).this$0;
                if (chatActivity.progressDialogAtMessageId == i4) {
                    chatActivity.resetProgressDialogLoading();
                }
                break;
            case 12:
                ChatActivity chatActivity2 = ((ChatActivity.AnonymousClass128) obj).this$0;
                if (chatActivity2.progressDialogAtMessageId == i4) {
                    chatActivity2.resetProgressDialogLoading();
                }
                break;
            case 13:
                ChatActivity chatActivity3 = ((ChatActivity.AnonymousClass127) obj).this$0;
                if (chatActivity3.progressDialogAtMessageId == i4) {
                    chatActivity3.resetProgressDialogLoading();
                }
                break;
            case 14:
                ChatActivity chatActivity4 = ((ChatActivity.AnonymousClass128) obj).this$0;
                if (chatActivity4.progressDialogAtMessageId == i4) {
                    chatActivity4.resetProgressDialogLoading();
                }
                break;
            case 15:
                ChatActivity chatActivity5 = ((ChatActivity.AnonymousClass128) obj).this$0;
                if (chatActivity5.progressDialogAtMessageId == i4) {
                    chatActivity5.resetProgressDialogLoading();
                }
                break;
            case 16:
                ChatActivity chatActivity6 = ChatActivity.this;
                ChatActivity.AnonymousClass23 anonymousClass23 = chatActivity6.chatLayoutManager;
                anonymousClass23.scrollToPositionWithOffset(i4, chatActivity6.scrollToOffsetOnRecreate, anonymousClass23.mShouldReverseLayout);
                break;
            case 17:
                ConnectionsManager.getInstance(((BaseFragment) ChatActivity.this).currentAccount).cancelRequest(i4, true);
                break;
            case 18:
                NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new AlertsCreator$$ExternalSyntheticLambda188((MessagesStorage.BooleanCallback) obj, i3), 250L);
                break;
            case 19:
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i4).getPrivacyRules(11);
                String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    for (int i6 = 0; i6 < privacyRules.size(); i6++) {
                        if (privacyRules.get(i6) instanceof TLRPC.TL_privacyValueAllowContacts) {
                            string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                        } else {
                            if ((privacyRules.get(i6) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i6) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                            }
                        }
                    }
                }
                ((LinkSpanDrawable.LinksTextView) obj).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new AlertsCreator$$ExternalSyntheticLambda142(privacyRules, i2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
            case 20:
                ((AutoDeletePopupWrapper) obj).updateItems(i4);
                break;
            case 21:
                CaptionPhotoViewer captionPhotoViewer = (CaptionPhotoViewer) obj;
                if (captionPhotoViewer.timer != i4) {
                    captionPhotoViewer.setTimer(i4);
                    Utilities.Callback callback = captionPhotoViewer.onTTLChange;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i4));
                    }
                    HintView2 hintView2 = captionPhotoViewer.hint;
                    if (i4 == 0) {
                        charSequenceReplaceTags = LocaleController.getString(captionPhotoViewer.isVideo ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        hintView2.textMaxWidth = captionPhotoViewer.getMeasuredWidth();
                        hintView2.setMultilineText(false);
                        hintView2.setInnerPadding(13.0f, 4.0f, 10.0f, 4.0f);
                        hintView2.iconMargin = AndroidUtilities.dp(0);
                        hintView2.iconTy = -AndroidUtilities.dp(1.0f);
                    } else if (i4 == Integer.MAX_VALUE) {
                        charSequenceReplaceTags = LocaleController.getString(captionPhotoViewer.isVideo ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        hintView2.textMaxWidth = captionPhotoViewer.getMeasuredWidth();
                        hintView2.setMultilineText(false);
                        hintView2.setInnerPadding(13.0f, 4.0f, 10.0f, 4.0f);
                        hintView2.iconMargin = AndroidUtilities.dp(0);
                        hintView2.iconTy = -AndroidUtilities.dp(1.0f);
                    } else if (i4 > 0) {
                        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(captionPhotoViewer.isVideo ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i4, new Object[0]));
                        hintView2.setMultilineText(true);
                        hintView2.textMaxWidth = HintView2.cutInFancyHalf(charSequenceReplaceTags, hintView2.getTextPaint());
                        hintView2.setInnerPadding(12.0f, 7.0f, 11.0f, 7.0f);
                        hintView2.iconMargin = AndroidUtilities.dp(2);
                        hintView2.iconTy = 0.0f;
                    }
                    hintView2.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), captionPhotoViewer.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (captionPhotoViewer instanceof PhotoViewer.AnonymousClass31 ? -1.0f : 1.0f));
                    hintView2.setText(charSequenceReplaceTags);
                    int i7 = i4 > 0 ? R.raw.fire_on : R.raw.fire_off;
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(i7, DiffUtil.m(i7, ""), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f), true, null);
                    rLottieDrawable.start();
                    hintView2.setIcon(rLottieDrawable);
                    hintView2.show();
                    captionPhotoViewer.moveButtonExpanded = false;
                    AndroidUtilities.cancelRunOnUIThread(captionPhotoViewer.collapseMoveButton);
                    captionPhotoViewer.invalidate();
                    break;
                }
                break;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i4 == 0) {
                    chatActivityEnterView.emojiPadding = 0;
                }
                chatActivityEnterView.panelAnimation = null;
                ChatActivityEnterView.AnonymousClass78 anonymousClass78 = chatActivityEnterView.emojiView;
                if (anonymousClass78 != null) {
                    if (chatActivityEnterView.windowInsetsInAppController == null) {
                        anonymousClass78.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.emojiView.setVisibility(8);
                    chatActivityEnterView.viewParentForEmojiView.removeView(chatActivityEnterView.emojiView);
                    if (chatActivityEnterView.removeEmojiViewAfterAnimation) {
                        chatActivityEnterView.removeEmojiViewAfterAnimation = false;
                        chatActivityEnterView.emojiView = null;
                    }
                }
                ChatActivityEnterView.ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
                if (chatActivityEnterViewDelegate != null) {
                    chatActivityEnterViewDelegate.bottomPanelTranslationYChanged(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 23:
                ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView previewGroupsView = (ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView) obj;
                if (i4 == previewGroupsView.undoViewId) {
                    ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
                    if (chatAttachAlertPhotoLayoutPreview.undoView.isShown()) {
                        chatAttachAlertPhotoLayoutPreview.undoView.hide(1, true);
                    }
                }
                break;
            case 24:
                EmojiView emojiView = (EmojiView) obj;
                if (emojiView.backspacePressed) {
                    EmojiView.EmojiViewDelegate emojiViewDelegate = emojiView.delegate;
                    if (emojiViewDelegate != null && emojiViewDelegate.onBackspace()) {
                        try {
                            emojiView.backspaceButton.performHapticFeedback(3);
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                    emojiView.backspaceOnce = true;
                    int iMax = Math.max(50, i4 - 100);
                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda74(emojiView, iMax, 24), iMax);
                    break;
                }
                break;
            case 25:
                ((MenuToItemOptions) obj).onMenuClicked.run(Integer.valueOf(i4));
                break;
            case 26:
                EntityView entityView = (EntityView) obj;
                entityView.currentStickyAngle = i4;
                entityView.hasStickyAngle = true;
                try {
                    entityView.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused3) {
                }
                ValueAnimator valueAnimator = entityView.angleAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = entityView.fromStickyAngleAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                entityView.angleAnimator = duration;
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                entityView.angleAnimator.addUpdateListener(new EntityView$$ExternalSyntheticLambda5(entityView, i));
                entityView.angleAnimator.addListener(new EntityView.AnonymousClass1(entityView, i));
                entityView.angleAnimator.start();
                break;
            case 27:
                PhotoViewer.AnonymousClass67 anonymousClass67 = (PhotoViewer.AnonymousClass67) obj;
                Swatch swatch = anonymousClass67.colorSwatch;
                anonymousClass67.setCurrentSwatch(swatch, null);
                PersistColorPalette.getInstance(i4).setCurrentWeight(swatch.brushWeight);
                break;
            case 28:
                StickerMakerView stickerMakerView = (StickerMakerView) obj;
                stickerMakerView.getClass();
                NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                stickerMakerView.hideLoadingDialog();
                break;
            default:
                final PhotoViewerWebView.YoutubeProxy youtubeProxy = (PhotoViewerWebView.YoutubeProxy) obj;
                PhotoViewer.AnonymousClass79 anonymousClass79 = youtubeProxy.this$0;
                TextView textView = anonymousClass79.errorButton;
                textView.setVisibility(8);
                anonymousClass79.webView.setVisibility(8);
                LinearLayout linearLayout = anonymousClass79.errorLayout;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                RadialProgressView radialProgressView = anonymousClass79.progressBar;
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                        public final int $r8$classId;
                        public final YoutubeProxy this$1;

                        public AnonymousClass1() {
                            i = i2;
                            youtubeProxy = youtubeProxy;
                        }

                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            switch (i) {
                                case 0:
                                    youtubeProxy.this$0.progressBar.setVisibility(8);
                                    break;
                                default:
                                    youtubeProxy.this$0.progressBarBlackBackground.setVisibility(8);
                                    break;
                            }
                        }
                    });
                }
                QrActivity.AnonymousClass2 anonymousClass2 = anonymousClass79.progressBarBlackBackground;
                if (anonymousClass2.getAlpha() == 1.0f) {
                    anonymousClass2.animate().cancel();
                    anonymousClass2.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                        public final int $r8$classId;
                        public final YoutubeProxy this$1;

                        public AnonymousClass1() {
                            i = i3;
                            youtubeProxy = youtubeProxy;
                        }

                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            switch (i) {
                                case 0:
                                    youtubeProxy.this$0.progressBar.setVisibility(8);
                                    break;
                                default:
                                    youtubeProxy.this$0.progressBarBlackBackground.setVisibility(8);
                                    break;
                            }
                        }
                    });
                }
                TextView textView2 = anonymousClass79.errorMessage;
                if (i4 == 2) {
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                } else if (i4 != 5) {
                    if (i4 != 150) {
                        if (i4 == 100) {
                            textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotFound));
                            break;
                        } else if (i4 != 101) {
                        }
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotAvailableInApp));
                    textView.setText(LocaleController.getString(R.string.YouTubeVideoErrorOpenExternal));
                    textView.setVisibility(0);
                    textView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(youtubeProxy, 13));
                } else {
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                }
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda74(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = i;
    }
}
