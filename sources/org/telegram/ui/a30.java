package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class a30 extends org.telegram.ui.Components.no0 {
    public final e40 R2;

    public a30(e40 e40Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.R2 = e40Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        int m10 = hVar.m();
        e40 e40Var = this.R2;
        if (m10 == 1) {
            e40Var.n1().m(((TLRPC.Dialog) hVar.n(0)).f26960id, Integer.valueOf(i7), 41);
        } else {
            e40Var.n1().k(0L, 41, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
