package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class tb extends za {
    public float f38306a;
    public sb f38307b;
    public l9 f38308c;
    public j6 d;
    public boolean f38309e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f10) {
        boolean z9;
        float f11;
        boolean z10 = this.f38309e;
        float f12 = 1.0f;
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        boolean z11 = false;
        if (i7 < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z10 != z9) {
            if (i7 < 0) {
                z11 = true;
            }
            this.f38309e = z11;
            ViewPropertyAnimator animate = this.f38308c.animate();
            if (this.f38309e) {
                f11 = 0.78f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f11);
            if (this.f38309e) {
                f12 = 0.78f;
            }
            scaleX.scaleY(f12).setDuration(320L).setInterpolator(xq.h).start();
        }
        this.f38306a = f10;
        this.f38307b.invalidate();
    }

    public void setTextColor(int i7) {
        this.d.setTextColor(i7);
    }
}
