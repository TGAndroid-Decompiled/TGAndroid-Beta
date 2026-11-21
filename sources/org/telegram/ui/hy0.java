package org.telegram.ui;

import android.content.Context;
public final class hy0 implements Runnable {
    public final int f48543a;
    public final org.telegram.ui.ActionBar.g2 f48544b;
    public final Context f48545c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.Components.ou f48546e;

    public hy0(org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ou ouVar, int i7) {
        this.f48543a = i7;
        this.f48544b = g2Var;
        this.f48545c = context;
        this.d = h6Var;
        this.f48546e = ouVar;
    }

    @Override
    public final void run() {
        int i7 = this.f48543a;
        org.telegram.ui.Components.ou ouVar = this.f48546e;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        Context context = this.f48545c;
        org.telegram.ui.ActionBar.g2 g2Var = this.f48544b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.lc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new fu(context, 4), h6Var)).j();
                org.telegram.messenger.g0.g3(ouVar);
                return;
            case 1:
                org.telegram.ui.Components.lc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new fu(context, 3), h6Var)).j();
                org.telegram.messenger.g0.g3(ouVar);
                return;
            default:
                org.telegram.ui.Components.lc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new fu(context, 7), h6Var)).j();
                org.telegram.messenger.g0.g3(ouVar);
                return;
        }
    }
}
