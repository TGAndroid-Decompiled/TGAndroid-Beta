package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class nj extends org.telegram.ui.Components.wc {
    public final wm d;

    public nj(wm wmVar, Context context) {
        super(context);
        this.d = wmVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        wm wmVar = this.d;
        mj mjVar = wmVar.f51237a0;
        if (mjVar != null) {
            mjVar.invalidate();
        }
        if (getVisibility() != 8) {
            wmVar.E9(true);
            FrameLayout frameLayout = wmVar.R;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            wmVar.K9();
            wmVar.M9();
            View view = wmVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i3) {
        FrameLayout frameLayout;
        super.setVisibility(i3);
        if (i3 == 8 && (frameLayout = this.d.R) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
