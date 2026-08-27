package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

public final class m40 extends org.telegram.ui.Components.sp0 {
    public final s50 X0;

    public m40(s50 s50Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.X0 = s50Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int iM = hVar.m();
            s50 s50Var = this.X0;
            if (iM == 1) {
                s50Var.k1().m(((TLRPC.Dialog) hVar.n(0)).f22384id, Integer.valueOf(i10), 41);
            } else {
                s50Var.k1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
