package org.telegram.ui.iv;

import org.telegram.ui.MessageSendPreview;

public final class ChatAttachAlertRichLayout$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertRichLayout f$0;

    public ChatAttachAlertRichLayout$$ExternalSyntheticLambda2(ChatAttachAlertRichLayout chatAttachAlertRichLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertRichLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showConversionSheet$27();
                break;
            case 1:
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = this.f$0;
                chatAttachAlertRichLayout.sendSelectedItems(true, 2147483646, 0, 0L, false);
                MessageSendPreview messageSendPreview = chatAttachAlertRichLayout.messageSendPreview;
                if (messageSendPreview != null) {
                    messageSendPreview.dismiss(false);
                    chatAttachAlertRichLayout.messageSendPreview = null;
                }
                break;
            case 2:
                ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = this.f$0;
                chatAttachAlertRichLayout2.sendSelectedItems(false, 0, 0, 0L, false);
                MessageSendPreview messageSendPreview2 = chatAttachAlertRichLayout2.messageSendPreview;
                if (messageSendPreview2 != null) {
                    messageSendPreview2.dismiss(true);
                    chatAttachAlertRichLayout2.messageSendPreview = null;
                }
                break;
            case 3:
                ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = this.f$0;
                RichEditorToolbar richEditorToolbar = chatAttachAlertRichLayout3.toolbar;
                if (richEditorToolbar != null) {
                    richEditorToolbar.setSendEnabled(chatAttachAlertRichLayout3.listView.isWithinLimits());
                }
                break;
            default:
                this.f$0.updateToolbarTopOffset();
                break;
        }
    }
}
