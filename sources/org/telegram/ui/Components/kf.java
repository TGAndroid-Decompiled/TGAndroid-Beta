package org.telegram.ui.Components;
public final class kf implements o1.g {
    public boolean f25773a = false;
    public final float f25774b;
    public final qv0 f25775c;

    public kf(float f7, qv0 qv0Var) {
        this.f25774b = f7;
        this.f25775c = qv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f25773a && f7 >= this.f25774b) {
            this.f25773a = true;
            try {
                this.f25775c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
