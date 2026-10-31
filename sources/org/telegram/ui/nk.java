package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class nk extends org.telegram.ui.Components.rc {
    public final un d;

    public nk(un unVar, Context context) {
        super(context);
        this.d = unVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        un unVar = this.d;
        mk mkVar = unVar.Z;
        if (mkVar != null) {
            mkVar.invalidate();
        }
        if (getVisibility() != 8) {
            unVar.u9(true);
            FrameLayout frameLayout = unVar.Q;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            unVar.A9();
            unVar.C9();
            View view = unVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i10) {
        FrameLayout frameLayout;
        super.setVisibility(i10);
        if (i10 == 8 && (frameLayout = this.d.Q) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
