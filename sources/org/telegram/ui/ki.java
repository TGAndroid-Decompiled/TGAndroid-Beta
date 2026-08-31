package org.telegram.ui;
public final class ki implements org.telegram.ui.Components.bh0 {
    public boolean f38417a = true;
    public final org.telegram.ui.Components.rk0 f38418b;

    public ki(org.telegram.ui.Components.rk0 rk0Var) {
        this.f38418b = rk0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.rk0 rk0Var = this.f38418b;
        if (f10 == 0.0f && !this.f38417a) {
            rk0Var.r(false);
            this.f38417a = true;
        } else if (f10 == 1.0f && this.f38417a) {
            rk0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f38417a = false;
            }
        }
    }
}
