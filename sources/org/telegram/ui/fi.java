package org.telegram.ui;
public final class fi implements org.telegram.ui.Components.rh0 {
    public boolean f37339a = true;
    public final org.telegram.ui.Components.fl0 f37340b;

    public fi(org.telegram.ui.Components.fl0 fl0Var) {
        this.f37340b = fl0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.fl0 fl0Var = this.f37340b;
        if (i10 == 0 && !this.f37339a) {
            fl0Var.r(false);
            this.f37339a = true;
        } else if (f7 == 1.0f && this.f37339a) {
            fl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f37339a = false;
            }
        }
    }
}
