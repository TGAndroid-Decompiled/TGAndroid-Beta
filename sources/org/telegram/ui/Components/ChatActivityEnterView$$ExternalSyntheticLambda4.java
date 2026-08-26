package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import com.stripe.android.Stripe;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bots.BotCommandsMenuView;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichMessageConvert;

public final class ChatActivityEnterView$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda4(ChatActivityEnterView chatActivityEnterView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public final void run() {
        boolean z;
        ChatActivityEnterView.AnonymousClass50 anonymousClass50;
        ActionBarLayout actionBarLayout;
        ChatActivity chatActivity;
        switch (this.$r8$classId) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f$0;
                ChatAttachAlert.AnonymousClass25 anonymousClass25 = chatActivityEnterView.messageSendPreview;
                if (anonymousClass25 != null) {
                    anonymousClass25.sent = chatActivityEnterView.dismissSendPreviewSent;
                    anonymousClass25.dismiss();
                    chatActivityEnterView.messageSendPreview = null;
                }
                break;
            case 1:
                this.f$0.senderSelectView.callOnClick();
                break;
            case 2:
                this.f$0.senderSelectView.callOnClick();
                break;
            case 3:
                ChatActivity chatActivity2 = this.f$0.parentFragment;
                if (chatActivity2 != null) {
                    chatActivity2.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView2 = this.f$0;
                chatActivityEnterView2.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivityEnterView$$ExternalSyntheticLambda4(chatActivityEnterView2, 7));
                break;
            case 5:
                ChatActivityEnterView.RecordCircle recordCircle = this.f$0.recordCircle;
                if (recordCircle != null) {
                    recordCircle.setSendButtonInvisible();
                }
                break;
            case 6:
                ChatActivityEnterView.RecordCircle recordCircle2 = this.f$0.recordCircle;
                if (recordCircle2 != null) {
                    recordCircle2.setSendButtonInvisible();
                }
                break;
            case 7:
                BotCommandsMenuView botCommandsMenuView = this.f$0.botCommandsMenuButton;
                if (botCommandsMenuView != null) {
                    botCommandsMenuView.setOpened(false);
                }
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView3 = this.f$0;
                ViewGroup view = null;
                chatActivityEnterView3.focusRunnable = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView3.parentActivity;
                    if (activity instanceof LaunchActivity) {
                        LaunchActivity launchActivity = (LaunchActivity) activity;
                        if (launchActivity != null && (actionBarLayout = launchActivity.layersActionBarLayout) != null) {
                            view = actionBarLayout.getView();
                        }
                        if (view == null || view.getVisibility() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                if (!chatActivityEnterView3.isPaused && z && (anonymousClass50 = chatActivityEnterView3.messageEditText) != null) {
                    try {
                        anonymousClass50.requestFocus();
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                    break;
                }
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView4 = this.f$0;
                ChatActivityEnterView.AnonymousClass78 anonymousClass78 = chatActivityEnterView4.emojiView;
                if (anonymousClass78 != null) {
                    if (chatActivityEnterView4.windowInsetsInAppController == null) {
                        anonymousClass78.getLayoutParams().height = chatActivityEnterView4.stickersExpandedHeight;
                    }
                    chatActivityEnterView4.emojiView.setLayerType(0, null);
                }
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView5 = this.f$0;
                ChatActivity chatActivity3 = chatActivityEnterView5.parentFragment;
                if (chatActivity3 == null || chatActivity3.isLastFragment()) {
                    AndroidUtilities.hideKeyboard(chatActivityEnterView5.messageEditText);
                }
                chatActivityEnterView5.hideKeyboardRunnable = null;
                break;
            case 11:
                this.f$0.updateSlowModeText();
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView6 = this.f$0;
                ChatActivityEnterView.ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView6.delegate;
                if (chatActivityEnterViewDelegate != null) {
                    chatActivityEnterViewDelegate.bottomPanelTranslationYChanged(0.0f);
                }
                chatActivityEnterView6.requestLayout();
                break;
            case 13:
                AndroidUtilities.removeFromParent(this.f$0.sendSuggestHintView);
                break;
            case 14:
                ChatActivityEnterView chatActivityEnterView7 = this.f$0;
                chatActivityEnterView7.waitingForKeyboardOpenAfterAnimation = false;
                chatActivityEnterView7.openKeyboardInternal();
                break;
            case 15:
                ChatActivityEnterView chatActivityEnterView8 = this.f$0;
                chatActivityEnterView8.removeView(chatActivityEnterView8.birthdayHint);
                break;
            case 16:
                this.f$0.openWebViewMenu();
                break;
            case 17:
                BulletinFactory.of(this.f$0.parentFragment).createSuccessBulletin(LocaleController.getString(R.string.BusinessLinkSaved)).show();
                break;
            case 18:
                ChatActivityEnterView.AnonymousClass50 anonymousClass51 = this.f$0.messageEditText;
                if (anonymousClass51 != null) {
                    anonymousClass51.setText("");
                }
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView9 = this.f$0;
                ChatActivityEnterView.AnonymousClass50 anonymousClass52 = chatActivityEnterView9.messageEditText;
                if (anonymousClass52 != null) {
                    anonymousClass52.setText("");
                }
                chatActivityEnterView9.checkSendButton(true);
                break;
            case 20:
                ChatActivityEnterView chatActivityEnterView10 = this.f$0;
                chatActivityEnterView10.showTopView(true, true);
                chatActivityEnterView10.showTopViewRunnable = null;
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView11 = this.f$0;
                AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView11.parentActivity, chatActivityEnterView11.parentFragment.getDialogId(), -1L, 0, new Stripe(chatActivityEnterView11, 20), null, chatActivityEnterView11.resourcesProvider);
                break;
            case 22:
                ChatActivityEnterView chatActivityEnterView12 = this.f$0;
                chatActivityEnterView12.sendMessageInternal(2147483646, true, 0, true, 0L);
                ChatAttachAlert.AnonymousClass25 anonymousClass26 = chatActivityEnterView12.messageSendPreview;
                if (anonymousClass26 != null) {
                    anonymousClass26.sent = false;
                    anonymousClass26.dismiss();
                    chatActivityEnterView12.messageSendPreview = null;
                }
                break;
            case 23:
                ChatActivityEnterView chatActivityEnterView13 = this.f$0;
                ChatAttachAlert.AnonymousClass25 anonymousClass27 = chatActivityEnterView13.messageSendPreview;
                if (anonymousClass27 != null) {
                    anonymousClass27.sent = false;
                    anonymousClass27.dismiss();
                    chatActivityEnterView13.messageSendPreview = null;
                }
                AndroidUtilities.runOnUIThread(new ChatActivityEnterView$$ExternalSyntheticLambda90(chatActivityEnterView13, 2), 600L);
                break;
            case 24:
                ChatActivityEnterView chatActivityEnterView14 = this.f$0;
                TL_iv.RichMessage richMessage = chatActivityEnterView14.richDraftMessage;
                if (richMessage != null && chatActivityEnterView14.messageEditText != null && (chatActivity = chatActivityEnterView14.parentFragment) != null) {
                    if (MessagesController.getInstance(chatActivityEnterView14.currentAccount).richEditorAvailable()) {
                        RichEditor richEditor = new RichEditor(richMessage);
                        richEditor.convertToSimpleOnOpen = true;
                        richEditor.setResourceProvider(chatActivityEnterView14.resourcesProvider);
                        richEditor.chatActivity = chatActivity;
                        richEditor.animateInputView = chatActivity.chatInputViewsContainer;
                        richEditor.animateEnterView = chatActivity.chatActivityEnterView;
                        richEditor.onClearedCallback = new ChatActivityEnterView$$ExternalSyntheticLambda4(chatActivityEnterView14, 26);
                        richEditor.onSentCallback = new ChatActivityEnterView$$ExternalSyntheticLambda4(chatActivityEnterView14, 27);
                        chatActivity.presentFragment(richEditor);
                        break;
                    } else {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView14.richDraftMessage;
                        if (richMessage2 != null && chatActivityEnterView14.messageEditText != null) {
                            ArrayList<TL_iv.PageBlock> arrayList = richMessage2.blocks;
                            ArrayList arrayList2 = new ArrayList();
                            RichMessageConvert.collectBlocks(arrayList2, arrayList);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(RichMessageConvert.join(arrayList2));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView14.messageEditText.getPaint().getFontMetricsInt(), false, (int[]) null);
                            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class);
                            if (animatedEmojiSpanArr != null) {
                                for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                                    animatedEmojiSpan.applyFontMetrics(chatActivityEnterView14.messageEditText.getPaint().getFontMetricsInt(), AnimatedEmojiDrawable.getCacheTypeForEnterView());
                                }
                            }
                            QuoteSpan.normalizeQuotes(spannableStringBuilder);
                            chatActivityEnterView14.clearRichDraft();
                            chatActivityEnterView14.setFieldText(spannableStringBuilder);
                            chatActivityEnterView14.sendMessage();
                            break;
                        }
                    }
                }
                break;
            case 25:
                ChatActivity chatActivity4 = this.f$0.parentFragment;
                if (chatActivity4 != null) {
                    chatActivity4.showDialog(new PremiumFeatureBottomSheet((BaseFragment) chatActivity4, 43, true));
                }
                break;
            case 26:
                ChatActivityEnterView.AnonymousClass50 anonymousClass53 = this.f$0.messageEditText;
                if (anonymousClass53 != null) {
                    anonymousClass53.setText("");
                }
                break;
            case 27:
                ChatActivityEnterView chatActivityEnterView15 = this.f$0;
                ChatActivityEnterView.AnonymousClass50 anonymousClass54 = chatActivityEnterView15.messageEditText;
                if (anonymousClass54 != null) {
                    anonymousClass54.setText("");
                }
                chatActivityEnterView15.checkSendButton(true);
                break;
            case 28:
                this.f$0.setBirthdayHintText();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView16 = this.f$0;
                chatActivityEnterView16.waitingForKeyboardOpenAfterAnimation = false;
                chatActivityEnterView16.openKeyboardInternal();
                break;
        }
    }
}
