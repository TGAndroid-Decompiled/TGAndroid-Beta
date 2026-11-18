package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
public final class w31 extends rl0 {
    public final h41 f41558f;

    public w31(h41 h41Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, 14.0f, i6Var);
        this.f41558f = h41Var;
    }

    @Override
    public final void a(String str) {
        jg.c2 c2Var = this.f41558f.f35722w;
        jg.a2 a2Var = c2Var.T;
        int i7 = c2Var.f17419c;
        if (c2Var.O != 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(c2Var.O, true);
            c2Var.O = 0;
        }
        if (c2Var.P != 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(c2Var.P, true);
            c2Var.P = 0;
        }
        if (TextUtils.isEmpty(str)) {
            c2Var.S = null;
            c2Var.G.clear();
            c2Var.J.clear();
            c2Var.F.clear();
            c2Var.f17420e.b(false);
            c2Var.f();
        } else {
            c2Var.S = str.toLowerCase();
        }
        org.telegram.messenger.g0.r(a2Var);
        org.telegram.messenger.g0.h3(a2Var, 300L);
    }
}
