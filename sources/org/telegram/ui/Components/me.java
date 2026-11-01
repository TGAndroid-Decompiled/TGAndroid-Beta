package org.telegram.ui.Components;
public final class me implements o1.g {
    public boolean f28460a = false;
    public final float f28461b;
    public final mu0 f28462c;

    public me(float f7, mu0 mu0Var) {
        this.f28461b = f7;
        this.f28462c = mu0Var;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        if (!this.f28460a && f7 >= this.f28461b) {
            this.f28460a = true;
            try {
                this.f28462c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
