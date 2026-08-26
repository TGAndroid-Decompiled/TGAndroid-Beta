package org.telegram.ui.Components;

public final class AIEditorAlert$$ExternalSyntheticLambda18 implements Runnable {
    public final int $r8$classId;
    public final AIEditorAlert f$0;

    public AIEditorAlert$$ExternalSyntheticLambda18(AIEditorAlert aIEditorAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = aIEditorAlert;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.showStyleHint();
                break;
            case 1:
                this.f$0.lambda$updateButton$19();
                break;
            case 2:
                this.f$0.lambda$updateButton$20();
                break;
            case 3:
                this.f$0.lambda$selectStyle$22();
                break;
            default:
                this.f$0.lambda$new$10();
                break;
        }
    }
}
