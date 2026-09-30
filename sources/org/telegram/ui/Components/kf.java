package org.telegram.ui.Components;
public final class kf implements o1.g {
    public boolean f25682a = false;
    public final float f25683b;
    public final sv0 f25684c;

    public kf(float f7, sv0 sv0Var) {
        this.f25683b = f7;
        this.f25684c = sv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        if (!this.f25682a && f7 >= this.f25683b) {
            this.f25682a = true;
            try {
                this.f25684c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
