package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class b41 implements d41 {
    public final org.telegram.ui.ActionBar.p2 f31156a;
    public final Context f31157b;
    public final org.telegram.ui.ActionBar.f6 f31158c;
    public final org.telegram.ui.Components.hy d;

    public b41(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.hy hyVar) {
        this.f31156a = p2Var;
        this.f31157b = context;
        this.f31158c = f6Var;
        this.d = hyVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new v31(this.f31156a, this.f31157b, this.f31158c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ey0(23, this.f31156a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f31156a;
        p2Var.showDialog(new qg.a1(p2Var, 3, true));
    }
}
