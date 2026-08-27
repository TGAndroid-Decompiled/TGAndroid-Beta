package org.telegram.ui;

public final class ei implements org.telegram.ui.Components.gg0 {

    public boolean f37766a = true;

    public final org.telegram.ui.Components.wj0 f37767b;

    public ei(org.telegram.ui.Components.wj0 wj0Var) {
        this.f37767b = wj0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.wj0 wj0Var = this.f37767b;
        if (f10 == 0.0f && !this.f37766a) {
            wj0Var.r(false);
            this.f37766a = true;
        } else if (f10 == 1.0f && this.f37766a) {
            wj0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f37766a = false;
            }
        }
    }
}
