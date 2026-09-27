package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class b50 extends org.telegram.ui.Components.vq0 {
    public final g60 X0;

    public b50(g60 g60Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.X0 = g60Var;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        g60 g60Var = this.X0;
        if (m10 == 1) {
            g60Var.k1().m(((TLRPC.Dialog) iVar.n(0)).f18333id, Integer.valueOf(i10), 41);
        } else {
            g60Var.k1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
