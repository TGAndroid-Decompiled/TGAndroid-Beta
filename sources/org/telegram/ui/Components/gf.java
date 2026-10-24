package org.telegram.ui.Components;
public final class gf implements o1.g {
    public boolean f26650a = false;
    public final float f26651b;
    public final dw0 f26652c;

    public gf(float f7, dw0 dw0Var) {
        this.f26651b = f7;
        this.f26652c = dw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f26650a && f7 >= this.f26651b) {
            this.f26650a = true;
            try {
                this.f26652c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
