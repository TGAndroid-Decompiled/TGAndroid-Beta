package org.telegram.ui.Components;
public final class jf implements o1.g {
    public boolean f25362a = false;
    public final float f25363b;
    public final sv0 f25364c;

    public jf(float f7, sv0 sv0Var) {
        this.f25363b = f7;
        this.f25364c = sv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f25362a && f7 >= this.f25363b) {
            this.f25362a = true;
            try {
                this.f25364c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
