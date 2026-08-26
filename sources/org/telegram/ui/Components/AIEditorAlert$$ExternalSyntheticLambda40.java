package org.telegram.ui.Components;

import android.view.View;

public final class AIEditorAlert$$ExternalSyntheticLambda40 implements View.OnClickListener {
    public final int $r8$classId;
    public final ItemOptions f$0;
    public final boolean f$1;
    public final Runnable f$2;

    public AIEditorAlert$$ExternalSyntheticLambda40(ItemOptions itemOptions, boolean z, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = itemOptions;
        this.f$1 = z;
        this.f$2 = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.dismiss();
                if (!this.f$1 && (runnable = this.f$2) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                this.f$0.dismiss();
                if (!this.f$1 && (runnable2 = this.f$2) != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
