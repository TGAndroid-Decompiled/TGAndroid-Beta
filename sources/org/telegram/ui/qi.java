package org.telegram.ui;
public final class qi implements org.telegram.ui.Components.dh0 {
    public boolean f36070a = true;
    public final org.telegram.ui.Components.pk0 f36071b;

    public qi(org.telegram.ui.Components.pk0 pk0Var) {
        this.f36071b = pk0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.pk0 pk0Var = this.f36071b;
        if (f7 == 0.0f && !this.f36070a) {
            pk0Var.r(false);
            this.f36070a = true;
        } else if (f7 == 1.0f && this.f36070a) {
            pk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f36070a = false;
            }
        }
    }
}
