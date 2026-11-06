package org.telegram.ui;
public final class pe implements org.telegram.messenger.u10 {
    public final int f48818a;
    public final org.telegram.ui.ActionBar.f2 f48819b;

    public pe(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f48818a = i7;
        this.f48819b = f2Var;
    }

    @Override
    public final Object run() {
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z9;
        switch (this.f48818a) {
            case 0:
                f2Var = (an) this.f48819b;
                break;
            case 1:
                an anVar = (an) this.f48819b;
                if (org.telegram.messenger.rc.e(65536) && org.telegram.ui.Components.cz0.c()) {
                    org.telegram.ui.Components.cz0 cz0Var = anVar.f43988x0;
                    if (cz0Var == null || cz0Var.f32725e) {
                        if (anVar.getParentActivity() != null && org.telegram.ui.Components.cz0.c() && anVar.f44013z0 != null && anVar.l1 != null) {
                            org.telegram.ui.Components.cz0 cz0Var2 = anVar.f43988x0;
                            if (cz0Var2 != null) {
                                org.telegram.messenger.g0.E2(cz0Var2);
                            }
                            org.telegram.ui.Components.cz0 cz0Var3 = new org.telegram.ui.Components.cz0(anVar.getParentActivity(), new org.telegram.ui.ActionBar.p(29, anVar, r2));
                            anVar.f43988x0 = cz0Var3;
                            org.telegram.ui.Components.cz0[] cz0VarArr = {cz0Var3};
                            ol olVar = anVar.l1;
                            olVar.addView(cz0Var3, olVar.indexOfChild(anVar.f44013z0) + 1, c8.ha.c(-1.0f, -1));
                        }
                    }
                    return anVar.f43988x0;
                }
                return null;
            case 2:
                ((an) this.f48819b).getClass();
                if (org.telegram.ui.Components.cz0.c() && org.telegram.messenger.rc.e(65536)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            default:
                f2Var = (ProfileActivity) this.f48819b;
                break;
        }
        return f2Var.getSimpleMenuOverlay();
    }
}
