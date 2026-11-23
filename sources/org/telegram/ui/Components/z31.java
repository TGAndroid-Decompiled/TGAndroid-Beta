package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
public final class z31 extends tl0 {
    public final k41 f42670f;

    public z31(k41 k41Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, 14.0f, h6Var);
        this.f42670f = k41Var;
    }

    @Override
    public final void a(String str) {
        jg.c2 c2Var = this.f42670f.f36776w;
        jg.a2 a2Var = c2Var.T;
        int i7 = c2Var.f17447c;
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
            c2Var.f17448e.b(false);
            c2Var.f();
        } else {
            c2Var.S = str.toLowerCase();
        }
        org.telegram.messenger.g0.r(a2Var);
        org.telegram.messenger.g0.h3(a2Var, 300L);
    }
}
