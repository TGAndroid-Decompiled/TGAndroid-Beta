package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class f41 extends org.telegram.ui.Components.k6 {
    public boolean f36654s;
    public final org.telegram.ui.Components.z5 v;
    public final SaveToGallerySettingsActivity f36655w;

    public f41(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f36655w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.z5(this);
        getDrawable().D = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f36654s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.z5 z5Var = this.v;
        z5Var.d(f10, false);
        int i10 = org.telegram.ui.ActionBar.k6.f22038y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f36655w;
        setTextColor(i0.a.d(z5Var.f33763c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.f21841n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z4, boolean z10) {
        float f10;
        if (this.f36654s != z4) {
            this.f36654s = z4;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.v.d(f10, z10);
            invalidate();
        }
    }
}
