package org.telegram.ui;

import android.content.Context;
public final class cy0 implements Runnable {
    public final int f46242a;
    public final org.telegram.ui.ActionBar.e2 f46243b;
    public final Context f46244c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Components.hh0 f46245e;

    public cy0(org.telegram.ui.ActionBar.e2 e2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.hh0 hh0Var, int i7) {
        this.f46242a = i7;
        this.f46243b = e2Var;
        this.f46244c = context;
        this.d = e6Var;
        this.f46245e = hh0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46242a;
        org.telegram.ui.Components.hh0 hh0Var = this.f46245e;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        Context context = this.f46244c;
        org.telegram.ui.ActionBar.e2 e2Var = this.f46243b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.cc.a0(e2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new du(context, 4), e6Var)).j();
                org.telegram.messenger.g0.h3(hh0Var);
                return;
            case 1:
                org.telegram.ui.Components.cc.a0(e2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new du(context, 3), e6Var)).j();
                org.telegram.messenger.g0.h3(hh0Var);
                return;
            default:
                org.telegram.ui.Components.cc.a0(e2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new du(context, 7), e6Var)).j();
                org.telegram.messenger.g0.h3(hh0Var);
                return;
        }
    }
}
