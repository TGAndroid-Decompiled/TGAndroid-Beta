package org.telegram.ui.Components;
public final class kf implements o1.g {
    public boolean f27811a = false;
    public final float f27812b;
    public final ev0 f27813c;

    public kf(float f7, ev0 ev0Var) {
        this.f27812b = f7;
        this.f27813c = ev0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f27811a && f7 >= this.f27812b) {
            this.f27811a = true;
            try {
                this.f27813c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
