package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class dz0 extends org.telegram.ui.Components.o6 {
    public boolean f47083s;
    public final org.telegram.ui.Components.d6 f47084w;
    public final SaveToGallerySettingsActivity f47085x;

    public dz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f47085x = saveToGallerySettingsActivity;
        this.f47084w = new org.telegram.ui.Components.d6(this);
        getDrawable().K = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f47083s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.d6 d6Var = this.f47084w;
        d6Var.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.m6.f29773y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f47085x;
        setTextColor(i0.a.f(d6Var.f34386c, saveToGallerySettingsActivity.getThemedColor(i7), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.m6.f29563n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f10;
        if (this.f47083s != z10) {
            this.f47083s = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f47084w.e(z11, f10);
            invalidate();
        }
    }
}
