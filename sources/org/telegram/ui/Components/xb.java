package org.telegram.ui.Components;

import android.view.ViewPropertyAnimator;
public final class xb extends eb {
    public float f34633a;
    public wb f34634b;
    public o9 f34635c;
    public j6 d;
    public boolean f34636e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f10) {
        boolean z10;
        float f11;
        boolean z11 = this.f34636e;
        boolean z12 = false;
        float f12 = 1.0f;
        int i9 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i9 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            if (i9 < 0) {
                z12 = true;
            }
            this.f34636e = z12;
            ViewPropertyAnimator animate = this.f34635c.animate();
            if (this.f34636e) {
                f11 = 0.78f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f11);
            if (this.f34636e) {
                f12 = 0.78f;
            }
            scaleX.scaleY(f12).setDuration(320L).setInterpolator(gr.h).start();
        }
        this.f34633a = f10;
        this.f34634b.invalidate();
    }

    public void setTextColor(int i9) {
        this.d.setTextColor(i9);
    }
}
