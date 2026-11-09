package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class ez0 extends org.telegram.ui.Components.j6 {
    public boolean f45541s;
    public final org.telegram.ui.Components.w5 f45542w;
    public final SaveToGallerySettingsActivity f45543x;

    public ez0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f45543x = saveToGallerySettingsActivity;
        this.f45542w = new org.telegram.ui.Components.w5(this);
        getDrawable().J = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f45541s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.w5 w5Var = this.f45542w;
        w5Var.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.l6.f28257y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f45543x;
        setTextColor(i0.a.f(w5Var.f39910c, saveToGallerySettingsActivity.getThemedColor(i7), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.l6.f28047n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z9, boolean z10) {
        float f10;
        if (this.f45541s != z9) {
            this.f45541s = z9;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f45542w.e(z10, f10);
            invalidate();
        }
    }
}
