package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;

public final class ItemOptions$$ExternalSyntheticLambda16 implements ViewTreeObserver.OnPreDrawListener {
    public final int $r8$classId;
    public final View f$0;

    public ItemOptions$$ExternalSyntheticLambda16(View view, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.$r8$classId) {
            case 0:
                return ItemOptions.lambda$show$14((ItemOptions.DimView) this.f$0);
            default:
                return ((EditTextBoldCursor) this.f$0).lambda$startActionMode$2();
        }
    }
}
