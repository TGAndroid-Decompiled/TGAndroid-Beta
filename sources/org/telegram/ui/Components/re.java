package org.telegram.ui.Components;
public final class re implements r1.d {
    public boolean f37713a = false;
    public final float f37714b;
    public final it0 f37715c;

    public re(float f10, it0 it0Var) {
        this.f37714b = f10;
        this.f37715c = it0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        if (!this.f37713a && f10 >= this.f37714b) {
            this.f37713a = true;
            try {
                this.f37715c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
