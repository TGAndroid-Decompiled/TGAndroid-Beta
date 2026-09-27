package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class p31 implements r31 {
    public final org.telegram.ui.ActionBar.o2 f36319a;
    public final Context f36320b;
    public final org.telegram.ui.ActionBar.e6 f36321c;
    public final org.telegram.ui.Components.jy d;

    public p31(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.jy jyVar) {
        this.f36319a = o2Var;
        this.f36320b = context;
        this.f36321c = e6Var;
        this.d = jyVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new j31(this.f36319a, this.f36320b, this.f36321c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new by0(21, this.f36319a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f36319a;
        o2Var.showDialog(new rg.x0(o2Var, 3, true));
    }
}
