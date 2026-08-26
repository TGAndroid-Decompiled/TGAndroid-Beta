package org.telegram.ui;

import android.view.View;

public final class MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final MultiContactsSelectorBottomSheet f$0;

    public MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda2(MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = multiContactsSelectorBottomSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$2(view);
                break;
            default:
                this.f$0.lambda$updateSectionCell$6(view);
                break;
        }
    }
}
