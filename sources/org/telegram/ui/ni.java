package org.telegram.ui;
public final class ni implements org.telegram.ui.Components.gh0 {
    public boolean f36001a = true;
    public final org.telegram.ui.Components.sk0 f36002b;

    public ni(org.telegram.ui.Components.sk0 sk0Var) {
        this.f36002b = sk0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.sk0 sk0Var = this.f36002b;
        if (f7 == 0.0f && !this.f36001a) {
            sk0Var.r(false);
            this.f36001a = true;
        } else if (f7 == 1.0f && this.f36001a) {
            sk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f36001a = false;
            }
        }
    }
}
