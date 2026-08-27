package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

public final class q21 implements s21 {

    public final org.telegram.ui.ActionBar.n2 f41492a;

    public final Context f41493b;

    public final org.telegram.ui.ActionBar.c6 f41494c;
    public final org.telegram.ui.Components.lg0 d;

    public q21(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.lg0 lg0Var) {
        this.f41492a = n2Var;
        this.f41493b = context;
        this.f41494c = c6Var;
        this.d = lg0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new j21(this.f41492a, this.f41493b, this.f41494c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new m21(2, this.f41492a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f41492a;
        n2Var.showDialog(new ag.g2(n2Var, 3, true));
    }
}
