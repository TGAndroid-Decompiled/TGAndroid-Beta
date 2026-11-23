package org.telegram.ui;

import android.content.Context;
public final class hy0 implements Runnable {
    public final int f48514a;
    public final org.telegram.ui.ActionBar.g2 f48515b;
    public final Context f48516c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.Components.fw f48517e;

    public hy0(org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.fw fwVar, int i7) {
        this.f48514a = i7;
        this.f48515b = g2Var;
        this.f48516c = context;
        this.d = h6Var;
        this.f48517e = fwVar;
    }

    @Override
    public final void run() {
        int i7 = this.f48514a;
        org.telegram.ui.Components.fw fwVar = this.f48517e;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        Context context = this.f48516c;
        org.telegram.ui.ActionBar.g2 g2Var = this.f48515b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.lc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131754484, null), -1, 2, new fu(context, 4), h6Var)).j();
                org.telegram.messenger.g0.g3(fwVar);
                return;
            case 1:
                org.telegram.ui.Components.lc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131754484, null), -1, 2, new fu(context, 3), h6Var)).j();
                org.telegram.messenger.g0.g3(fwVar);
                return;
            default:
                org.telegram.ui.Components.lc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131754484, null), -1, 2, new fu(context, 7), h6Var)).j();
                org.telegram.messenger.g0.g3(fwVar);
                return;
        }
    }
}
