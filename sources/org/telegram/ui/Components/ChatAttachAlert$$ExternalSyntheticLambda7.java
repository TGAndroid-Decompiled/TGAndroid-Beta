package org.telegram.ui.Components;

import android.text.TextUtils;

public final class ChatAttachAlert$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlert f$0;

    public ChatAttachAlert$$ExternalSyntheticLambda7(ChatAttachAlert chatAttachAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlert;
    }

    @Override
    public final void run() {
        boolean zSendPressed;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.removeFromRoot();
                break;
            case 1:
                ChatAttachAlert chatAttachAlert = this.f$0;
                EditTextEmoji editTextEmoji = chatAttachAlert.captionAbove ? chatAttachAlert.topCommentTextView : chatAttachAlert.commentTextView;
                chatAttachAlert.showAiButton$1(editTextEmoji.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(editTextEmoji.getText().toString().trim()));
                break;
            case 2:
                ChatAttachAlert chatAttachAlert2 = this.f$0;
                ChatAttachAlert.AnonymousClass25 anonymousClass25 = chatAttachAlert2.messageSendPreview;
                long selectedEffect = anonymousClass25 != null ? anonymousClass25.getSelectedEffect() : 0L;
                chatAttachAlert2.effectId = selectedEffect;
                chatAttachAlert2.writeButton.setEffect(selectedEffect);
                ChatAttachAlert.AttachAlertLayout attachAlertLayout = chatAttachAlert2.currentAttachLayout;
                if (attachAlertLayout == chatAttachAlert2.photoLayout || attachAlertLayout == chatAttachAlert2.photoPreviewLayout) {
                    zSendPressed = chatAttachAlert2.sendPressed(0, false, 0, chatAttachAlert2.isCaptionAbove(), selectedEffect);
                } else {
                    if (!attachAlertLayout.sendSelectedItems(0, false, 0, chatAttachAlert2.isCaptionAbove(), selectedEffect)) {
                        chatAttachAlert2.lambda$showGiftOfferSheet$15();
                    }
                    zSendPressed = false;
                }
                ChatAttachAlert.AnonymousClass25 anonymousClass26 = chatAttachAlert2.messageSendPreview;
                if (anonymousClass26 != null) {
                    anonymousClass26.sent = !zSendPressed;
                    anonymousClass26.dismiss();
                    chatAttachAlert2.messageSendPreview = null;
                }
                break;
            case 3:
                this.f$0.lambda$showLayout$50();
                break;
            default:
                this.f$0.hide();
                break;
        }
    }
}
