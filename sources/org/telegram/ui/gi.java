package org.telegram.ui;
public final class gi implements org.telegram.ui.Components.rh0 {
    public boolean f39699a = true;
    public final org.telegram.ui.Components.fl0 f39700b;

    public gi(org.telegram.ui.Components.fl0 fl0Var) {
        this.f39700b = fl0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.fl0 fl0Var = this.f39700b;
        if (i10 == 0 && !this.f39699a) {
            fl0Var.r(false);
            this.f39699a = true;
        } else if (f7 == 1.0f && this.f39699a) {
            fl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f39699a = false;
            }
        }
    }
}
