package org.telegram.ui.Components;
public final class jf implements o1.g {
    public boolean f25316a = false;
    public final float f25317b;
    public final rv0 f25318c;

    public jf(float f7, rv0 rv0Var) {
        this.f25317b = f7;
        this.f25318c = rv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f25316a && f7 >= this.f25317b) {
            this.f25316a = true;
            try {
                this.f25318c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
