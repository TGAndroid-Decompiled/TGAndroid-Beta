package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class zb extends eb {
    public float f31324a;
    public yb f31325b;
    public p9 f31326c;
    public k6 d;
    public boolean e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f10) {
        boolean z4;
        float f11;
        boolean z10 = this.e;
        boolean z11 = false;
        float f12 = 1.0f;
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i10 < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z10 != z4) {
            if (i10 < 0) {
                z11 = true;
            }
            this.e = z11;
            ViewPropertyAnimator animate = this.f31326c.animate();
            if (this.e) {
                f11 = 0.78f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f11);
            if (this.e) {
                f12 = 0.78f;
            }
            scaleX.scaleY(f12).setDuration(320L).setInterpolator(mr.h).start();
        }
        this.f31324a = f10;
        this.f31325b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
