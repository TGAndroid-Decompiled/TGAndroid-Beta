package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class k71 extends org.telegram.ui.Components.mo0 {
    public final m71 U2;

    public k71(m71 m71Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.U2 = m71Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        int m10 = hVar.m();
        m71 m71Var = this.U2;
        if (m10 == 1) {
            m71Var.f47820a.m0.m(((TLRPC.Dialog) hVar.n(0)).f26964id, Integer.valueOf(i7), 61);
        } else {
            m71Var.f47820a.m0.k(0L, 61, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
