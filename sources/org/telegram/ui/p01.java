package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class p01 extends org.telegram.ui.Components.f6 {
    public boolean f40316s;
    public final org.telegram.ui.Components.t5 f40317w;
    public final SaveToGallerySettingsActivity f40318x;

    public p01(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f40318x = saveToGallerySettingsActivity;
        this.f40317w = new org.telegram.ui.Components.t5(this);
        getDrawable().J = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f40316s) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.t5 t5Var = this.f40317w;
        t5Var.e(false, f7);
        int i10 = org.telegram.ui.ActionBar.t6.f21312y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f40318x;
        setTextColor(i0.b.f(t5Var.f30530c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.t6.f21116n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        if (this.f40316s != z10) {
            this.f40316s = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f40317w.e(z11, f7);
            invalidate();
        }
    }
}
