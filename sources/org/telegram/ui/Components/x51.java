package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class x51 extends yn0 {
    public final i61 h;

    public x51(i61 i61Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 14.0f, c6Var);
        this.h = i61Var;
    }

    @Override
    public final void a(String str) {
        hg.e2 e2Var = this.h.v;
        hg.c2 c2Var = e2Var.S;
        int i10 = e2Var.f10545c;
        if (e2Var.N != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(e2Var.N, true);
            e2Var.N = 0;
        }
        if (e2Var.O != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(e2Var.O, true);
            e2Var.O = 0;
        }
        if (TextUtils.isEmpty(str)) {
            e2Var.R = null;
            e2Var.F.clear();
            e2Var.I.clear();
            e2Var.E.clear();
            e2Var.e.b(false);
            e2Var.l();
        } else {
            e2Var.R = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(c2Var);
        AndroidUtilities.runOnUIThread(c2Var, 300L);
    }
}
