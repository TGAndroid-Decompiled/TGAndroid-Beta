package org.telegram.ui.Components;
public final class jf implements o1.g {
    public boolean f27515a = false;
    public final float f27516b;
    public final zv0 f27517c;

    public jf(float f7, zv0 zv0Var) {
        this.f27516b = f7;
        this.f27517c = zv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f27515a && f7 >= this.f27516b) {
            this.f27515a = true;
            try {
                this.f27517c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
