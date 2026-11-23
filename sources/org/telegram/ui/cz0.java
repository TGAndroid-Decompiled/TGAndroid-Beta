package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class cz0 extends org.telegram.ui.Components.n6 {
    public boolean f46915s;
    public final org.telegram.ui.Components.c6 f46916w;
    public final SaveToGallerySettingsActivity f46917x;

    public cz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f46917x = saveToGallerySettingsActivity;
        this.f46916w = new org.telegram.ui.Components.c6(this);
        getDrawable().K = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f46915s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.c6 c6Var = this.f46916w;
        c6Var.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.n6.f29843y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f46917x;
        setTextColor(i0.a.f(c6Var.f33931c, saveToGallerySettingsActivity.getThemedColor(i7), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.n6.f29633n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f10;
        if (this.f46915s != z10) {
            this.f46915s = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f46916w.e(z11, f10);
            invalidate();
        }
    }
}
