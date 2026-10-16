package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class c41 implements e41 {
    public final org.telegram.ui.ActionBar.m2 f34453a;
    public final Context f34454b;
    public final org.telegram.ui.ActionBar.c6 f34455c;
    public final org.telegram.ui.Components.g90 d;

    public c41(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.g90 g90Var) {
        this.f34453a = m2Var;
        this.f34454b = context;
        this.f34455c = c6Var;
        this.d = g90Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new w31(this.f34453a, this.f34454b, this.f34455c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new i11(10, this.f34453a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f34453a;
        m2Var.showDialog(new sg.y0(m2Var, 3, true));
    }
}
