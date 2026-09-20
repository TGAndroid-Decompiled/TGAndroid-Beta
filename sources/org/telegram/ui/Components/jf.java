package org.telegram.ui.Components;
public final class jf implements o1.g {
    public boolean f25357a = false;
    public final float f25358b;
    public final qv0 f25359c;

    public jf(float f7, qv0 qv0Var) {
        this.f25358b = f7;
        this.f25359c = qv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f25357a && f7 >= this.f25358b) {
            this.f25357a = true;
            try {
                this.f25359c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
