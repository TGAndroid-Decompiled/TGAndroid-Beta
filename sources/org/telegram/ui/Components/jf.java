package org.telegram.ui.Components;
public final class jf implements o1.g {
    public boolean f27522a = false;
    public final float f27523b;
    public final zv0 f27524c;

    public jf(float f7, zv0 zv0Var) {
        this.f27523b = f7;
        this.f27524c = zv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f27522a && f7 >= this.f27523b) {
            this.f27522a = true;
            try {
                this.f27524c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
