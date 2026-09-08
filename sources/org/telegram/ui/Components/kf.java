package org.telegram.ui.Components;
public final class kf implements o1.g {
    public boolean f27838a = false;
    public final float f27839b;
    public final ev0 f27840c;

    public kf(float f7, ev0 ev0Var) {
        this.f27839b = f7;
        this.f27840c = ev0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f27838a && f7 >= this.f27839b) {
            this.f27838a = true;
            try {
                this.f27840c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
