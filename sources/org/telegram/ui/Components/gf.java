package org.telegram.ui.Components;
public final class gf implements o1.g {
    public boolean f24330a = false;
    public final float f24331b;
    public final fv0 f24332c;

    public gf(float f7, fv0 fv0Var) {
        this.f24331b = f7;
        this.f24332c = fv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f24330a && f7 >= this.f24331b) {
            this.f24330a = true;
            try {
                this.f24332c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
