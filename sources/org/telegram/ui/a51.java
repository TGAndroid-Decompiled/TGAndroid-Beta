package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class a51 extends org.telegram.ui.Components.s6 {
    public boolean f33745s;
    public final org.telegram.ui.Components.g6 v;
    public final SaveToGallerySettingsActivity f33746w;

    public a51(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f33746w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.g6(this);
        getDrawable().J = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f33745s) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.g6 g6Var = this.v;
        g6Var.d(f7, false);
        int i10 = org.telegram.ui.ActionBar.g6.f19988y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f33746w;
        setTextColor(i0.a.d(g6Var.f24885c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f19784n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        if (this.f33745s != z10) {
            this.f33745s = z10;
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
