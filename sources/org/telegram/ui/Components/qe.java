package org.telegram.ui.Components;
public final class qe implements r1.d {
    public boolean f37273a = false;
    public final float f37274b;
    public final jt0 f37275c;

    public qe(float f10, jt0 jt0Var) {
        this.f37274b = f10;
        this.f37275c = jt0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        if (!this.f37273a && f10 >= this.f37274b) {
            this.f37273a = true;
            try {
                this.f37275c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
