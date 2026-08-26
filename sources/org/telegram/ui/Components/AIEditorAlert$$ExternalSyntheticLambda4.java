package org.telegram.ui.Components;

import android.view.View;

public final class AIEditorAlert$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public final int $r8$classId;
    public final AIEditorAlert f$0;

    public AIEditorAlert$$ExternalSyntheticLambda4(AIEditorAlert aIEditorAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = aIEditorAlert;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.collapse(view);
                break;
            case 1:
                this.f$0.lambda$new$0(view);
                break;
            case 2:
                this.f$0.lambda$new$9(view);
                break;
            case 3:
                this.f$0.lambda$updateButton$15(view);
                break;
            case 4:
                this.f$0.lambda$updateButton$16(view);
                break;
            case 5:
                this.f$0.lambda$updateButton$18(view);
                break;
            case 6:
                this.f$0.lambda$updateButton$17(view);
                break;
            case 7:
                this.f$0.onToLangMenu(view);
                break;
            case 8:
                this.f$0.toggleEmojify(view);
                break;
            default:
                this.f$0.copyResult(view);
                break;
        }
    }
}
