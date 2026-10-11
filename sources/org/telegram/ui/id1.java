package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class id1 extends org.telegram.ui.Components.nr0 {
    public final kd1 f38698b1;

    public id1(kd1 kd1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f38698b1 = kd1Var;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        kd1 kd1Var = this.f38698b1;
        if (m10 == 1) {
            kd1Var.f39340a.f43395l0.m(((TLRPC.Dialog) iVar.n(0)).f20072id, Integer.valueOf(i10), 61);
        } else {
            kd1Var.f39340a.f43395l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
