package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c61 extends eo0 {
    public final n61 h;

    public c61(n61 n61Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 14.0f, d6Var);
        this.h = n61Var;
    }

    @Override
    public final void a(String str) {
        gg.f2 f2Var = this.h.v;
        gg.d2 d2Var = f2Var.S;
        int i10 = f2Var.f10597c;
        if (f2Var.N != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(f2Var.N, true);
            f2Var.N = 0;
        }
        if (f2Var.O != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(f2Var.O, true);
            f2Var.O = 0;
        }
        if (TextUtils.isEmpty(str)) {
            f2Var.R = null;
            f2Var.F.clear();
            f2Var.I.clear();
            f2Var.E.clear();
            f2Var.f10598e.b(false);
            f2Var.l();
        } else {
            f2Var.R = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(d2Var);
        AndroidUtilities.runOnUIThread(d2Var, 300L);
    }
}
