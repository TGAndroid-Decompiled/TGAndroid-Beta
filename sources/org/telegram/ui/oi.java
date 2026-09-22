package org.telegram.ui;
public final class oi implements org.telegram.ui.Components.tg0 {
    public boolean f36231a = true;
    public final org.telegram.ui.Components.fk0 f36232b;

    public oi(org.telegram.ui.Components.fk0 fk0Var) {
        this.f36232b = fk0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.fk0 fk0Var = this.f36232b;
        if (f7 == 0.0f && !this.f36231a) {
            fk0Var.r(false);
            this.f36231a = true;
        } else if (f7 == 1.0f && this.f36231a) {
            fk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f36231a = false;
            }
        }
    }
}
