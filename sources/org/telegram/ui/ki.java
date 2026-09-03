package org.telegram.ui;
public final class ki implements org.telegram.ui.Components.bh0 {
    public boolean f38319a = true;
    public final org.telegram.ui.Components.qk0 f38320b;

    public ki(org.telegram.ui.Components.qk0 qk0Var) {
        this.f38320b = qk0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.qk0 qk0Var = this.f38320b;
        if (f10 == 0.0f && !this.f38319a) {
            qk0Var.r(false);
            this.f38319a = true;
        } else if (f10 == 1.0f && this.f38319a) {
            qk0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f38319a = false;
            }
        }
    }
}
