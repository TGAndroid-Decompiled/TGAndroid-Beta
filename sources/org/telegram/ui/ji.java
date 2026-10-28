package org.telegram.ui;
public final class ji implements org.telegram.ui.Components.sh0 {
    public boolean f40545a = true;
    public final org.telegram.ui.Components.gl0 f40546b;

    public ji(org.telegram.ui.Components.gl0 gl0Var) {
        this.f40546b = gl0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.gl0 gl0Var = this.f40546b;
        if (i10 == 0 && !this.f40545a) {
            gl0Var.r(false);
            this.f40545a = true;
        } else if (f7 == 1.0f && this.f40545a) {
            gl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f40545a = false;
            }
        }
    }
}
