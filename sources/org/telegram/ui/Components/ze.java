package org.telegram.ui.Components;
public final class ze implements o1.g {
    public boolean f31334a = false;
    public final float f31335b;
    public final fv0 f31336c;

    public ze(float f10, fv0 fv0Var) {
        this.f31335b = f10;
        this.f31336c = fv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        if (!this.f31334a && f10 >= this.f31335b) {
            this.f31334a = true;
            try {
                this.f31336c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
