package org.telegram.ui;
public final class mi implements org.telegram.ui.Components.gh0 {
    public boolean f38604a = true;
    public final org.telegram.ui.Components.sk0 f38605b;

    public mi(org.telegram.ui.Components.sk0 sk0Var) {
        this.f38605b = sk0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.sk0 sk0Var = this.f38605b;
        if (f7 == 0.0f && !this.f38604a) {
            sk0Var.r(false);
            this.f38604a = true;
        } else if (f7 == 1.0f && this.f38604a) {
            sk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f38604a = false;
            }
        }
    }
}
