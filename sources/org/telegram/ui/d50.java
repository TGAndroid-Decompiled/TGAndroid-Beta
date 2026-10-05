package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class d50 extends org.telegram.ui.Components.br0 {
    public final h60 X0;

    public d50(h60 h60Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.X0 = h60Var;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        h60 h60Var = this.X0;
        if (m10 == 1) {
            h60Var.k1().m(((TLRPC.Dialog) iVar.n(0)).f20051id, Integer.valueOf(i10), 41);
        } else {
            h60Var.k1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
