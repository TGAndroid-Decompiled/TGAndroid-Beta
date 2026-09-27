package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class nk extends org.telegram.ui.Components.pd {
    public final xn d;

    public nk(xn xnVar, Context context) {
        super(context);
        this.d = xnVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        xn xnVar = this.d;
        lk lkVar = xnVar.Y;
        if (lkVar != null) {
            lkVar.invalidate();
        }
        if (getVisibility() != 8) {
            xnVar.h9(true);
            FrameLayout frameLayout = xnVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            xnVar.o9();
            xnVar.r9();
            View view = xnVar.fragmentView;
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
