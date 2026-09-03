package org.telegram.ui.Components;
public final class ze implements o1.g {
    public boolean f31368a = false;
    public final float f31369b;
    public final fv0 f31370c;

    public ze(float f10, fv0 fv0Var) {
        this.f31369b = f10;
        this.f31370c = fv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        if (!this.f31368a && f10 >= this.f31369b) {
            this.f31368a = true;
            try {
                this.f31370c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
