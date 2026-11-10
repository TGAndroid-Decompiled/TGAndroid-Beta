package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class sb extends ya {
    public float f37912a;
    public rb f37913b;
    public k9 f37914c;
    public i6 d;
    public boolean f37915e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f10) {
        boolean z9;
        float f11;
        boolean z10 = this.f37915e;
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
            this.f37915e = z11;
            ViewPropertyAnimator animate = this.f37914c.animate();
            if (this.f37915e) {
                f11 = 0.78f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f11);
            if (this.f37915e) {
                f12 = 0.78f;
            }
            scaleX.scaleY(f12).setDuration(320L).setInterpolator(wq.h).start();
        }
        this.f37912a = f10;
        this.f37913b.invalidate();
    }

    public void setTextColor(int i7) {
        this.d.setTextColor(i7);
    }
}
