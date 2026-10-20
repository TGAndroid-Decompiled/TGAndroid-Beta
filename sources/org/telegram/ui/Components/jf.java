package org.telegram.ui.Components;
public final class jf implements o1.g {
    public boolean f27512a = false;
    public final float f27513b;
    public final bw0 f27514c;

    public jf(float f7, bw0 bw0Var) {
        this.f27513b = f7;
        this.f27514c = bw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f27512a && f7 >= this.f27513b) {
            this.f27512a = true;
            try {
                this.f27514c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
