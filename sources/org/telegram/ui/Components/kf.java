package org.telegram.ui.Components;
public final class kf implements o1.g {
    public boolean f27839a = false;
    public final float f27840b;
    public final ev0 f27841c;

    public kf(float f7, ev0 ev0Var) {
        this.f27840b = f7;
        this.f27841c = ev0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f27839a && f7 >= this.f27840b) {
            this.f27839a = true;
            try {
                this.f27841c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
