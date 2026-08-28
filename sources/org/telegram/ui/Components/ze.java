package org.telegram.ui.Components;
public final class ze implements o1.g {
    public boolean f35283a = false;
    public final float f35284b;
    public final mu0 f35285c;

    public ze(float f10, mu0 mu0Var) {
        this.f35284b = f10;
        this.f35285c = mu0Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        if (!this.f35283a && f10 >= this.f35284b) {
            this.f35283a = true;
            try {
                this.f35285c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
