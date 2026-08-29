package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class m31 extends org.telegram.ui.Components.o6 {
    public boolean f40364s;
    public final org.telegram.ui.Components.d6 v;
    public final SaveToGallerySettingsActivity f40365w;

    public m31(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f40365w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.d6(this);
        getDrawable().D = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        if (this.f40364s) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        org.telegram.ui.Components.d6 d6Var = this.v;
        d6Var.d(f9, false);
        int i10 = org.telegram.ui.ActionBar.g6.f23433y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f40365w;
        setTextColor(i0.a.d(d6Var.f27666c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f23241n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f9;
        if (this.f40364s != z10) {
            this.f40364s = z10;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            this.v.d(f9, z11);
            invalidate();
        }
    }
}
