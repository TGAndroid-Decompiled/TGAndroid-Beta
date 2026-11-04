package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class rb extends ya {
    public float f37697a;
    public qb f37698b;
    public k9 f37699c;
    public h6 d;
    public boolean f37700e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f10) {
        boolean z10;
        float f11;
        boolean z11 = this.f37700e;
        float f12 = 1.0f;
        int i3 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        boolean z12 = false;
        if (i3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            if (i3 < 0) {
                z12 = true;
            }
            this.f37700e = z12;
            ViewPropertyAnimator animate = this.f37699c.animate();
            if (this.f37700e) {
                f11 = 0.78f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f11);
            if (this.f37700e) {
                f12 = 0.78f;
            }
            scaleX.scaleY(f12).setDuration(320L).setInterpolator(xq.h).start();
        }
        this.f37697a = f10;
        this.f37698b.invalidate();
    }

    public void setTextColor(int i3) {
        this.d.setTextColor(i3);
    }
}
