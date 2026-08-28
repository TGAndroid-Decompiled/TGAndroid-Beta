package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class m31 extends org.telegram.ui.Components.j6 {
    public boolean f40314s;
    public final org.telegram.ui.Components.y5 v;
    public final SaveToGallerySettingsActivity f40315w;

    public m31(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f40315w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.y5(this);
        getDrawable().D = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f40314s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.y5 y5Var = this.v;
        y5Var.d(f10, false);
        int i9 = org.telegram.ui.ActionBar.f6.f23369y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f40315w;
        setTextColor(i0.a.d(y5Var.f34854c, saveToGallerySettingsActivity.getThemedColor(i9), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.f23179n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f10;
        if (this.f40314s != z10) {
            this.f40314s = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.v.d(f10, z11);
            invalidate();
        }
    }
}
