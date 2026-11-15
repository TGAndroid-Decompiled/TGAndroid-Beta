package org.telegram.ui;
public final class ne implements org.telegram.messenger.r10 {
    public final int f49552a;
    public final org.telegram.ui.ActionBar.e2 f49553b;

    public ne(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f49552a = i7;
        this.f49553b = e2Var;
    }

    @Override
    public final Object run() {
        org.telegram.ui.ActionBar.e2 e2Var;
        boolean z10;
        switch (this.f49552a) {
            case 0:
                e2Var = (an) this.f49553b;
                break;
            case 1:
                an anVar = (an) this.f49553b;
                if (org.telegram.messenger.qc.e(65536) && org.telegram.ui.Components.fz0.c()) {
                    org.telegram.ui.Components.fz0 fz0Var = anVar.f45430y0;
                    if (fz0Var == null || fz0Var.f34758e) {
                        if (anVar.getParentActivity() != null && org.telegram.ui.Components.fz0.c() && anVar.A0 != null && anVar.f45278m1 != null) {
                            org.telegram.ui.Components.fz0 fz0Var2 = anVar.f45430y0;
                            if (fz0Var2 != null) {
                                org.telegram.messenger.g0.E2(fz0Var2);
                            }
                            org.telegram.ui.Components.fz0 fz0Var3 = new org.telegram.ui.Components.fz0(anVar.getParentActivity(), new u5(18, anVar, r2));
                            anVar.f45430y0 = fz0Var3;
                            org.telegram.ui.Components.fz0[] fz0VarArr = {fz0Var3};
                            ol olVar = anVar.f45278m1;
                            olVar.addView(fz0Var3, olVar.indexOfChild(anVar.A0) + 1, c8.ja.c(-1.0f, -1));
                        }
                    }
                    return anVar.f45430y0;
                }
                return null;
            case 2:
                ((an) this.f49553b).getClass();
                if (org.telegram.ui.Components.fz0.c() && org.telegram.messenger.qc.e(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                e2Var = (ProfileActivity) this.f49553b;
                break;
        }
        return e2Var.getSimpleMenuOverlay();
    }
}
