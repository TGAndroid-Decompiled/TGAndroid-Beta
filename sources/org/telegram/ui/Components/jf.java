package org.telegram.ui.Components;
public final class jf implements o1.g {
    public boolean f29628a = false;
    public final float f29629b;
    public final mw0 f29630c;

    public jf(float f7, mw0 mw0Var) {
        this.f29629b = f7;
        this.f29630c = mw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f29628a && f7 >= this.f29629b) {
            this.f29628a = true;
            try {
                this.f29630c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
