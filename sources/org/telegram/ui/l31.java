package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

public final class l31 extends org.telegram.ui.Components.j6 {

    public boolean f39933s;
    public final org.telegram.ui.Components.y5 v;

    public final SaveToGallerySettingsActivity f39934w;

    public l31(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f39934w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.y5(this);
        getDrawable().D = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10 = this.f39933s ? 1.0f : 0.0f;
        org.telegram.ui.Components.y5 y5Var = this.v;
        y5Var.d(f10, false);
        int i10 = org.telegram.ui.ActionBar.g6.f23423y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39934w;
        setTextColor(i0.b.d(y5Var.f34812c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f23234n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        if (this.f39933s != z10) {
            this.f39933s = z10;
            this.v.d(z10 ? 1.0f : 0.0f, z11);
            invalidate();
        }
    }
}
