package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class p40 extends org.telegram.ui.Components.mr0 {
    public final v50 f42351a1;

    public p40(v50 v50Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.f42351a1 = v50Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        v50 v50Var = this.f42351a1;
        if (m10 == 1) {
            v50Var.k1().m(((TLRPC.Dialog) hVar.n(0)).f22031id, Integer.valueOf(i10), 41);
        } else {
            v50Var.k1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
