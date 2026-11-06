package org.telegram.ui;

import android.content.Context;
public final class ey0 implements Runnable {
    public final int f45434a;
    public final org.telegram.ui.ActionBar.f2 f45435b;
    public final Context f45436c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Components.v80 f45437e;

    public ey0(org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.v80 v80Var, int i7) {
        this.f45434a = i7;
        this.f45435b = f2Var;
        this.f45436c = context;
        this.d = f6Var;
        this.f45437e = v80Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45434a;
        org.telegram.ui.Components.v80 v80Var = this.f45437e;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        Context context = this.f45436c;
        org.telegram.ui.ActionBar.f2 f2Var = this.f45435b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.hc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new bu(context, 4), f6Var)).j();
                org.telegram.messenger.g0.h3(v80Var);
                return;
            case 1:
                org.telegram.ui.Components.hc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new bu(context, 3), f6Var)).j();
                org.telegram.messenger.g0.h3(v80Var);
                return;
            default:
                org.telegram.ui.Components.hc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new bu(context, 7), f6Var)).j();
                org.telegram.messenger.g0.h3(v80Var);
                return;
        }
    }
}
