package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class n31 implements p31 {
    public final org.telegram.ui.ActionBar.m2 f35745a;
    public final Context f35746b;
    public final org.telegram.ui.ActionBar.d6 f35747c;
    public final org.telegram.ui.Components.vw d;

    public n31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.vw vwVar) {
        this.f35745a = m2Var;
        this.f35746b = context;
        this.f35747c = d6Var;
        this.d = vwVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new h31(this.f35745a, this.f35746b, this.f35747c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new jx0(25, this.f35745a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f35745a;
        m2Var.showDialog(new rg.x0(m2Var, 3, true));
    }
}
