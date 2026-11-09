package org.telegram.ui;

import android.content.Context;
public final class hy0 implements Runnable {
    public final int f46426a;
    public final org.telegram.ui.ActionBar.f2 f46427b;
    public final Context f46428c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.Components.w80 f46429e;

    public hy0(org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.w80 w80Var, int i7) {
        this.f46426a = i7;
        this.f46427b = f2Var;
        this.f46428c = context;
        this.d = g6Var;
        this.f46429e = w80Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46426a;
        org.telegram.ui.Components.w80 w80Var = this.f46429e;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        Context context = this.f46428c;
        org.telegram.ui.ActionBar.f2 f2Var = this.f46427b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.hc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new du(context, 4), g6Var)).j();
                org.telegram.messenger.g0.h3(w80Var);
                return;
            case 1:
                org.telegram.ui.Components.hc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new du(context, 3), g6Var)).j();
                org.telegram.messenger.g0.h3(w80Var);
                return;
            default:
                org.telegram.ui.Components.hc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new du(context, 7), g6Var)).j();
                org.telegram.messenger.g0.h3(w80Var);
                return;
        }
    }
}
