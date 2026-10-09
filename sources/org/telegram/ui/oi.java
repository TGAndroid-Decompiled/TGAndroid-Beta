package org.telegram.ui;
public final class oi implements org.telegram.ui.Components.wh0 {
    public boolean f40536a = true;
    public final org.telegram.ui.Components.kl0 f40537b;

    public oi(org.telegram.ui.Components.kl0 kl0Var) {
        this.f40537b = kl0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.kl0 kl0Var = this.f40537b;
        if (i10 == 0 && !this.f40536a) {
            kl0Var.r(false);
            this.f40536a = true;
        } else if (f7 == 1.0f && this.f40536a) {
            kl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f40536a = false;
            }
        }
    }
}
