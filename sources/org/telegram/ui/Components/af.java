package org.telegram.ui.Components;
public final class af implements r1.d {
    public boolean f33494a = false;
    public final float f33495b;
    public final ut0 f33496c;

    public af(float f10, ut0 ut0Var) {
        this.f33495b = f10;
        this.f33496c = ut0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        if (!this.f33494a && f10 >= this.f33495b) {
            this.f33494a = true;
            try {
                this.f33496c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
