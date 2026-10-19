package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class gk extends org.telegram.ui.Components.od {
    public final qn d;

    public gk(qn qnVar, Context context) {
        super(context);
        this.d = qnVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        qn qnVar = this.d;
        fk fkVar = qnVar.Y;
        if (fkVar != null) {
            fkVar.invalidate();
        }
        if (getVisibility() != 8) {
            qnVar.m9(true);
            FrameLayout frameLayout = qnVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            qnVar.t9();
            qnVar.w9();
            View view = qnVar.fragmentView;
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
