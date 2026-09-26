package org.telegram.ui.Components;
public final class kf implements o1.g {
    public boolean f25772a = false;
    public final float f25773b;
    public final qv0 f25774c;

    public kf(float f7, qv0 qv0Var) {
        this.f25773b = f7;
        this.f25774c = qv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f25772a && f7 >= this.f25773b) {
            this.f25772a = true;
            try {
                this.f25774c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
