package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class ck extends org.telegram.ui.Components.ed {
    public final qn d;

    public ck(qn qnVar, Context context) {
        super(context);
        this.d = qnVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        qn qnVar = this.d;
        ak akVar = qnVar.U;
        if (akVar != null) {
            akVar.invalidate();
        }
        if (getVisibility() != 8) {
            qnVar.h9(true);
            FrameLayout frameLayout = qnVar.L;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            qnVar.o9();
            qnVar.r9();
            View view = qnVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i9) {
        FrameLayout frameLayout;
        super.setVisibility(i9);
        if (i9 == 8 && (frameLayout = this.d.L) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
