package org.telegram.ui;
public final class qe implements org.telegram.messenger.u10 {
    public final int f49022a;
    public final org.telegram.ui.ActionBar.f2 f49023b;

    public qe(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f49022a = i7;
        this.f49023b = f2Var;
    }

    @Override
    public final Object run() {
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z9;
        switch (this.f49022a) {
            case 0:
                f2Var = (cn) this.f49023b;
                break;
            case 1:
                cn cnVar = (cn) this.f49023b;
                if (org.telegram.messenger.sc.e(65536) && org.telegram.ui.Components.dz0.c()) {
                    org.telegram.ui.Components.dz0 dz0Var = cnVar.f44716x0;
                    if (dz0Var == null || dz0Var.f33108e) {
                        if (cnVar.getParentActivity() != null && org.telegram.ui.Components.dz0.c() && cnVar.f44741z0 != null && cnVar.l1 != null) {
                            org.telegram.ui.Components.dz0 dz0Var2 = cnVar.f44716x0;
                            if (dz0Var2 != null) {
                                org.telegram.messenger.g0.E2(dz0Var2);
                            }
                            org.telegram.ui.Components.dz0 dz0Var3 = new org.telegram.ui.Components.dz0(cnVar.getParentActivity(), new oe(0, cnVar, r2));
                            cnVar.f44716x0 = dz0Var3;
                            org.telegram.ui.Components.dz0[] dz0VarArr = {dz0Var3};
                            ql qlVar = cnVar.l1;
                            qlVar.addView(dz0Var3, qlVar.indexOfChild(cnVar.f44741z0) + 1, c8.ha.c(-1.0f, -1));
                        }
                    }
                    return cnVar.f44716x0;
                }
                return null;
            case 2:
                ((cn) this.f49023b).getClass();
                if (org.telegram.ui.Components.dz0.c() && org.telegram.messenger.sc.e(65536)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            default:
                f2Var = (ProfileActivity) this.f49023b;
                break;
        }
        return f2Var.getSimpleMenuOverlay();
    }
}
