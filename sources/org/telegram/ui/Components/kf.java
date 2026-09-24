package org.telegram.ui.Components;
public final class kf implements o1.g {
    public boolean f25754a = false;
    public final float f25755b;
    public final qv0 f25756c;

    public kf(float f7, qv0 qv0Var) {
        this.f25755b = f7;
        this.f25756c = qv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f25754a && f7 >= this.f25755b) {
            this.f25754a = true;
            try {
                this.f25756c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
