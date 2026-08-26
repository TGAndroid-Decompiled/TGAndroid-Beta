package org.telegram.ui.Components.Premium;

import android.view.View;

public final class LimitReachedBottomSheet$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final int $r8$classId;
    public final LimitReachedBottomSheet f$0;

    public LimitReachedBottomSheet$$ExternalSyntheticLambda3(LimitReachedBottomSheet limitReachedBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = limitReachedBottomSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$0$3(view);
                break;
            case 1:
                this.f$0.lambda$onViewCreated$4(view);
                break;
            case 2:
                this.f$0.lambda$onViewCreated$14(view);
                break;
            default:
                this.f$0.lambda$new$1$2(view);
                break;
        }
    }
}
