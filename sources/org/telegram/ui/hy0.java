package org.telegram.ui;

import android.content.Context;
public final class hy0 implements Runnable {
    public final int f48500a;
    public final org.telegram.ui.ActionBar.h2 f48501b;
    public final Context f48502c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.Components.dw f48503e;

    public hy0(org.telegram.ui.ActionBar.h2 h2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.dw dwVar, int i7) {
        this.f48500a = i7;
        this.f48501b = h2Var;
        this.f48502c = context;
        this.d = i6Var;
        this.f48503e = dwVar;
    }

    @Override
    public final void run() {
        int i7 = this.f48500a;
        org.telegram.ui.Components.dw dwVar = this.f48503e;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        Context context = this.f48502c;
        org.telegram.ui.ActionBar.h2 h2Var = this.f48501b;
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
