package org.telegram.ui.Components;
public final class kf implements o1.g {
    public boolean f25683a = false;
    public final float f25684b;
    public final sv0 f25685c;

    public kf(float f7, sv0 sv0Var) {
        this.f25684b = f7;
        this.f25685c = sv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f25683a && f7 >= this.f25684b) {
            this.f25683a = true;
            try {
                this.f25685c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
