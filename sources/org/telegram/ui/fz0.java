package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class fz0 extends org.telegram.ui.Components.i6 {
    public boolean f45878s;
    public final org.telegram.ui.Components.v5 f45879w;
    public final SaveToGallerySettingsActivity f45880x;

    public fz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f45880x = saveToGallerySettingsActivity;
        this.f45879w = new org.telegram.ui.Components.v5(this);
        getDrawable().J = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f45878s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.v5 v5Var = this.f45879w;
        v5Var.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.m6.f28282y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f45880x;
        setTextColor(i0.a.f(v5Var.f38854c, saveToGallerySettingsActivity.getThemedColor(i7), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.m6.f28072n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z9, boolean z10) {
        float f10;
        if (this.f45878s != z9) {
            this.f45878s = z9;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f45879w.e(z10, f10);
            invalidate();
        }
    }
}
