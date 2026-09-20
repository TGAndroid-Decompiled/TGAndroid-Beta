package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class gc extends mb {
    public float f24329a;
    public fc f24330b;
    public v9 f24331c;
    public o6 d;
    public boolean e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f7) {
        boolean z10;
        float f10;
        boolean z11 = this.e;
        boolean z12 = false;
        float f11 = 1.0f;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            if (i10 < 0) {
                z12 = true;
            }
            this.e = z12;
            ViewPropertyAnimator animate = this.f24331c.animate();
            if (this.e) {
                f10 = 0.78f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (this.e) {
                f11 = 0.78f;
            }
            scaleX.scaleY(f11).setDuration(320L).setInterpolator(qr.h).start();
        }
        this.f24329a = f7;
        this.f24330b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
