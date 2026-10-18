package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class h31 extends org.telegram.ui.Components.q6 {
    public boolean f37395s;
    public final org.telegram.ui.Components.f6 v;
    public final SaveToGallerySettingsActivity f37396w;

    public h31(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f37396w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.f6(this);
        getDrawable().J = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f37395s) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.f6 f6Var = this.v;
        f6Var.d(f7, false);
        int i10 = org.telegram.ui.ActionBar.h6.f21374y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f37396w;
        setTextColor(i0.a.f(f6Var.f26093c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f21169n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        if (this.f37395s != z10) {
            this.f37395s = z10;
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
