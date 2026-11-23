package org.telegram.ui.Components;
public final class af implements r1.d {
    public boolean f33507a = false;
    public final float f33508b;
    public final ut0 f33509c;

    public af(float f10, ut0 ut0Var) {
        this.f33508b = f10;
        this.f33509c = ut0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        if (!this.f33507a && f10 >= this.f33508b) {
            this.f33507a = true;
            try {
                this.f33509c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
