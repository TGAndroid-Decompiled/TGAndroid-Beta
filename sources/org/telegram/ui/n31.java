package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class n31 implements p31 {
    public final org.telegram.ui.ActionBar.m2 f35731a;
    public final Context f35732b;
    public final org.telegram.ui.ActionBar.d6 f35733c;
    public final org.telegram.ui.Components.wn0 d;

    public n31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.wn0 wn0Var) {
        this.f35731a = m2Var;
        this.f35732b = context;
        this.f35733c = d6Var;
        this.d = wn0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new h31(this.f35731a, this.f35732b, this.f35733c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ix0(26, this.f35731a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f35731a;
        m2Var.showDialog(new rg.x0(m2Var, 3, true));
    }
}
