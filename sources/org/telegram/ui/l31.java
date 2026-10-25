package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class l31 extends org.telegram.ui.Components.s6 {
    public boolean f41126s;
    public final org.telegram.ui.Components.h6 v;
    public final SaveToGallerySettingsActivity f41127w;

    public l31(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f41127w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.h6(this);
        getDrawable().J = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f41126s) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.h6 h6Var = this.v;
        h6Var.d(f7, false);
        int i10 = org.telegram.ui.ActionBar.y6.f23746y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f41127w;
        setTextColor(i0.a.f(h6Var.f28809c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.y6.f23538n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        if (this.f41126s != z10) {
            this.f41126s = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.v.d(f7, z11);
            invalidate();
        }
    }
}
