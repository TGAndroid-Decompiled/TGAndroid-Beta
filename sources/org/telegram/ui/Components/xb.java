package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class xb extends eb {
    public float f42038a;
    public wb f42039b;
    public q9 f42040c;
    public o6 d;
    public boolean f42041e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f10) {
        boolean z10;
        float f11;
        boolean z11 = this.f42041e;
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
            this.f42041e = z12;
            ViewPropertyAnimator animate = this.f42040c.animate();
            if (this.f42041e) {
                f11 = 0.78f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f11);
            if (this.f42041e) {
                f12 = 0.78f;
            }
            scaleX.scaleY(f12).setDuration(320L).setInterpolator(nr.h).start();
        }
        this.f42038a = f10;
        this.f42039b.invalidate();
    }

    public void setTextColor(int i7) {
        this.d.setTextColor(i7);
    }
}
