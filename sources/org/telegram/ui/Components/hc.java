package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class hc extends nb {
    public float f26701a;
    public gc f26702b;
    public x9 f26703c;
    public q6 d;
    public boolean f26704e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f7) {
        boolean z10;
        float f10;
        boolean z11 = this.f26704e;
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
            this.f26704e = z12;
            ViewPropertyAnimator animate = this.f26703c.animate();
            if (this.f26704e) {
                f10 = 0.78f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (this.f26704e) {
                f11 = 0.78f;
            }
            scaleX.scaleY(f11).setDuration(320L).setInterpolator(pr.h).start();
        }
        this.f26701a = f7;
        this.f26702b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
