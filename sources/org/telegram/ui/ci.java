package org.telegram.ui;
public final class ci implements org.telegram.ui.Components.eg0 {
    public boolean f37215a = true;
    public final org.telegram.ui.Components.uj0 f37216b;

    public ci(org.telegram.ui.Components.uj0 uj0Var) {
        this.f37216b = uj0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.uj0 uj0Var = this.f37216b;
        if (f10 == 0.0f && !this.f37215a) {
            uj0Var.r(false);
            this.f37215a = true;
        } else if (f10 == 1.0f && this.f37215a) {
            uj0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f37215a = false;
            }
        }
    }
}
