package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class hk extends org.telegram.ui.Components.md {
    public final sn d;

    public hk(sn snVar, Context context) {
        super(context);
        this.d = snVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        sn snVar = this.d;
        gk gkVar = snVar.Y;
        if (gkVar != null) {
            gkVar.invalidate();
        }
        if (getVisibility() != 8) {
            snVar.m9(true);
            FrameLayout frameLayout = snVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            snVar.t9();
            snVar.w9();
            View view = snVar.fragmentView;
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
