package org.telegram.ui;
public final class cf implements org.telegram.messenger.i20 {
    public final int f36454a;
    public final org.telegram.ui.ActionBar.k2 f36455b;

    public cf(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f36454a = i10;
        this.f36455b = k2Var;
    }

    @Override
    public final Object run() {
        org.telegram.ui.ActionBar.k2 k2Var;
        boolean z10;
        switch (this.f36454a) {
            case 0:
                k2Var = (un) this.f36455b;
                break;
            case 1:
                un unVar = (un) this.f36455b;
                if (org.telegram.messenger.sc.e(65536) && org.telegram.ui.Components.h01.c()) {
                    org.telegram.ui.Components.h01 h01Var = unVar.f42467x0;
                    if (h01Var == null || h01Var.e) {
                        if (unVar.getParentActivity() != null && org.telegram.ui.Components.h01.c() && unVar.f42492z0 != null && unVar.l1 != null) {
                            org.telegram.ui.Components.h01 h01Var2 = unVar.f42467x0;
                            if (h01Var2 != null) {
                                org.telegram.messenger.i0.E2(h01Var2);
                            }
                            org.telegram.ui.Components.h01 h01Var3 = new org.telegram.ui.Components.h01(unVar.getParentActivity(), new h0(23, unVar, r2));
                            unVar.f42467x0 = h01Var3;
                            org.telegram.ui.Components.h01[] h01VarArr = {h01Var3};
                            km kmVar = unVar.l1;
                            kmVar.addView(h01Var3, kmVar.indexOfChild(unVar.f42492z0) + 1, w7.b6.c(-1.0f, -1));
                        }
                    }
                    return unVar.f42467x0;
                }
                return null;
            case 2:
                ((un) this.f36455b).getClass();
                if (org.telegram.ui.Components.h01.c() && org.telegram.messenger.sc.e(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                k2Var = (ProfileActivity) this.f36455b;
                break;
        }
        return k2Var.getSimpleMenuOverlay();
    }
}
