package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class p31 implements r31 {
    public final org.telegram.ui.ActionBar.n2 f39333a;
    public final Context f39334b;
    public final org.telegram.ui.ActionBar.d6 f39335c;
    public final org.telegram.ui.Components.yw d;

    public p31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.yw ywVar) {
        this.f39333a = n2Var;
        this.f39334b = context;
        this.f39335c = d6Var;
        this.d = ywVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new j31(this.f39333a, this.f39334b, this.f39335c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new wx0(23, this.f39333a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f39333a;
        n2Var.showDialog(new rg.y0(n2Var, 3, true));
    }
}
