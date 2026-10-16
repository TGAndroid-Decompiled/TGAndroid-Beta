package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class h50 extends org.telegram.ui.Components.ir0 {
    public final n60 f36403b1;

    public h50(n60 n60Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.f36403b1 = n60Var;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        n60 n60Var = this.f36403b1;
        if (m10 == 1) {
            n60Var.l1().m(((TLRPC.Dialog) hVar.n(0)).f18920id, Integer.valueOf(i10), 41);
        } else {
            n60Var.l1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
