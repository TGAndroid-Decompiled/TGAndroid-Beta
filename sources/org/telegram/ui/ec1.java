package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ec1 extends org.telegram.ui.Components.mr0 {
    public final hc1 f39081a1;

    public ec1(hc1 hc1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f39081a1 = hc1Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        hc1 hc1Var = this.f39081a1;
        if (m10 == 1) {
            hc1Var.f39982a.m0.m(((TLRPC.Dialog) hVar.n(0)).f22031id, Integer.valueOf(i10), 61);
        } else {
            hc1Var.f39982a.m0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
