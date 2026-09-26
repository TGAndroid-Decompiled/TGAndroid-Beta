package org.telegram.ui.Components;
public final class kf implements o1.g {
    public boolean f25717a = false;
    public final float f25718b;
    public final rv0 f25719c;

    public kf(float f7, rv0 rv0Var) {
        this.f25718b = f7;
        this.f25719c = rv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f25717a && f7 >= this.f25718b) {
            this.f25717a = true;
            try {
                this.f25719c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
