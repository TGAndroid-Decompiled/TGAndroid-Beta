package org.telegram.ui.Components;
public final class bf implements r1.d {
    public boolean f33749a = false;
    public final float f33750b;
    public final tt0 f33751c;

    public bf(float f10, tt0 tt0Var) {
        this.f33750b = f10;
        this.f33751c = tt0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        if (!this.f33749a && f10 >= this.f33750b) {
            this.f33749a = true;
            try {
                this.f33751c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
