package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class f50 extends org.telegram.ui.Components.iq0 {
    public final k60 f33551b1;

    public f50(k60 k60Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.f33551b1 = k60Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        k60 k60Var = this.f33551b1;
        if (m10 == 1) {
            k60Var.k1().m(((TLRPC.Dialog) iVar.n(0)).f18125id, Integer.valueOf(i10), 41);
        } else {
            k60Var.k1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
