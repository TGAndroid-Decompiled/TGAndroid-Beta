package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;

public final class AIEditorAlert$$ExternalSyntheticLambda16 implements LanguageDetector.StringCallback {
    public final int $r8$classId;
    public final AIEditorAlert f$0;

    public AIEditorAlert$$ExternalSyntheticLambda16(AIEditorAlert aIEditorAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = aIEditorAlert;
    }

    @Override
    public final void run(String str) {
        switch (this.$r8$classId) {
            case 0:
                AIEditorAlert aIEditorAlert = this.f$0;
                aIEditorAlert.from_lang = str;
                aIEditorAlert.adapter.update(true);
                break;
            default:
                AIEditorAlert aIEditorAlert2 = this.f$0;
                aIEditorAlert2.from_lang = str;
                aIEditorAlert2.adapter.update(true);
                break;
        }
    }
}
