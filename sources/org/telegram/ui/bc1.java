package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class bc1 extends org.telegram.ui.Components.dq0 {
    public final ec1 X0;

    public bc1(ec1 ec1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.X0 = ec1Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        ec1 ec1Var = this.X0;
        if (m10 == 1) {
            ec1Var.f37790a.f41647h0.m(((TLRPC.Dialog) hVar.n(0)).f22396id, Integer.valueOf(i10), 61);
        } else {
            ec1Var.f37790a.f41647h0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
