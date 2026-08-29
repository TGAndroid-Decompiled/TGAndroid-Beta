package org.telegram.ui;
public final class fi implements org.telegram.ui.Components.pg0 {
    public boolean f38187a = true;
    public final org.telegram.ui.Components.fk0 f38188b;

    public fi(org.telegram.ui.Components.fk0 fk0Var) {
        this.f38188b = fk0Var;
    }

    @Override
    public final void a(float f9, float f10) {
        org.telegram.ui.Components.fk0 fk0Var = this.f38188b;
        if (f9 == 0.0f && !this.f38187a) {
            fk0Var.r(false);
            this.f38187a = true;
        } else if (f9 == 1.0f && this.f38187a) {
            fk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f38187a = false;
            }
        }
    }
}
