package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ld1 extends org.telegram.ui.Components.sr0 {
    public final nd1 f39707b1;

    public ld1(nd1 nd1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f39707b1 = nd1Var;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        nd1 nd1Var = this.f39707b1;
        if (m10 == 1) {
            nd1Var.f40390a.f44770l0.m(((TLRPC.Dialog) iVar.n(0)).f19807id, Integer.valueOf(i10), 61);
        } else {
            nd1Var.f40390a.f44770l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
