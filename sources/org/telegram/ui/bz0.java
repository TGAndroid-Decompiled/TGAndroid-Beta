package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class bz0 extends org.telegram.ui.Components.j6 {
    public boolean f44508s;
    public final org.telegram.ui.Components.w5 f44509w;
    public final SaveToGallerySettingsActivity f44510x;

    public bz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f44510x = saveToGallerySettingsActivity;
        this.f44509w = new org.telegram.ui.Components.w5(this);
        getDrawable().J = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f44508s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.w5 w5Var = this.f44509w;
        w5Var.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.k6.f28244y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f44510x;
        setTextColor(i0.a.f(w5Var.f39805c, saveToGallerySettingsActivity.getThemedColor(i7), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.f28034n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z9, boolean z10) {
        float f10;
        if (this.f44508s != z9) {
            this.f44508s = z9;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f44509w.e(z10, f10);
            invalidate();
        }
    }
}
