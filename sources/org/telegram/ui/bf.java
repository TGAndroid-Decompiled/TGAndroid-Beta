package org.telegram.ui;
public final class bf implements org.telegram.messenger.j20 {
    public final int f36042a;
    public final org.telegram.ui.ActionBar.k2 f36043b;

    public bf(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f36042a = i10;
        this.f36043b = k2Var;
    }

    @Override
    public final Object run() {
        org.telegram.ui.ActionBar.k2 k2Var;
        boolean z10;
        switch (this.f36042a) {
            case 0:
                k2Var = (un) this.f36043b;
                break;
            case 1:
                un unVar = (un) this.f36043b;
                if (org.telegram.messenger.tc.e(65536) && org.telegram.ui.Components.i01.c()) {
                    org.telegram.ui.Components.i01 i01Var = unVar.f42278x0;
                    if (i01Var == null || i01Var.e) {
                        if (unVar.getParentActivity() != null && org.telegram.ui.Components.i01.c() && unVar.f42303z0 != null && unVar.l1 != null) {
                            org.telegram.ui.Components.i01 i01Var2 = unVar.f42278x0;
                            if (i01Var2 != null) {
                                org.telegram.messenger.i0.E2(i01Var2);
                            }
                            org.telegram.ui.Components.i01 i01Var3 = new org.telegram.ui.Components.i01(unVar.getParentActivity(), new h0(23, unVar, r2));
                            unVar.f42278x0 = i01Var3;
                            org.telegram.ui.Components.i01[] i01VarArr = {i01Var3};
                            km kmVar = unVar.l1;
                            kmVar.addView(i01Var3, kmVar.indexOfChild(unVar.f42303z0) + 1, w7.b6.c(-1.0f, -1));
                        }
                    }
                    return unVar.f42278x0;
                }
                return null;
            case 2:
                ((un) this.f36043b).getClass();
                if (org.telegram.ui.Components.i01.c() && org.telegram.messenger.tc.e(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                k2Var = (ProfileActivity) this.f36043b;
                break;
        }
        return k2Var.getSimpleMenuOverlay();
    }
}
