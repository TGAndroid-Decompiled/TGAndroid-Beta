package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class nk extends org.telegram.ui.Components.fd {
    public final zn d;

    public nk(zn znVar, Context context) {
        super(context);
        this.d = znVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        zn znVar = this.d;
        lk lkVar = znVar.V;
        if (lkVar != null) {
            lkVar.invalidate();
        }
        if (getVisibility() != 8) {
            znVar.h9(true);
            FrameLayout frameLayout = znVar.M;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
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
        if (i10 == 8 && (frameLayout = this.d.M) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
