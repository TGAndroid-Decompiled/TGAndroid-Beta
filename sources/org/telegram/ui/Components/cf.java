package org.telegram.ui.Components;
public final class cf implements o1.h {
    public boolean f27463a = false;
    public final float f27464b;
    public final xu0 f27465c;

    public cf(float f9, xu0 xu0Var) {
        this.f27464b = f9;
        this.f27465c = xu0Var;
    }

    @Override
    public final void a(o1.i iVar, float f9, float f10) {
        if (!this.f27463a && f9 >= this.f27464b) {
            this.f27463a = true;
            try {
                this.f27465c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
