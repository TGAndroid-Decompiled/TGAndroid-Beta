package org.telegram.ui.Components;
public final class lf implements o1.g {
    public boolean f28464a = false;
    public final float f28465b;
    public final cw0 f28466c;

    public lf(float f7, cw0 cw0Var) {
        this.f28465b = f7;
        this.f28466c = cw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f28464a && f7 >= this.f28465b) {
            this.f28464a = true;
            try {
                this.f28466c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
