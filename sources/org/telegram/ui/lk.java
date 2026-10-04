package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class lk extends org.telegram.ui.Components.qd {
    public final yn d;

    public lk(yn ynVar, Context context) {
        super(context);
        this.d = ynVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        yn ynVar = this.d;
        jk jkVar = ynVar.W;
        if (jkVar != null) {
            jkVar.invalidate();
        }
        if (getVisibility() != 8) {
            ynVar.i9(true);
            FrameLayout frameLayout = ynVar.N;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            ynVar.o9();
            ynVar.q9();
            View view = ynVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i10) {
        FrameLayout frameLayout;
        super.setVisibility(i10);
        if (i10 == 8 && (frameLayout = this.d.N) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
