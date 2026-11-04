package org.telegram.ui;
public final class me implements org.telegram.messenger.m10 {
    public final int f47664a;
    public final org.telegram.ui.ActionBar.d2 f47665b;

    public me(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f47664a = i3;
        this.f47665b = d2Var;
    }

    @Override
    public final Object run() {
        org.telegram.ui.ActionBar.d2 d2Var;
        boolean z10;
        switch (this.f47664a) {
            case 0:
                d2Var = (wm) this.f47665b;
                break;
            case 1:
                wm wmVar = (wm) this.f47665b;
                if (org.telegram.messenger.lc.e(65536) && org.telegram.ui.Components.cz0.c()) {
                    org.telegram.ui.Components.cz0 cz0Var = wmVar.f51548y0;
                    if (cz0Var == null || cz0Var.f32871e) {
                        if (wmVar.getParentActivity() != null && org.telegram.ui.Components.cz0.c() && wmVar.A0 != null && wmVar.m1 != null) {
                            org.telegram.ui.Components.cz0 cz0Var2 = wmVar.f51548y0;
                            if (cz0Var2 != null) {
                                org.telegram.messenger.g0.E2(cz0Var2);
                            }
                            org.telegram.ui.Components.cz0 cz0Var3 = new org.telegram.ui.Components.cz0(wmVar.getParentActivity(), new sc(4, wmVar, r2));
                            wmVar.f51548y0 = cz0Var3;
                            org.telegram.ui.Components.cz0[] cz0VarArr = {cz0Var3};
                            kl klVar = wmVar.m1;
                            klVar.addView(cz0Var3, klVar.indexOfChild(wmVar.A0) + 1, b8.mf.c(-1.0f, -1));
                        }
                    }
                    return wmVar.f51548y0;
                }
                return null;
            case 2:
                ((wm) this.f47665b).getClass();
                if (org.telegram.ui.Components.cz0.c() && org.telegram.messenger.lc.e(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                d2Var = (ProfileActivity) this.f47665b;
                break;
        }
        return d2Var.getSimpleMenuOverlay();
    }
}
