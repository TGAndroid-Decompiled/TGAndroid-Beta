package org.telegram.ui.Components;
public final class re implements r1.d {
    public boolean f37682a = false;
    public final float f37683b;
    public final kt0 f37684c;

    public re(float f10, kt0 kt0Var) {
        this.f37683b = f10;
        this.f37684c = kt0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        if (!this.f37682a && f10 >= this.f37683b) {
            this.f37682a = true;
            try {
                this.f37684c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
