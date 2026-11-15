package org.telegram.ui;
public final class ne implements org.telegram.messenger.r10 {
    public final int f49551a;
    public final org.telegram.ui.ActionBar.e2 f49552b;

    public ne(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f49551a = i7;
        this.f49552b = e2Var;
    }

    @Override
    public final Object run() {
        org.telegram.ui.ActionBar.e2 e2Var;
        boolean z10;
        switch (this.f49551a) {
            case 0:
                e2Var = (an) this.f49552b;
                break;
            case 1:
                an anVar = (an) this.f49552b;
                if (org.telegram.messenger.qc.e(65536) && org.telegram.ui.Components.fz0.c()) {
                    org.telegram.ui.Components.fz0 fz0Var = anVar.f45429y0;
                    if (fz0Var == null || fz0Var.f34762e) {
                        if (anVar.getParentActivity() != null && org.telegram.ui.Components.fz0.c() && anVar.A0 != null && anVar.f45277m1 != null) {
                            org.telegram.ui.Components.fz0 fz0Var2 = anVar.f45429y0;
                            if (fz0Var2 != null) {
                                org.telegram.messenger.g0.E2(fz0Var2);
                            }
                            org.telegram.ui.Components.fz0 fz0Var3 = new org.telegram.ui.Components.fz0(anVar.getParentActivity(), new u5(18, anVar, r2));
                            anVar.f45429y0 = fz0Var3;
                            org.telegram.ui.Components.fz0[] fz0VarArr = {fz0Var3};
                            ol olVar = anVar.f45277m1;
                            olVar.addView(fz0Var3, olVar.indexOfChild(anVar.A0) + 1, c8.ja.c(-1.0f, -1));
                        }
                    }
                    return anVar.f45429y0;
                }
                return null;
            case 2:
                ((an) this.f49552b).getClass();
                if (org.telegram.ui.Components.fz0.c() && org.telegram.messenger.qc.e(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                e2Var = (ProfileActivity) this.f49552b;
                break;
        }
        return e2Var.getSimpleMenuOverlay();
    }
}
