package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class c41 implements e41 {
    public final org.telegram.ui.ActionBar.m2 f34731a;
    public final Context f34732b;
    public final org.telegram.ui.ActionBar.c6 f34733c;
    public final org.telegram.ui.Components.f60 d;

    public c41(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.f60 f60Var) {
        this.f34731a = m2Var;
        this.f34732b = context;
        this.f34733c = c6Var;
        this.d = f60Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new w31(this.f34731a, this.f34732b, this.f34733c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new hz0(15, this.f34731a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f34731a;
        m2Var.showDialog(new sg.y0(m2Var, 3, true));
    }
}
