package org.telegram.ui.Components;
public final class jf implements o1.g {
    public boolean f27516a = false;
    public final float f27517b;
    public final aw0 f27518c;

    public jf(float f7, aw0 aw0Var) {
        this.f27517b = f7;
        this.f27518c = aw0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f27516a && f7 >= this.f27517b) {
            this.f27516a = true;
            try {
                this.f27518c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
