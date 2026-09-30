package org.telegram.ui;
public final class li implements org.telegram.ui.Components.gh0 {
    public boolean f35347a = true;
    public final org.telegram.ui.Components.sk0 f35348b;

    public li(org.telegram.ui.Components.sk0 sk0Var) {
        this.f35348b = sk0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.sk0 sk0Var = this.f35348b;
        if (f7 == 0.0f && !this.f35347a) {
            sk0Var.r(false);
            this.f35347a = true;
        } else if (f7 == 1.0f && this.f35347a) {
            sk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f35347a = false;
            }
        }
    }
}
