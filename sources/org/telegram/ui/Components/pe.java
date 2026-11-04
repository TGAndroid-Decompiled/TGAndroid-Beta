package org.telegram.ui.Components;
public final class pe implements q1.d {
    public boolean f37141a = false;
    public final float f37142b;
    public final ht0 f37143c;

    public pe(float f10, ht0 ht0Var) {
        this.f37142b = f10;
        this.f37143c = ht0Var;
    }

    @Override
    public final void a(q1.g gVar, float f10, float f11) {
        if (!this.f37141a && f10 >= this.f37142b) {
            this.f37141a = true;
            try {
                this.f37143c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
