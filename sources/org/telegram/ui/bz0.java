package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class bz0 extends org.telegram.ui.Components.j6 {
    public boolean f44485s;
    public final org.telegram.ui.Components.w5 f44486w;
    public final SaveToGallerySettingsActivity f44487x;

    public bz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f44487x = saveToGallerySettingsActivity;
        this.f44486w = new org.telegram.ui.Components.w5(this);
        getDrawable().J = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f44485s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.w5 w5Var = this.f44486w;
        w5Var.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.k6.f28240y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f44487x;
        setTextColor(i0.a.f(w5Var.f39849c, saveToGallerySettingsActivity.getThemedColor(i7), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.f28030n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z9, boolean z10) {
        float f10;
        if (this.f44485s != z9) {
            this.f44485s = z9;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f44486w.e(z10, f10);
            invalidate();
        }
    }
}
