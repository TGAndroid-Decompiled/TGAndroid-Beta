package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class i51 extends kn0 {
    public final t51 h;

    public i51(t51 t51Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 14.0f, e6Var);
        this.h = t51Var;
    }

    @Override
    public final void a(String str) {
        gg.g2 g2Var = this.h.v;
        gg.e2 e2Var = g2Var.S;
        int i10 = g2Var.f9744c;
        if (g2Var.N != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(g2Var.N, true);
            g2Var.N = 0;
        }
        if (g2Var.O != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(g2Var.O, true);
            g2Var.O = 0;
        }
        if (TextUtils.isEmpty(str)) {
            g2Var.R = null;
            g2Var.F.clear();
            g2Var.I.clear();
            g2Var.E.clear();
            g2Var.e.b(false);
            g2Var.l();
        } else {
            g2Var.R = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(e2Var);
        AndroidUtilities.runOnUIThread(e2Var, 300L);
    }
}
