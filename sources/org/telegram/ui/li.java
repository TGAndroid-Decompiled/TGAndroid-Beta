package org.telegram.ui;
public final class li implements org.telegram.ui.Components.eh0 {
    public boolean f35365a = true;
    public final org.telegram.ui.Components.qk0 f35366b;

    public li(org.telegram.ui.Components.qk0 qk0Var) {
        this.f35366b = qk0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.qk0 qk0Var = this.f35366b;
        if (f7 == 0.0f && !this.f35365a) {
            qk0Var.r(false);
            this.f35365a = true;
        } else if (f7 == 1.0f && this.f35365a) {
            qk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f35365a = false;
            }
        }
    }
}
