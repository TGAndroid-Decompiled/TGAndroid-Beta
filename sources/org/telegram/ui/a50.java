package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class a50 extends org.telegram.ui.Components.hq0 {
    public final f60 f31665b1;

    public a50(f60 f60Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.f31665b1 = f60Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        f60 f60Var = this.f31665b1;
        if (m10 == 1) {
            f60Var.k1().m(((TLRPC.Dialog) iVar.n(0)).f18087id, Integer.valueOf(i10), 41);
        } else {
            f60Var.k1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
