package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class lk extends org.telegram.ui.Components.qd {
    public final wn d;

    public lk(wn wnVar, Context context) {
        super(context);
        this.d = wnVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        wn wnVar = this.d;
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            jkVar.invalidate();
        }
        if (getVisibility() != 8) {
            wnVar.h9(true);
            FrameLayout frameLayout = wnVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            wnVar.o9();
            wnVar.r9();
            View view = wnVar.fragmentView;
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
