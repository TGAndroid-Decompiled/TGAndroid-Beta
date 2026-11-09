package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
public final class i31 extends fl0 {
    public final u31 f34547f;

    public i31(u31 u31Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 14.0f, g6Var);
        this.f34547f = u31Var;
    }

    @Override
    public final void a(String str) {
        jg.d2 d2Var = this.f34547f.f38586w;
        jg.b2 b2Var = d2Var.S;
        int i7 = d2Var.f16699c;
        if (d2Var.N != 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(d2Var.N, true);
            d2Var.N = 0;
        }
        if (d2Var.O != 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(d2Var.O, true);
            d2Var.O = 0;
        }
        if (TextUtils.isEmpty(str)) {
            d2Var.R = null;
            d2Var.F.clear();
            d2Var.I.clear();
            d2Var.E.clear();
            d2Var.f16700e.b(false);
            d2Var.f();
        } else {
            d2Var.R = str.toLowerCase();
        }
        org.telegram.messenger.g0.r(b2Var);
        org.telegram.messenger.g0.i3(b2Var, 300L);
    }
}
