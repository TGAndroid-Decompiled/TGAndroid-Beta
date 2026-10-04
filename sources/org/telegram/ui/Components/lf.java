package org.telegram.ui.Components;
public final class lf implements o1.g {
    public boolean f28355a = false;
    public final float f28356b;
    public final bw0 f28357c;

    public lf(float f7, bw0 bw0Var) {
        this.f28356b = f7;
        this.f28357c = bw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f28355a && f7 >= this.f28356b) {
            this.f28355a = true;
            try {
                this.f28357c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
