package org.telegram.ui.Components;
public final class jf implements o1.g {
    public boolean f27680a = false;
    public final float f27681b;
    public final ew0 f27682c;

    public jf(float f7, ew0 ew0Var) {
        this.f27681b = f7;
        this.f27682c = ew0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f27680a && f7 >= this.f27681b) {
            this.f27680a = true;
            try {
                this.f27682c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
