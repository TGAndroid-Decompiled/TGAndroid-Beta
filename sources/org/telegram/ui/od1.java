package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class od1 extends org.telegram.ui.Components.ir0 {
    public final qd1 f38624b1;

    public od1(qd1 qd1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f38624b1 = qd1Var;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        qd1 qd1Var = this.f38624b1;
        if (m10 == 1) {
            qd1Var.f39114a.f34612l0.m(((TLRPC.Dialog) hVar.n(0)).f18920id, Integer.valueOf(i10), 61);
        } else {
            qd1Var.f39114a.f34612l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
