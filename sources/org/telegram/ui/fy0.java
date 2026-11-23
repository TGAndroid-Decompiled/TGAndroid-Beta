package org.telegram.ui;

import android.content.Context;
public final class fy0 implements Runnable {
    public final int f47993a;
    public final org.telegram.ui.ActionBar.g2 f47994b;
    public final Context f47995c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.Components.sh0 f47996e;

    public fy0(org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.sh0 sh0Var, int i7) {
        this.f47993a = i7;
        this.f47994b = g2Var;
        this.f47995c = context;
        this.d = i6Var;
        this.f47996e = sh0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f47993a;
        org.telegram.ui.Components.sh0 sh0Var = this.f47996e;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        Context context = this.f47995c;
        org.telegram.ui.ActionBar.g2 g2Var = this.f47994b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.kc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new eu(context, 4), i6Var)).j();
                org.telegram.messenger.g0.g3(sh0Var);
                return;
            case 1:
                org.telegram.ui.Components.kc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new eu(context, 3), i6Var)).j();
                org.telegram.messenger.g0.g3(sh0Var);
                return;
            default:
                org.telegram.ui.Components.kc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new eu(context, 7), i6Var)).j();
                org.telegram.messenger.g0.g3(sh0Var);
                return;
        }
    }
}
