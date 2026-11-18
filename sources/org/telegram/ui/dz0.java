package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class dz0 extends org.telegram.ui.Components.n6 {
    public boolean f47091s;
    public final org.telegram.ui.Components.c6 f47092w;
    public final SaveToGallerySettingsActivity f47093x;

    public dz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f47093x = saveToGallerySettingsActivity;
        this.f47092w = new org.telegram.ui.Components.c6(this);
        getDrawable().K = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f47091s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.c6 c6Var = this.f47092w;
        c6Var.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.n6.f29788y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f47093x;
        setTextColor(i0.a.f(c6Var.f33892c, saveToGallerySettingsActivity.getThemedColor(i7), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.n6.f29578n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f10;
        if (this.f47091s != z10) {
            this.f47091s = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f47092w.e(z11, f10);
            invalidate();
        }
    }
}
