package org.telegram.ui;
public final class qe implements org.telegram.messenger.p10 {
    public final int f51266a;
    public final org.telegram.ui.ActionBar.g2 f51267b;

    public qe(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f51266a = i7;
        this.f51267b = g2Var;
    }

    @Override
    public final Object run() {
        org.telegram.ui.ActionBar.g2 g2Var;
        boolean z10;
        switch (this.f51266a) {
            case 0:
                g2Var = (bn) this.f51267b;
                break;
            case 1:
                bn bnVar = (bn) this.f51267b;
                if (org.telegram.messenger.pc.e(65536) && org.telegram.ui.Components.oz0.c()) {
                    org.telegram.ui.Components.oz0 oz0Var = bnVar.f46259y0;
                    if (oz0Var == null || oz0Var.f38432e) {
                        if (bnVar.getParentActivity() != null && org.telegram.ui.Components.oz0.c() && bnVar.A0 != null && bnVar.f46107m1 != null) {
                            org.telegram.ui.Components.oz0 oz0Var2 = bnVar.f46259y0;
                            if (oz0Var2 != null) {
                                org.telegram.messenger.g0.E2(oz0Var2);
                            }
                            org.telegram.ui.Components.oz0 oz0Var3 = new org.telegram.ui.Components.oz0(bnVar.getParentActivity(), new u8(16, bnVar, r2));
                            bnVar.f46259y0 = oz0Var3;
                            org.telegram.ui.Components.oz0[] oz0VarArr = {oz0Var3};
                            pl plVar = bnVar.f46107m1;
                            plVar.addView(oz0Var3, plVar.indexOfChild(bnVar.A0) + 1, c8.ma.c(-1.0f, -1));
                        }
                    }
                    return bnVar.f46259y0;
                }
                return null;
            case 2:
                ((bn) this.f51267b).getClass();
                if (org.telegram.ui.Components.oz0.c() && org.telegram.messenger.pc.e(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                g2Var = (ProfileActivity) this.f51267b;
                break;
        }
        return g2Var.getSimpleMenuOverlay();
    }
}
