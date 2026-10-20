package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class k40 extends org.telegram.ui.Components.fr0 {
    public final q50 f38413c1;

    public k40(q50 q50Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.f38413c1 = q50Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        q50 q50Var = this.f38413c1;
        if (m10 == 1) {
            q50Var.l1().m(((TLRPC.Dialog) hVar.n(0)).f20280id, Integer.valueOf(i10), 41);
        } else {
            q50Var.l1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
