package org.telegram.ui.Components;
public final class ze implements o1.g {
    public boolean f33886a = false;
    public final float f33887b;
    public final gv0 f33888c;

    public ze(float f10, gv0 gv0Var) {
        this.f33887b = f10;
        this.f33888c = gv0Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        if (!this.f33886a && f10 >= this.f33887b) {
            this.f33886a = true;
            try {
                this.f33888c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
