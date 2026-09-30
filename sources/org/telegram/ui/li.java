package org.telegram.ui;
public final class li implements org.telegram.ui.Components.hh0 {
    public boolean f35455a = true;
    public final org.telegram.ui.Components.tk0 f35456b;

    public li(org.telegram.ui.Components.tk0 tk0Var) {
        this.f35456b = tk0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.tk0 tk0Var = this.f35456b;
        if (f7 == 0.0f && !this.f35455a) {
            tk0Var.r(false);
            this.f35455a = true;
        } else if (f7 == 1.0f && this.f35455a) {
            tk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f35455a = false;
            }
        }
    }
}
