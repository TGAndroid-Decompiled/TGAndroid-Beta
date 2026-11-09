package org.telegram.ui;
public final class pe implements org.telegram.messenger.u10 {
    public final int f48703a;
    public final org.telegram.ui.ActionBar.f2 f48704b;

    public pe(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f48703a = i7;
        this.f48704b = f2Var;
    }

    @Override
    public final Object run() {
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z9;
        switch (this.f48703a) {
            case 0:
                f2Var = (cn) this.f48704b;
                break;
            case 1:
                cn cnVar = (cn) this.f48704b;
                if (org.telegram.messenger.sc.e(65536) && org.telegram.ui.Components.ez0.c()) {
                    org.telegram.ui.Components.ez0 ez0Var = cnVar.f44675x0;
                    if (ez0Var == null || ez0Var.f33528e) {
                        if (cnVar.getParentActivity() != null && org.telegram.ui.Components.ez0.c() && cnVar.f44700z0 != null && cnVar.l1 != null) {
                            org.telegram.ui.Components.ez0 ez0Var2 = cnVar.f44675x0;
                            if (ez0Var2 != null) {
                                org.telegram.messenger.g0.E2(ez0Var2);
                            }
                            org.telegram.ui.Components.ez0 ez0Var3 = new org.telegram.ui.Components.ez0(cnVar.getParentActivity(), new org.telegram.ui.ActionBar.p(29, cnVar, r2));
                            cnVar.f44675x0 = ez0Var3;
                            org.telegram.ui.Components.ez0[] ez0VarArr = {ez0Var3};
                            ql qlVar = cnVar.l1;
                            qlVar.addView(ez0Var3, qlVar.indexOfChild(cnVar.f44700z0) + 1, c8.ha.c(-1.0f, -1));
                        }
                    }
                    return cnVar.f44675x0;
                }
                return null;
            case 2:
                ((cn) this.f48704b).getClass();
                if (org.telegram.ui.Components.ez0.c() && org.telegram.messenger.sc.e(65536)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            default:
                f2Var = (ProfileActivity) this.f48704b;
                break;
        }
        return f2Var.getSimpleMenuOverlay();
    }
}
