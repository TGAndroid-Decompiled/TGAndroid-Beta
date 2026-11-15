package org.telegram.ui.Components;
public final class re implements r1.d {
    public boolean f38955a = false;
    public final float f38956b;
    public final jt0 f38957c;

    public re(float f10, jt0 jt0Var) {
        this.f38956b = f10;
        this.f38957c = jt0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        if (!this.f38955a && f10 >= this.f38956b) {
            this.f38955a = true;
            try {
                this.f38957c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
