package org.telegram.ui.Components;
public final class lf implements o1.g {
    public boolean f27034a = false;
    public final float f27035b;
    public final ew0 f27036c;

    public lf(float f7, ew0 ew0Var) {
        this.f27035b = f7;
        this.f27036c = ew0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f27034a && f7 >= this.f27035b) {
            this.f27034a = true;
            try {
                this.f27036c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
