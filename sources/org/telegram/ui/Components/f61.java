package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class f61 extends eo0 {
    public final q61 f28036f;

    public f61(q61 q61Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 14.0f, u6Var);
        this.f28036f = q61Var;
    }

    @Override
    public final void a(String str) {
        ig.d2 d2Var = this.f28036f.v;
        ig.b2 b2Var = d2Var.S;
        int i10 = d2Var.f14030c;
        if (d2Var.N != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(d2Var.N, true);
            d2Var.N = 0;
        }
        if (d2Var.O != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(d2Var.O, true);
            d2Var.O = 0;
        }
        if (TextUtils.isEmpty(str)) {
            d2Var.R = null;
            d2Var.F.clear();
            d2Var.I.clear();
            d2Var.E.clear();
            d2Var.e.b(false);
            d2Var.l();
        } else {
            d2Var.R = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(b2Var);
        AndroidUtilities.runOnUIThread(b2Var, 300L);
    }
}
