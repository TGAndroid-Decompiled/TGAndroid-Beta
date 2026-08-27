package org.telegram.ui.Components;

public final class ve implements o1.g {

    public boolean f33375a = false;

    public final float f33376b;

    public final pu0 f33377c;

    public ve(float f10, pu0 pu0Var) {
        this.f33376b = f10;
        this.f33377c = pu0Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        if (this.f33375a || f10 < this.f33376b) {
            return;
        }
        this.f33375a = true;
        try {
            this.f33377c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
