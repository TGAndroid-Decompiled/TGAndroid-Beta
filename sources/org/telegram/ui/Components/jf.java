package org.telegram.ui.Components;
public final class jf implements o1.g {
    public boolean f25264a = false;
    public final float f25265b;
    public final fv0 f25266c;

    public jf(float f7, fv0 fv0Var) {
        this.f25265b = f7;
        this.f25266c = fv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f25264a && f7 >= this.f25265b) {
            this.f25264a = true;
            try {
                this.f25266c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
