package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class j40 extends org.telegram.ui.Components.rp0 {
    public final o50 X0;

    public j40(o50 o50Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.X0 = o50Var;
    }

    @Override
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        o50 o50Var = this.X0;
        if (m10 == 1) {
            o50Var.k1().m(((TLRPC.Dialog) hVar.n(0)).f22384id, Integer.valueOf(i9), 41);
        } else {
            o50Var.k1().k(0L, 41, Integer.valueOf(i9), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
