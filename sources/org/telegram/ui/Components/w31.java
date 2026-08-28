package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class w31 extends hm0 {
    public final h41 h;

    public w31(h41 h41Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, 14.0f, b6Var);
        this.h = h41Var;
    }

    @Override
    public final void a(String str) {
        of.y1 y1Var = this.h.v;
        of.w1 w1Var = y1Var.O;
        int i9 = y1Var.f19550c;
        if (y1Var.J != 0) {
            ConnectionsManager.getInstance(i9).cancelRequest(y1Var.J, true);
            y1Var.J = 0;
        }
        if (y1Var.K != 0) {
            ConnectionsManager.getInstance(i9).cancelRequest(y1Var.K, true);
            y1Var.K = 0;
        }
        if (TextUtils.isEmpty(str)) {
            y1Var.N = null;
            y1Var.B.clear();
            y1Var.E.clear();
            y1Var.A.clear();
            y1Var.f19551e.b(false);
            y1Var.l();
        } else {
            y1Var.N = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(w1Var);
        AndroidUtilities.runOnUIThread(w1Var, 300L);
    }
}
