package org.telegram.ui.Components;
public final class re implements r1.d {
    public boolean f37656a = false;
    public final float f37657b;
    public final it0 f37658c;

    public re(float f10, it0 it0Var) {
        this.f37657b = f10;
        this.f37658c = it0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        if (!this.f37656a && f10 >= this.f37657b) {
            this.f37656a = true;
            try {
                this.f37658c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
