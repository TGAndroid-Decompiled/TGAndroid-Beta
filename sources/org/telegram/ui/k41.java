package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class k41 extends org.telegram.ui.Components.p6 {
    public boolean f37843s;
    public final org.telegram.ui.Components.e6 v;
    public final SaveToGallerySettingsActivity f37844w;

    public k41(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f37844w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.e6(this);
        getDrawable().D = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f37843s) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.e6 e6Var = this.v;
        e6Var.d(f7, false);
        int i10 = org.telegram.ui.ActionBar.i6.f21214y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f37844w;
        setTextColor(i0.a.d(e6Var.f25987c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f21013n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        if (this.f37843s != z10) {
            this.f37843s = z10;
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
