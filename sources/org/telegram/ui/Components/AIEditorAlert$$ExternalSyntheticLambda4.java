package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class AIEditorAlert$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final AIEditorAlert f$0;

    public AIEditorAlert$$ExternalSyntheticLambda4(AIEditorAlert aIEditorAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = aIEditorAlert;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AIEditorAlert aIEditorAlert = this.f$0;
                if (!aIEditorAlert.showLimit) {
                    aIEditorAlert.allButton.setVisibility(8);
                }
                break;
            case 1:
                this.f$0.showStyleHint();
                break;
            case 2:
                AndroidUtilities.showKeyboard(this.f$0.promptCell.editText);
                break;
            case 3:
                AIEditorAlert aIEditorAlert2 = this.f$0;
                aIEditorAlert2.runSend(0, 0, false);
                aIEditorAlert2.lambda$showGiftOfferSheet$15();
                break;
            default:
                AIEditorAlert aIEditorAlert3 = this.f$0;
                if (aIEditorAlert3.showLimit) {
                    aIEditorAlert3.buttonContainer.setVisibility(8);
                }
                break;
        }
    }
}
