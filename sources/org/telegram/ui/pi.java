package org.telegram.ui;
public final class pi implements org.telegram.ui.Components.ug0 {
    public boolean f36637a = true;
    public final org.telegram.ui.Components.gk0 f36638b;

    public pi(org.telegram.ui.Components.gk0 gk0Var) {
        this.f36638b = gk0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.gk0 gk0Var = this.f36638b;
        if (f7 == 0.0f && !this.f36637a) {
            gk0Var.r(false);
            this.f36637a = true;
        } else if (f7 == 1.0f && this.f36637a) {
            gk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f36637a = false;
            }
        }
    }
}
