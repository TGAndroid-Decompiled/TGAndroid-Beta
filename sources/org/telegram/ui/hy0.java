package org.telegram.ui;

import android.content.Context;
public final class hy0 implements Runnable {
    public final int f48544a;
    public final org.telegram.ui.ActionBar.h2 f48545b;
    public final Context f48546c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.Components.dw f48547e;

    public hy0(org.telegram.ui.ActionBar.h2 h2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.dw dwVar, int i7) {
        this.f48544a = i7;
        this.f48545b = h2Var;
        this.f48546c = context;
        this.d = i6Var;
        this.f48547e = dwVar;
    }

    @Override
    public final void run() {
        int i7 = this.f48544a;
        org.telegram.ui.Components.dw dwVar = this.f48547e;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        Context context = this.f48546c;
        org.telegram.ui.ActionBar.h2 h2Var = this.f48545b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.lc.b0(h2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131754485, null), -1, 2, new fu(context, 4), i6Var)).j();
                org.telegram.messenger.g0.g3(dwVar);
                return;
            case 1:
                org.telegram.ui.Components.lc.b0(h2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131754485, null), -1, 2, new fu(context, 3), i6Var)).j();
                org.telegram.messenger.g0.g3(dwVar);
                return;
            default:
                org.telegram.ui.Components.lc.b0(h2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131754485, null), -1, 2, new fu(context, 7), i6Var)).j();
                org.telegram.messenger.g0.g3(dwVar);
                return;
        }
    }
}
