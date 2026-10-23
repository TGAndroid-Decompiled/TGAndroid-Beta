package org.telegram.ui;
public final class fi implements org.telegram.ui.Components.sh0 {
    public boolean f37338a = true;
    public final org.telegram.ui.Components.gl0 f37339b;

    public fi(org.telegram.ui.Components.gl0 gl0Var) {
        this.f37339b = gl0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.gl0 gl0Var = this.f37339b;
        if (i10 == 0 && !this.f37338a) {
            gl0Var.r(false);
            this.f37338a = true;
        } else if (f7 == 1.0f && this.f37338a) {
            gl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f37338a = false;
            }
        }
    }
}
