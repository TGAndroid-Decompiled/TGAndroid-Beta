package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class xb extends eb {
    public float f41958a;
    public wb f41959b;
    public q9 f41960c;
    public n6 d;
    public boolean f41961e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f10) {
        boolean z10;
        float f11;
        boolean z11 = this.f41961e;
        float f12 = 1.0f;
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        boolean z12 = false;
        if (i7 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            if (i7 < 0) {
                z12 = true;
            }
            this.f41961e = z12;
            ViewPropertyAnimator animate = this.f41960c.animate();
            if (this.f41961e) {
                f11 = 0.78f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f11);
            if (this.f41961e) {
                f12 = 0.78f;
            }
            scaleX.scaleY(f12).setDuration(320L).setInterpolator(lr.h).start();
        }
        this.f41958a = f10;
        this.f41959b.invalidate();
    }

    public void setTextColor(int i7) {
        this.d.setTextColor(i7);
    }
}
