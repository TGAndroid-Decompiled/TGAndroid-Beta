package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class k31 implements m31 {
    public final org.telegram.ui.ActionBar.p2 f38182a;
    public final Context f38183b;
    public final org.telegram.ui.ActionBar.g6 f38184c;
    public final org.telegram.ui.Components.b90 d;

    public k31(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.b90 b90Var) {
        this.f38182a = p2Var;
        this.f38183b = context;
        this.f38184c = g6Var;
        this.d = b90Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new e31(this.f38182a, this.f38183b, this.f38184c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new h21(6, this.f38182a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f38182a;
        p2Var.showDialog(new fg.n1(p2Var, 3, true));
    }
}
