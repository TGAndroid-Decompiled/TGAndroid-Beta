package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class f31 implements h31 {
    public final org.telegram.ui.ActionBar.p2 f36745a;
    public final Context f36746b;
    public final org.telegram.ui.ActionBar.g6 f36747c;
    public final org.telegram.ui.Components.a90 d;

    public f31(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.a90 a90Var) {
        this.f36745a = p2Var;
        this.f36746b = context;
        this.f36747c = g6Var;
        this.d = a90Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new z21(this.f36745a, this.f36746b, this.f36747c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new w01(7, this.f36745a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f36745a;
        p2Var.showDialog(new fg.n1(p2Var, 3, true));
    }
}
