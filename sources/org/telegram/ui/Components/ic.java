package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class ic extends ob {
    public float f27452a;
    public hc f27453b;
    public w9 f27454c;
    public p6 d;
    public boolean f27455e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f7) {
        boolean z10;
        float f10;
        boolean z11 = this.f27455e;
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
            this.f27455e = z12;
            ViewPropertyAnimator animate = this.f27454c.animate();
            if (this.f27455e) {
                f10 = 0.78f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (this.f27455e) {
                f11 = 0.78f;
            }
            scaleX.scaleY(f11).setDuration(320L).setInterpolator(tr.h).start();
        }
        this.f27452a = f7;
        this.f27453b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
