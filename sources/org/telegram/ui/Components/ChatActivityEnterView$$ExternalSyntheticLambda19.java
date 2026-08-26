package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class ChatActivityEnterView$$ExternalSyntheticLambda19 implements Runnable {
    public final int $r8$classId;
    public final ChatActivityEnterView f$0;
    public final boolean f$1;

    public ChatActivityEnterView$$ExternalSyntheticLambda19(ChatActivityEnterView chatActivityEnterView, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityEnterView;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        ChatAttachAlert.AnonymousClass25 anonymousClass25;
        switch (this.$r8$classId) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f$0;
                if (!this.f$1) {
                    chatActivityEnterView.aiButton.setVisibility(8);
                } else {
                    chatActivityEnterView.getClass();
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f$0;
                if (!this.f$1) {
                    chatActivityEnterView2.richButton.setVisibility(8);
                } else {
                    chatActivityEnterView2.getClass();
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView3 = this.f$0;
                chatActivityEnterView3.getClass();
                chatActivityEnterView3.sentFromPreview = System.currentTimeMillis();
                boolean zSendMessageInternal = chatActivityEnterView3.sendMessageInternal(0, false, 0, true, 0L);
                if (this.f$1 || (anonymousClass25 = chatActivityEnterView3.messageSendPreview) == null) {
                    chatActivityEnterView3.dismissSendPreviewSent = !zSendMessageInternal;
                    ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = chatActivityEnterView3.dismissSendPreview;
                    AndroidUtilities.cancelRunOnUIThread(chatActivityEnterView$$ExternalSyntheticLambda4);
                    AndroidUtilities.runOnUIThread(chatActivityEnterView$$ExternalSyntheticLambda4, 500L);
                } else {
                    anonymousClass25.sent = !zSendMessageInternal;
                    anonymousClass25.dismiss();
                    chatActivityEnterView3.messageSendPreview = null;
                }
                break;
        }
    }
}
