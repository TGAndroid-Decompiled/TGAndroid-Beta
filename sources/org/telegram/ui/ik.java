package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class ik extends org.telegram.ui.Components.pd {
    public final un d;

    public ik(un unVar, Context context) {
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
        hk hkVar = unVar.Y;
        if (hkVar != null) {
            hkVar.invalidate();
        }
        if (getVisibility() != 8) {
            unVar.r9(true);
            FrameLayout frameLayout = unVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            unVar.x9();
            unVar.z9();
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
        if (i10 == 8 && (frameLayout = this.d.P) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
