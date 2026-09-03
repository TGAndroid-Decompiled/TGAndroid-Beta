package org.telegram.ui.Components;
public final class ze implements o1.g {
    public boolean f33929a = false;
    public final float f33930b;
    public final fv0 f33931c;

    public ze(float f10, fv0 fv0Var) {
        this.f33930b = f10;
        this.f33931c = fv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        if (!this.f33929a && f10 >= this.f33930b) {
            this.f33929a = true;
            try {
                this.f33931c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
