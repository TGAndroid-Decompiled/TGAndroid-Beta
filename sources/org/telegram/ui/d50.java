package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class d50 extends org.telegram.ui.Components.sr0 {
    public final i60 f36651b1;

    public d50(i60 i60Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.f36651b1 = i60Var;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        i60 i60Var = this.f36651b1;
        if (m10 == 1) {
            i60Var.l1().m(((TLRPC.Dialog) iVar.n(0)).f19807id, Integer.valueOf(i10), 41);
        } else {
            i60Var.l1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
