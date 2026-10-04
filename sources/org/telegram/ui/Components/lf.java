package org.telegram.ui.Components;
public final class lf implements o1.g {
    public boolean f28361a = false;
    public final float f28362b;
    public final bw0 f28363c;

    public lf(float f7, bw0 bw0Var) {
        this.f28362b = f7;
        this.f28363c = bw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f28361a && f7 >= this.f28362b) {
            this.f28361a = true;
            try {
                this.f28363c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
