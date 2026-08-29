package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class h41 extends um0 {
    public final s41 h;

    public h41(s41 s41Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 14.0f, c6Var);
        this.h = s41Var;
    }

    @Override
    public final void a(String str) {
        rf.m1 m1Var = this.h.v;
        rf.l1 l1Var = m1Var.O;
        int i10 = m1Var.f47308c;
        if (m1Var.J != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(m1Var.J, true);
            m1Var.J = 0;
        }
        if (m1Var.K != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(m1Var.K, true);
            m1Var.K = 0;
        }
        if (TextUtils.isEmpty(str)) {
            m1Var.N = null;
            m1Var.B.clear();
            m1Var.E.clear();
            m1Var.A.clear();
            m1Var.f47309e.b(false);
            m1Var.l();
        } else {
            m1Var.N = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(l1Var);
        AndroidUtilities.runOnUIThread(l1Var, 300L);
    }
}
