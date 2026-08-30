package org.telegram.ui;
public final class ki implements org.telegram.ui.Components.zg0 {
    public boolean f35732a = true;
    public final org.telegram.ui.Components.pk0 f35733b;

    public ki(org.telegram.ui.Components.pk0 pk0Var) {
        this.f35733b = pk0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.pk0 pk0Var = this.f35733b;
        if (f10 == 0.0f && !this.f35732a) {
            pk0Var.r(false);
            this.f35732a = true;
        } else if (f10 == 1.0f && this.f35732a) {
            pk0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f35732a = false;
            }
        }
    }
}
