package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class n31 implements p31 {
    public final org.telegram.ui.ActionBar.n2 f38800a;
    public final Context f38801b;
    public final org.telegram.ui.ActionBar.d6 f38802c;
    public final org.telegram.ui.Components.yw d;

    public n31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.yw ywVar) {
        this.f38800a = n2Var;
        this.f38801b = context;
        this.f38802c = d6Var;
        this.d = ywVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new h31(this.f38800a, this.f38801b, this.f38802c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new wx0(23, this.f38800a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f38800a;
        n2Var.showDialog(new rg.y0(n2Var, 3, true));
    }
}
