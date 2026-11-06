package org.telegram.ui.Components;
public final class re implements r1.d {
    public boolean f37616a = false;
    public final float f37617b;
    public final it0 f37618c;

    public re(float f10, it0 it0Var) {
        this.f37617b = f10;
        this.f37618c = it0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        if (!this.f37616a && f10 >= this.f37617b) {
            this.f37616a = true;
            try {
                this.f37618c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
