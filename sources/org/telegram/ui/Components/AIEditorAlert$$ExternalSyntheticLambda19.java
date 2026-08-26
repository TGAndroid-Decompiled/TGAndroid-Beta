package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;

public final class AIEditorAlert$$ExternalSyntheticLambda19 implements LanguageDetector.StringCallback {
    public final int $r8$classId;
    public final AIEditorAlert f$0;

    public AIEditorAlert$$ExternalSyntheticLambda19(AIEditorAlert aIEditorAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = aIEditorAlert;
    }

    @Override
    public final void run(String str) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setText$26(str);
                break;
            default:
                this.f$0.lambda$setText$24(str);
                break;
        }
    }
}
