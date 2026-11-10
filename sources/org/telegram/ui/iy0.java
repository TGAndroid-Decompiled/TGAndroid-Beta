package org.telegram.ui;

import android.content.Context;
public final class iy0 implements Runnable {
    public final int f46770a;
    public final org.telegram.ui.ActionBar.f2 f46771b;
    public final Context f46772c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.Components.r80 f46773e;

    public iy0(org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.r80 r80Var, int i7) {
        this.f46770a = i7;
        this.f46771b = f2Var;
        this.f46772c = context;
        this.d = h6Var;
        this.f46773e = r80Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46770a;
        org.telegram.ui.Components.r80 r80Var = this.f46773e;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        Context context = this.f46772c;
        org.telegram.ui.ActionBar.f2 f2Var = this.f46771b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.gc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new eu(context, 4), h6Var)).j();
                org.telegram.messenger.g0.h3(r80Var);
                return;
            case 1:
                org.telegram.ui.Components.gc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new eu(context, 3), h6Var)).j();
                org.telegram.messenger.g0.h3(r80Var);
                return;
            default:
                org.telegram.ui.Components.gc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new eu(context, 7), h6Var)).j();
                org.telegram.messenger.g0.h3(r80Var);
                return;
        }
    }
}
