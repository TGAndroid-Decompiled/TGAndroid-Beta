package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
public final class m31 extends jl0 {
    public final x31 f37051f;

    public m31(x31 x31Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 14.0f, e6Var);
        this.f37051f = x31Var;
    }

    @Override
    public final void a(String str) {
        jg.c2 c2Var = this.f37051f.f41555w;
        jg.a2 a2Var = c2Var.T;
        int i7 = c2Var.f17036c;
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
            c2Var.f17037e.b(false);
            c2Var.f();
        } else {
            c2Var.S = str.toLowerCase();
        }
        org.telegram.messenger.g0.r(a2Var);
        org.telegram.messenger.g0.i3(a2Var, 300L);
    }
}
