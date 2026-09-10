package org.telegram.ui.Components;
public final class lf implements o1.g {
    public boolean f24972a = false;
    public final float f24973b;
    public final pv0 f24974c;

    public lf(float f7, pv0 pv0Var) {
        this.f24973b = f7;
        this.f24974c = pv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f24972a && f7 >= this.f24973b) {
            this.f24972a = true;
            try {
                this.f24974c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
