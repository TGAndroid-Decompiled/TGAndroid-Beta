package org.telegram.ui.Components;
public final class kf implements o1.g {
    public boolean f25716a = false;
    public final float f25717b;
    public final sv0 f25718c;

    public kf(float f7, sv0 sv0Var) {
        this.f25717b = f7;
        this.f25718c = sv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f25716a && f7 >= this.f25717b) {
            this.f25716a = true;
            try {
                this.f25718c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
