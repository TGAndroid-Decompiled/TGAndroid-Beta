package org.telegram.ui;
public final class li implements org.telegram.ui.Components.ug0 {
    public boolean f34985a = true;
    public final org.telegram.ui.Components.gk0 f34986b;

    public li(org.telegram.ui.Components.gk0 gk0Var) {
        this.f34986b = gk0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.gk0 gk0Var = this.f34986b;
        if (f7 == 0.0f && !this.f34985a) {
            gk0Var.r(false);
            this.f34985a = true;
        } else if (f7 == 1.0f && this.f34985a) {
            gk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f34985a = false;
            }
        }
    }
}
