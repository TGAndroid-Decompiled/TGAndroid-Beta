package org.telegram.ui.Components;
public final class jf implements o1.g {
    public boolean f29630a = false;
    public final float f29631b;
    public final mw0 f29632c;

    public jf(float f7, mw0 mw0Var) {
        this.f29631b = f7;
        this.f29632c = mw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f29630a && f7 >= this.f29631b) {
            this.f29630a = true;
            try {
                this.f29632c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
