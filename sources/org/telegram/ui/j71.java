package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class j71 extends org.telegram.ui.Components.no0 {
    public final l71 R2;

    public j71(l71 l71Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.R2 = l71Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        int m10 = hVar.m();
        l71 l71Var = this.R2;
        if (m10 == 1) {
            l71Var.f47493a.m0.m(((TLRPC.Dialog) hVar.n(0)).f26960id, Integer.valueOf(i7), 61);
        } else {
            l71Var.f47493a.m0.k(0L, 61, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
