package org.telegram.ui.Components;
public final class re implements r1.d {
    public boolean f37637a = false;
    public final float f37638b;
    public final it0 f37639c;

    public re(float f10, it0 it0Var) {
        this.f37638b = f10;
        this.f37639c = it0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        if (!this.f37637a && f10 >= this.f37638b) {
            this.f37637a = true;
            try {
                this.f37639c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
