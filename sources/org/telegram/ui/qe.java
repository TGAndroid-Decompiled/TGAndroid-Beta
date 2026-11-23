package org.telegram.ui;
public final class qe implements org.telegram.messenger.o10 {
    public final int f51446a;
    public final org.telegram.ui.ActionBar.g2 f51447b;

    public qe(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f51446a = i7;
        this.f51447b = g2Var;
    }

    @Override
    public final Object run() {
        org.telegram.ui.ActionBar.g2 g2Var;
        boolean z10;
        switch (this.f51446a) {
            case 0:
                g2Var = (bn) this.f51447b;
                break;
            case 1:
                bn bnVar = (bn) this.f51447b;
                if (org.telegram.messenger.pc.e(65536) && org.telegram.ui.Components.nz0.c()) {
                    org.telegram.ui.Components.nz0 nz0Var = bnVar.f46431y0;
                    if (nz0Var == null || nz0Var.f37964e) {
                        if (bnVar.getParentActivity() != null && org.telegram.ui.Components.nz0.c() && bnVar.A0 != null && bnVar.f46279m1 != null) {
                            org.telegram.ui.Components.nz0 nz0Var2 = bnVar.f46431y0;
                            if (nz0Var2 != null) {
                                org.telegram.messenger.g0.E2(nz0Var2);
                            }
                            org.telegram.ui.Components.nz0 nz0Var3 = new org.telegram.ui.Components.nz0(bnVar.getParentActivity(), new u5(18, bnVar, r2));
                            bnVar.f46431y0 = nz0Var3;
                            org.telegram.ui.Components.nz0[] nz0VarArr = {nz0Var3};
                            pl plVar = bnVar.f46279m1;
                            plVar.addView(nz0Var3, plVar.indexOfChild(bnVar.A0) + 1, c8.na.c(-1.0f, -1));
                        }
                    }
                    return bnVar.f46431y0;
                }
                return null;
            case 2:
                ((bn) this.f51447b).getClass();
                if (org.telegram.ui.Components.nz0.c() && org.telegram.messenger.pc.e(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                g2Var = (ProfileActivity) this.f51447b;
                break;
        }
        return g2Var.getSimpleMenuOverlay();
    }
}
