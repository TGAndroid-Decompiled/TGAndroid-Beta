package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class t41 extends en0 {
    public final e51 h;

    public t41(e51 e51Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 14.0f, f6Var);
        this.h = e51Var;
    }

    @Override
    public final void a(String str) {
        tf.m1 m1Var = this.h.v;
        tf.l1 l1Var = m1Var.P;
        int i10 = m1Var.f44795c;
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
            m1Var.e.b(false);
            m1Var.l();
        } else {
            m1Var.O = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(l1Var);
        AndroidUtilities.runOnUIThread(l1Var, 300L);
    }
}
