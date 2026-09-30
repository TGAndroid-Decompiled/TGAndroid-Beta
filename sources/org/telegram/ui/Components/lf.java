package org.telegram.ui.Components;
public final class lf implements o1.g {
    public boolean f25974a = false;
    public final float f25975b;
    public final tv0 f25976c;

    public lf(float f7, tv0 tv0Var) {
        this.f25975b = f7;
        this.f25976c = tv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f25974a && f7 >= this.f25975b) {
            this.f25974a = true;
            try {
                this.f25976c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
