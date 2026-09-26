package org.telegram.ui;
public final class li implements org.telegram.ui.Components.fh0 {
    public boolean f35363a = true;
    public final org.telegram.ui.Components.rk0 f35364b;

    public li(org.telegram.ui.Components.rk0 rk0Var) {
        this.f35364b = rk0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.rk0 rk0Var = this.f35364b;
        if (f7 == 0.0f && !this.f35363a) {
            rk0Var.r(false);
            this.f35363a = true;
        } else if (f7 == 1.0f && this.f35363a) {
            rk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f35363a = false;
            }
        }
    }
}
