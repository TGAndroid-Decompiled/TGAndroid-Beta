package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class n31 implements p31 {
    public final org.telegram.ui.ActionBar.m2 f35855a;
    public final Context f35856b;
    public final org.telegram.ui.ActionBar.d6 f35857c;
    public final org.telegram.ui.Components.xw d;

    public n31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.xw xwVar) {
        this.f35855a = m2Var;
        this.f35856b = context;
        this.f35857c = d6Var;
        this.d = xwVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new h31(this.f35855a, this.f35856b, this.f35857c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new jx0(25, this.f35855a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f35855a;
        m2Var.showDialog(new rg.x0(m2Var, 3, true));
    }
}
