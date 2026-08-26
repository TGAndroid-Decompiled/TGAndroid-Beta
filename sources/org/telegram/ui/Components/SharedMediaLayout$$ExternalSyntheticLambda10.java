package org.telegram.ui.Components;

import android.view.View;

public final class SharedMediaLayout$$ExternalSyntheticLambda10 implements View.OnClickListener {
    public final int $r8$classId;
    public final SharedMediaLayout f$0;

    public SharedMediaLayout$$ExternalSyntheticLambda10(SharedMediaLayout sharedMediaLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = sharedMediaLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$switchToCurrentSelectedMode$51(view);
                break;
            case 1:
                this.f$0.lambda$new$3(view);
                break;
            case 2:
                this.f$0.lambda$new$4(view);
                break;
            case 3:
                this.f$0.lambda$new$5(view);
                break;
            case 4:
                this.f$0.lambda$new$6(view);
                break;
            case 5:
                this.f$0.lambda$new$7(view);
                break;
            case 6:
                this.f$0.lambda$new$8(view);
                break;
            default:
                this.f$0.lambda$new$9(view);
                break;
        }
    }
}
