package org.telegram.ui;
public final class oi implements org.telegram.ui.Components.yh0 {
    public boolean f40552a = true;
    public final org.telegram.ui.Components.ml0 f40553b;

    public oi(org.telegram.ui.Components.ml0 ml0Var) {
        this.f40553b = ml0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.ml0 ml0Var = this.f40553b;
        if (i10 == 0 && !this.f40552a) {
            ml0Var.r(false);
            this.f40552a = true;
        } else if (f7 == 1.0f && this.f40552a) {
            ml0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f40552a = false;
            }
        }
    }
}
