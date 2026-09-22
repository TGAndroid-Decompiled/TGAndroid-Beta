package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class ok extends org.telegram.ui.Components.pd {
    public final zn d;

    public ok(zn znVar, Context context) {
        super(context);
        this.d = znVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        zn znVar = this.d;
        mk mkVar = znVar.Y;
        if (mkVar != null) {
            mkVar.invalidate();
        }
        if (getVisibility() != 8) {
            znVar.h9(true);
            FrameLayout frameLayout = znVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            znVar.o9();
            znVar.r9();
            View view = znVar.fragmentView;
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
