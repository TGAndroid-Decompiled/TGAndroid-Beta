package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
public final class c31 extends il0 {
    public final n31 f32521f;

    public c31(n31 n31Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 14.0f, e6Var);
        this.f32521f = n31Var;
    }

    @Override
    public final void a(String str) {
        kg.y1 y1Var = this.f32521f.f36362w;
        kg.w1 w1Var = y1Var.T;
        int i3 = y1Var.f17234c;
        if (y1Var.O != 0) {
            ConnectionsManager.getInstance(i3).cancelRequest(y1Var.O, true);
            y1Var.O = 0;
        }
        if (y1Var.P != 0) {
            ConnectionsManager.getInstance(i3).cancelRequest(y1Var.P, true);
            y1Var.P = 0;
        }
        if (TextUtils.isEmpty(str)) {
            y1Var.S = null;
            y1Var.G.clear();
            y1Var.J.clear();
            y1Var.F.clear();
            y1Var.f17235e.b(false);
            y1Var.f();
        } else {
            y1Var.S = str.toLowerCase();
        }
        org.telegram.messenger.g0.r(w1Var);
        org.telegram.messenger.g0.i3(w1Var, 300L);
    }
}
