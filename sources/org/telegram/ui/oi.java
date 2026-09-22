package org.telegram.ui;
public final class oi implements org.telegram.ui.Components.gh0 {
    public boolean f36335a = true;
    public final org.telegram.ui.Components.sk0 f36336b;

    public oi(org.telegram.ui.Components.sk0 sk0Var) {
        this.f36336b = sk0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.sk0 sk0Var = this.f36336b;
        if (f7 == 0.0f && !this.f36335a) {
            sk0Var.r(false);
            this.f36335a = true;
        } else if (f7 == 1.0f && this.f36335a) {
            sk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f36335a = false;
            }
        }
    }
}
