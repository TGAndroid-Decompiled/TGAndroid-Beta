package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class bc1 extends org.telegram.ui.Components.hr0 {
    public final dc1 f36014e1;

    public bc1(dc1 dc1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f36014e1 = dc1Var;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        dc1 dc1Var = this.f36014e1;
        if (m10 == 1) {
            dc1Var.f36583a.m0.m(((TLRPC.Dialog) hVar.n(0)).f20348id, Integer.valueOf(i10), 61);
        } else {
            dc1Var.f36583a.m0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
