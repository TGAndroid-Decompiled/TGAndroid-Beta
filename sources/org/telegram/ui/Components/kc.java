package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class kc extends qb {
    public float f27970a;
    public jc f27971b;
    public y9 f27972c;
    public r6 d;
    public boolean f27973e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f7) {
        boolean z10;
        float f10;
        boolean z11 = this.f27973e;
        float f11 = 1.0f;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        boolean z12 = false;
        if (i10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            if (i10 < 0) {
                z12 = true;
            }
            this.f27973e = z12;
            ViewPropertyAnimator animate = this.f27972c.animate();
            if (this.f27973e) {
                f10 = 0.78f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (this.f27973e) {
                f11 = 0.78f;
            }
            scaleX.scaleY(f11).setDuration(320L).setInterpolator(is.h).start();
        }
        this.f27970a = f7;
        this.f27971b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
