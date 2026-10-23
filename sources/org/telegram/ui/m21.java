package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class m21 implements o21 {
    public final org.telegram.ui.ActionBar.o2 f39362a;
    public final Context f39363b;
    public final org.telegram.ui.ActionBar.g6 f39364c;
    public final org.telegram.ui.Components.ko0 d;

    public m21(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ko0 ko0Var) {
        this.f39362a = o2Var;
        this.f39363b = context;
        this.f39364c = g6Var;
        this.d = ko0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new g21(this.f39362a, this.f39363b, this.f39364c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new mv0(26, this.f39362a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f39362a;
        o2Var.showDialog(new sg.y0(o2Var, 3, true));
    }
}
