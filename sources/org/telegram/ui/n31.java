package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class n31 implements p31 {
    public final org.telegram.ui.ActionBar.m2 f35744a;
    public final Context f35745b;
    public final org.telegram.ui.ActionBar.d6 f35746c;
    public final org.telegram.ui.Components.vw d;

    public n31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.vw vwVar) {
        this.f35744a = m2Var;
        this.f35745b = context;
        this.f35746c = d6Var;
        this.d = vwVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new h31(this.f35744a, this.f35745b, this.f35746c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new jx0(25, this.f35744a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f35744a;
        m2Var.showDialog(new rg.x0(m2Var, 3, true));
    }
}
