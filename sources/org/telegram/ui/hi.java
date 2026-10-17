package org.telegram.ui;
public final class hi implements org.telegram.ui.Components.oh0 {
    public boolean f37563a = true;
    public final org.telegram.ui.Components.cl0 f37564b;

    public hi(org.telegram.ui.Components.cl0 cl0Var) {
        this.f37564b = cl0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.cl0 cl0Var = this.f37564b;
        if (i10 == 0 && !this.f37563a) {
            cl0Var.r(false);
            this.f37563a = true;
        } else if (f7 == 1.0f && this.f37563a) {
            cl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f37563a = false;
            }
        }
    }
}
