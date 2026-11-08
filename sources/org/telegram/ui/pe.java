package org.telegram.ui;
public final class pe implements org.telegram.messenger.u10 {
    public final int f48815a;
    public final org.telegram.ui.ActionBar.f2 f48816b;

    public pe(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f48815a = i7;
        this.f48816b = f2Var;
    }

    @Override
    public final Object run() {
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z9;
        switch (this.f48815a) {
            case 0:
                f2Var = (an) this.f48816b;
                break;
            case 1:
                an anVar = (an) this.f48816b;
                if (org.telegram.messenger.sc.e(65536) && org.telegram.ui.Components.dz0.c()) {
                    org.telegram.ui.Components.dz0 dz0Var = anVar.f44018x0;
                    if (dz0Var == null || dz0Var.f33142e) {
                        if (anVar.getParentActivity() != null && org.telegram.ui.Components.dz0.c() && anVar.f44043z0 != null && anVar.l1 != null) {
                            org.telegram.ui.Components.dz0 dz0Var2 = anVar.f44018x0;
                            if (dz0Var2 != null) {
                                org.telegram.messenger.g0.E2(dz0Var2);
                            }
                            org.telegram.ui.Components.dz0 dz0Var3 = new org.telegram.ui.Components.dz0(anVar.getParentActivity(), new org.telegram.ui.ActionBar.p(29, anVar, r2));
                            anVar.f44018x0 = dz0Var3;
                            org.telegram.ui.Components.dz0[] dz0VarArr = {dz0Var3};
                            ol olVar = anVar.l1;
                            olVar.addView(dz0Var3, olVar.indexOfChild(anVar.f44043z0) + 1, c8.ha.c(-1.0f, -1));
                        }
                    }
                    return anVar.f44018x0;
                }
                return null;
            case 2:
                ((an) this.f48816b).getClass();
                if (org.telegram.ui.Components.dz0.c() && org.telegram.messenger.sc.e(65536)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            default:
                f2Var = (ProfileActivity) this.f48816b;
                break;
        }
        return f2Var.getSimpleMenuOverlay();
    }
}
