package org.telegram.ui;
public final class ai extends org.telegram.ui.ActionBar.g1 {
    public final org.telegram.ui.Components.ji0 f43696o;
    public final cn f43697p;

    public ai(cn cnVar, xa xaVar, org.telegram.ui.Components.ji0 ji0Var) {
        super(xaVar, -2, -2);
        this.f43697p = cnVar;
        this.f43696o = ji0Var;
    }

    @Override
    public final void d(boolean z9) {
        super.d(z9);
        org.telegram.ui.Components.ji0 ji0Var = this.f43696o;
        if (ji0Var != null) {
            ji0Var.d(z9);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        cn cnVar = this.f43697p;
        if (cnVar.f44442e9 == this) {
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32619w;
            org.telegram.ui.Components.cc ccVar2 = cnVar.B1;
            if (ccVar == ccVar2 && ccVar2 != null) {
                ccVar2.b();
                cnVar.B1 = null;
            }
            cnVar.f44442e9 = null;
            cnVar.f44507j9 = null;
            cnVar.f44494i9 = null;
            cnVar.B0.R = true;
            if (cnVar.f44456f9) {
                cnVar.w8(false, true, 0.0f);
            } else {
                cnVar.f44456f9 = true;
            }
            sj sjVar = cnVar.Z;
            if (sjVar != null && sjVar.getEditField() != null) {
                cnVar.Z.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
