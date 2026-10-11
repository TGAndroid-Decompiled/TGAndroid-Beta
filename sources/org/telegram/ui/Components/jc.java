package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class jc extends pb {
    public float f27664a;
    public ic f27665b;
    public y9 f27666c;
    public r6 d;
    public boolean f27667e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f7) {
        boolean z10;
        float f10;
        boolean z11 = this.f27667e;
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
            this.f27667e = z12;
            ViewPropertyAnimator animate = this.f27666c.animate();
            if (this.f27667e) {
                f10 = 0.78f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (this.f27667e) {
                f11 = 0.78f;
            }
            scaleX.scaleY(f11).setDuration(320L).setInterpolator(is.h).start();
        }
        this.f27664a = f7;
        this.f27665b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
