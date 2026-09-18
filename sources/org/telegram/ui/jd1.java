package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class jd1 extends org.telegram.ui.Components.iq0 {
    public final ld1 f34855b1;

    public jd1(ld1 ld1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f34855b1 = ld1Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        ld1 ld1Var = this.f34855b1;
        if (m10 == 1) {
            ld1Var.f35506a.f39571l0.m(((TLRPC.Dialog) iVar.n(0)).f18125id, Integer.valueOf(i10), 61);
        } else {
            ld1Var.f35506a.f39571l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
