package org.telegram.ui.Components;
public final class kf implements o1.g {
    public boolean f27812a = false;
    public final float f27813b;
    public final ev0 f27814c;

    public kf(float f7, ev0 ev0Var) {
        this.f27813b = f7;
        this.f27814c = ev0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f27812a && f7 >= this.f27813b) {
            this.f27812a = true;
            try {
                this.f27814c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
