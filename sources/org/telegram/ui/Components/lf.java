package org.telegram.ui.Components;
public final class lf implements o1.g {
    public boolean f28356a = false;
    public final float f28357b;
    public final bw0 f28358c;

    public lf(float f7, bw0 bw0Var) {
        this.f28357b = f7;
        this.f28358c = bw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f28356a && f7 >= this.f28357b) {
            this.f28356a = true;
            try {
                this.f28358c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
