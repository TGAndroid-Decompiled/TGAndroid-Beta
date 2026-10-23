package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class n40 extends org.telegram.ui.Components.ir0 {
    public final u50 f39770e1;

    public n40(u50 u50Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.f39770e1 = u50Var;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        u50 u50Var = this.f39770e1;
        if (m10 == 1) {
            u50Var.k1().m(((TLRPC.Dialog) hVar.n(0)).f20347id, Integer.valueOf(i10), 41);
        } else {
            u50Var.k1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
