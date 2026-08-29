package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class dc extends jb {
    public float f27730a;
    public cc f27731b;
    public t9 f27732c;
    public o6 d;
    public boolean f27733e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f9) {
        boolean z10;
        float f10;
        boolean z11 = this.f27733e;
        boolean z12 = false;
        float f11 = 1.0f;
        int i10 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
        if (i10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            if (i10 < 0) {
                z12 = true;
            }
            this.f27733e = z12;
            ViewPropertyAnimator animate = this.f27732c.animate();
            if (this.f27733e) {
                f10 = 0.78f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (this.f27733e) {
                f11 = 0.78f;
            }
            scaleX.scaleY(f11).setDuration(320L).setInterpolator(jr.h).start();
        }
        this.f27730a = f9;
        this.f27731b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
