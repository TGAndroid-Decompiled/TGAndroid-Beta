package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class pk extends org.telegram.ui.Components.nd {
    public final bo d;

    public pk(bo boVar, Context context) {
        super(context);
        this.d = boVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        bo boVar = this.d;
        nk nkVar = boVar.Y;
        if (nkVar != null) {
            nkVar.invalidate();
        }
        if (getVisibility() != 8) {
            boVar.h9(true);
            FrameLayout frameLayout = boVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            boVar.o9();
            boVar.r9();
            View view = boVar.fragmentView;
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
