package org.telegram.ui.Components;
public final class re implements r1.d {
    public boolean f38952a = false;
    public final float f38953b;
    public final jt0 f38954c;

    public re(float f10, jt0 jt0Var) {
        this.f38953b = f10;
        this.f38954c = jt0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        if (!this.f38952a && f10 >= this.f38953b) {
            this.f38952a = true;
            try {
                this.f38954c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
