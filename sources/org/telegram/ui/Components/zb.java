package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class zb extends eb {
    public float f33893a;
    public yb f33894b;
    public p9 f33895c;
    public k6 d;
    public boolean f33896e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f10) {
        boolean z4;
        float f11;
        boolean z10 = this.f33896e;
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
            this.f33896e = z11;
            ViewPropertyAnimator animate = this.f33895c.animate();
            if (this.f33896e) {
                f11 = 0.78f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f11);
            if (this.f33896e) {
                f12 = 0.78f;
            }
            scaleX.scaleY(f12).setDuration(320L).setInterpolator(pr.h).start();
        }
        this.f33893a = f10;
        this.f33894b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
