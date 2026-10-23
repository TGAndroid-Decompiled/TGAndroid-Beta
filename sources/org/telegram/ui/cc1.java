package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class cc1 extends org.telegram.ui.Components.ir0 {
    public final ec1 f36334e1;

    public cc1(ec1 ec1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f36334e1 = ec1Var;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        ec1 ec1Var = this.f36334e1;
        if (m10 == 1) {
            ec1Var.f36921a.m0.m(((TLRPC.Dialog) hVar.n(0)).f20347id, Integer.valueOf(i10), 61);
        } else {
            ec1Var.f36921a.m0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
