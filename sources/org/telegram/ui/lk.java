package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class lk extends org.telegram.ui.Components.fd {
    public final xn d;

    public lk(xn xnVar, Context context) {
        super(context);
        this.d = xnVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        xn xnVar = this.d;
        jk jkVar = xnVar.V;
        if (jkVar != null) {
            jkVar.invalidate();
        }
        if (getVisibility() != 8) {
            xnVar.h9(true);
            FrameLayout frameLayout = xnVar.M;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
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
        if (i10 == 8 && (frameLayout = this.d.M) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
