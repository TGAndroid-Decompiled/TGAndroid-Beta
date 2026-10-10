package org.telegram.ui;
public final class oi implements org.telegram.ui.Components.xh0 {
    public boolean f40582a = true;
    public final org.telegram.ui.Components.ll0 f40583b;

    public oi(org.telegram.ui.Components.ll0 ll0Var) {
        this.f40583b = ll0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.ll0 ll0Var = this.f40583b;
        if (i10 == 0 && !this.f40582a) {
            ll0Var.r(false);
            this.f40582a = true;
        } else if (f7 == 1.0f && this.f40582a) {
            ll0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f40582a = false;
            }
        }
    }
}
