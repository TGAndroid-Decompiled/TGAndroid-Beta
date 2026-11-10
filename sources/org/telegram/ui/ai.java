package org.telegram.ui;
public final class ai extends org.telegram.ui.ActionBar.g1 {
    public final org.telegram.ui.Components.ii0 f43686o;
    public final cn f43687p;

    public ai(cn cnVar, xa xaVar, org.telegram.ui.Components.ii0 ii0Var) {
        super(xaVar, -2, -2);
        this.f43687p = cnVar;
        this.f43686o = ii0Var;
    }

    @Override
    public final void d(boolean z9) {
        super.d(z9);
        org.telegram.ui.Components.ii0 ii0Var = this.f43686o;
        if (ii0Var != null) {
            ii0Var.d(z9);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        cn cnVar = this.f43687p;
        if (cnVar.f44483e9 == this) {
            org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.f32195w;
            org.telegram.ui.Components.bc bcVar2 = cnVar.B1;
            if (bcVar == bcVar2 && bcVar2 != null) {
                bcVar2.b();
                cnVar.B1 = null;
            }
            cnVar.f44483e9 = null;
            cnVar.f44548j9 = null;
            cnVar.f44535i9 = null;
            cnVar.B0.R = true;
            if (cnVar.f44497f9) {
                cnVar.w8(false, true, 0.0f);
            } else {
                cnVar.f44497f9 = true;
            }
            sj sjVar = cnVar.Z;
            if (sjVar != null && sjVar.getEditField() != null) {
                cnVar.Z.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
