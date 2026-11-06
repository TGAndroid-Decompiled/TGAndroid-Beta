package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
public final class b31 extends el0 {
    public final n31 f31996f;

    public b31(n31 n31Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 14.0f, f6Var);
        this.f31996f = n31Var;
    }

    @Override
    public final void a(String str) {
        jg.d2 d2Var = this.f31996f.f36239w;
        jg.b2 b2Var = d2Var.S;
        int i7 = d2Var.f16696c;
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
            d2Var.f16697e.b(false);
            d2Var.f();
        } else {
            d2Var.R = str.toLowerCase();
        }
        org.telegram.messenger.g0.r(b2Var);
        org.telegram.messenger.g0.i3(b2Var, 300L);
    }
}
