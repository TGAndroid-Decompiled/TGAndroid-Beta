package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class ic extends ob {
    public float f25068a;
    public hc f25069b;
    public w9 f25070c;
    public p6 d;
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
            ViewPropertyAnimator animate = this.f25070c.animate();
            if (this.e) {
                f10 = 0.78f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (this.e) {
                f11 = 0.78f;
            }
            scaleX.scaleY(f11).setDuration(320L).setInterpolator(tr.h).start();
        }
        this.f25068a = f7;
        this.f25069b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
