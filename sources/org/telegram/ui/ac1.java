package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ac1 extends org.telegram.ui.Components.rp0 {
    public final cc1 X0;

    public ac1(cc1 cc1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.X0 = cc1Var;
    }

    @Override
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        cc1 cc1Var = this.X0;
        if (m10 == 1) {
            cc1Var.f37167a.f41080h0.m(((TLRPC.Dialog) hVar.n(0)).f22384id, Integer.valueOf(i9), 61);
        } else {
            cc1Var.f37167a.f41080h0.k(0L, 61, Integer.valueOf(i9), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
