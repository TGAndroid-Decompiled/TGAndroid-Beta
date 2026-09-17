package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class ok extends org.telegram.ui.Components.pd {
    public final co d;

    public ok(co coVar, Context context) {
        super(context);
        this.d = coVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        co coVar = this.d;
        mk mkVar = coVar.Y;
        if (mkVar != null) {
            mkVar.invalidate();
        }
        if (getVisibility() != 8) {
            coVar.h9(true);
            FrameLayout frameLayout = coVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            coVar.o9();
            coVar.r9();
            View view = coVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i10) {
        FrameLayout frameLayout;
        super.setVisibility(i10);
        if (i10 == 8 && (frameLayout = this.d.P) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
