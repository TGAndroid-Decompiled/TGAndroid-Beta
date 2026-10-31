package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
public final class k41 extends hm0 {
    public final w41 f27635f;

    public k41(w41 w41Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, 14.0f, p6Var);
        this.f27635f = w41Var;
    }

    @Override
    public final void a(String str) {
        zf.o1 o1Var = this.f27635f.f32002w;
        zf.n1 n1Var = o1Var.S;
        int i10 = o1Var.f55599c;
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
