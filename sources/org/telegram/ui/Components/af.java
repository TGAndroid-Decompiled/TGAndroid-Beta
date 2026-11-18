package org.telegram.ui.Components;
public final class af implements r1.d {
    public boolean f33340a = false;
    public final float f33341b;
    public final rt0 f33342c;

    public af(float f10, rt0 rt0Var) {
        this.f33341b = f10;
        this.f33342c = rt0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        if (!this.f33340a && f10 >= this.f33341b) {
            this.f33340a = true;
            try {
                this.f33342c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
