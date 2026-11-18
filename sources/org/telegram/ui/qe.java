package org.telegram.ui;
public final class qe implements org.telegram.messenger.p10 {
    public final int f51211a;
    public final org.telegram.ui.ActionBar.h2 f51212b;

    public qe(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f51211a = i7;
        this.f51212b = h2Var;
    }

    @Override
    public final Object run() {
        org.telegram.ui.ActionBar.h2 h2Var;
        boolean z10;
        switch (this.f51211a) {
            case 0:
                h2Var = (bn) this.f51212b;
                break;
            case 1:
                bn bnVar = (bn) this.f51212b;
                if (org.telegram.messenger.pc.e(65536) && org.telegram.ui.Components.mz0.c()) {
                    org.telegram.ui.Components.mz0 mz0Var = bnVar.f46236y0;
                    if (mz0Var == null || mz0Var.f37678e) {
                        if (bnVar.getParentActivity() != null && org.telegram.ui.Components.mz0.c() && bnVar.A0 != null && bnVar.f46084m1 != null) {
                            org.telegram.ui.Components.mz0 mz0Var2 = bnVar.f46236y0;
                            if (mz0Var2 != null) {
                                org.telegram.messenger.g0.E2(mz0Var2);
                            }
                            org.telegram.ui.Components.mz0 mz0Var3 = new org.telegram.ui.Components.mz0(bnVar.getParentActivity(), new k9(14, bnVar, r2));
                            bnVar.f46236y0 = mz0Var3;
                            org.telegram.ui.Components.mz0[] mz0VarArr = {mz0Var3};
                            pl plVar = bnVar.f46084m1;
                            plVar.addView(mz0Var3, plVar.indexOfChild(bnVar.A0) + 1, c8.ma.c(-1.0f, -1));
                        }
                    }
                    return bnVar.f46236y0;
                }
                return null;
            case 2:
                ((bn) this.f51212b).getClass();
                if (org.telegram.ui.Components.mz0.c() && org.telegram.messenger.pc.e(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                h2Var = (ProfileActivity) this.f51212b;
                break;
        }
        return h2Var.getSimpleMenuOverlay();
    }
}
