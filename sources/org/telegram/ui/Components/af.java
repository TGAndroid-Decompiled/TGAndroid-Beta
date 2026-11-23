package org.telegram.ui.Components;
public final class af implements r1.d {
    public boolean f33473a = false;
    public final float f33474b;
    public final ut0 f33475c;

    public af(float f10, ut0 ut0Var) {
        this.f33474b = f10;
        this.f33475c = ut0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        if (!this.f33473a && f10 >= this.f33474b) {
            this.f33473a = true;
            try {
                this.f33475c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
