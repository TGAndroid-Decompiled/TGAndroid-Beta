package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
public final class l41 extends im0 {
    public final x41 f28049f;

    public l41(x41 x41Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, 14.0f, p6Var);
        this.f28049f = x41Var;
    }

    @Override
    public final void a(String str) {
        zf.o1 o1Var = this.f28049f.f32418w;
        zf.n1 n1Var = o1Var.S;
        int i10 = o1Var.f55617c;
        if (o1Var.N != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(o1Var.N, true);
            o1Var.N = 0;
        }
        if (o1Var.O != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(o1Var.O, true);
            o1Var.O = 0;
        }
        if (TextUtils.isEmpty(str)) {
            o1Var.R = null;
            o1Var.F.clear();
            o1Var.I.clear();
            o1Var.E.clear();
            o1Var.e.b(false);
            o1Var.f();
        } else {
            o1Var.R = str.toLowerCase();
        }
        org.telegram.messenger.i0.r(n1Var);
        org.telegram.messenger.i0.h3(n1Var, 300L);
    }
}
