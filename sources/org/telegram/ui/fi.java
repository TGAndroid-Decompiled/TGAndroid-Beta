package org.telegram.ui;
public final class fi implements org.telegram.ui.Components.ph0 {
    public boolean f37017a = true;
    public final org.telegram.ui.Components.dl0 f37018b;

    public fi(org.telegram.ui.Components.dl0 dl0Var) {
        this.f37018b = dl0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.dl0 dl0Var = this.f37018b;
        if (i10 == 0 && !this.f37017a) {
            dl0Var.r(false);
            this.f37017a = true;
        } else if (f7 == 1.0f && this.f37017a) {
            dl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f37017a = false;
            }
        }
    }
}
