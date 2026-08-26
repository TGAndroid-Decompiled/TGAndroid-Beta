package org.telegram.ui.iv;

import org.telegram.ui.MessageSendPreview;

public final class RichEditor$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final RichEditor f$0;

    public RichEditor$$ExternalSyntheticLambda1(RichEditor richEditor, int i) {
        this.$r8$classId = i;
        this.f$0 = richEditor;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.updateSendButtonEnabled$1();
                break;
            case 1:
                RichEditor richEditor = this.f$0;
                if (richEditor.bottomPanelType != 0) {
                    richEditor.bottomPanel.setVisibility(8);
                }
                break;
            case 2:
                RichEditor richEditor2 = this.f$0;
                if (richEditor2.bottomPanelType != 1) {
                    richEditor2.formattingPanel.setVisibility(8);
                }
                break;
            case 3:
                RichEditor richEditor3 = this.f$0;
                if (richEditor3.bottomPanelType != 2) {
                    richEditor3.trashPanel.setVisibility(8);
                }
                break;
            case 4:
                this.f$0.lambda$showConversionSheet$46();
                break;
            case 5:
                RichEditor richEditor4 = this.f$0;
                richEditor4.sendMessage(2147483646, 0, true);
                MessageSendPreview messageSendPreview = richEditor4.messageSendPreview;
                if (messageSendPreview != null) {
                    messageSendPreview.sent = false;
                    messageSendPreview.dismiss();
                    richEditor4.messageSendPreview = null;
                }
                break;
            default:
                RichEditor richEditor5 = this.f$0;
                richEditor5.sendMessage(0, 0, false);
                MessageSendPreview messageSendPreview2 = richEditor5.messageSendPreview;
                if (messageSendPreview2 != null) {
                    messageSendPreview2.sent = true;
                    messageSendPreview2.dismiss();
                    richEditor5.messageSendPreview = null;
                }
                break;
        }
    }
}
