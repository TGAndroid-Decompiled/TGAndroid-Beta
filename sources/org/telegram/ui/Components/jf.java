package org.telegram.ui.Components;
public final class jf implements o1.g {
    public boolean f27518a = false;
    public final float f27519b;
    public final aw0 f27520c;

    public jf(float f7, aw0 aw0Var) {
        this.f27519b = f7;
        this.f27520c = aw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f27518a && f7 >= this.f27519b) {
            this.f27518a = true;
            try {
                this.f27520c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
