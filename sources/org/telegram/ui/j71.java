package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class j71 extends org.telegram.ui.Components.ap0 {
    public final m71 V2;

    public j71(m71 m71Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.V2 = m71Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        m71 m71Var = this.V2;
        if (m10 == 1) {
            m71Var.f49778a.f53752n0.m(((TLRPC.Dialog) hVar.n(0)).f28435id, Integer.valueOf(i7), 61);
        } else {
            m71Var.f49778a.f53752n0.k(0L, 61, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
