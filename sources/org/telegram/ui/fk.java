package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class fk extends org.telegram.ui.Components.id {
    public final tn d;

    public fk(tn tnVar, Context context) {
        super(context);
        this.d = tnVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        tn tnVar = this.d;
        dk dkVar = tnVar.U;
        if (dkVar != null) {
            dkVar.invalidate();
        }
        if (getVisibility() != 8) {
            tnVar.h9(true);
            FrameLayout frameLayout = tnVar.L;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f9);
            }
            tnVar.o9();
            tnVar.r9();
            View view = tnVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i10) {
        FrameLayout frameLayout;
        super.setVisibility(i10);
        if (i10 == 8 && (frameLayout = this.d.L) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
