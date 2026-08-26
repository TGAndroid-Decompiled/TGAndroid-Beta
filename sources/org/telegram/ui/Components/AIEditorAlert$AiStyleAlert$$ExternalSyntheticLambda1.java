package org.telegram.ui.Components;

import android.view.View;

public final class AIEditorAlert$AiStyleAlert$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final AIEditorAlert.AiStyleAlert f$0;

    public AIEditorAlert$AiStyleAlert$$ExternalSyntheticLambda1(AIEditorAlert.AiStyleAlert aiStyleAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = aiStyleAlert;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$0$3(view);
                break;
            default:
                this.f$0.onAnotherExample();
                break;
        }
    }
}
