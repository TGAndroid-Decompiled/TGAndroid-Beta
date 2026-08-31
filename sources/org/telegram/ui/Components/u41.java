package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class u41 extends fn0 {
    public final f51 h;

    public u41(f51 f51Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 14.0f, g6Var);
        this.h = f51Var;
    }

    @Override
    public final void a(String str) {
        uf.m1 m1Var = this.h.v;
        uf.l1 l1Var = m1Var.P;
        int i10 = m1Var.f48646c;
        if (m1Var.K != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(m1Var.K, true);
            m1Var.K = 0;
        }
        if (m1Var.L != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(m1Var.L, true);
            m1Var.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            m1Var.O = null;
            m1Var.C.clear();
            m1Var.F.clear();
            m1Var.B.clear();
            m1Var.f48647e.b(false);
            m1Var.l();
        } else {
            m1Var.O = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(l1Var);
        AndroidUtilities.runOnUIThread(l1Var, 300L);
    }
}
