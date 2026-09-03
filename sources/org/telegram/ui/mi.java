package org.telegram.ui;
public final class mi implements org.telegram.ui.Components.ah0 {
    public boolean f36095a = true;
    public final org.telegram.ui.Components.pk0 f36096b;

    public mi(org.telegram.ui.Components.pk0 pk0Var) {
        this.f36096b = pk0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.pk0 pk0Var = this.f36096b;
        if (f10 == 0.0f && !this.f36095a) {
            pk0Var.r(false);
            this.f36095a = true;
        } else if (f10 == 1.0f && this.f36095a) {
            pk0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f36095a = false;
            }
        }
    }
}
