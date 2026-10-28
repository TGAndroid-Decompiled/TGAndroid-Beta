package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class gc1 extends org.telegram.ui.Components.nr0 {
    public final jc1 f39586a1;

    public gc1(jc1 jc1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f39586a1 = jc1Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        jc1 jc1Var = this.f39586a1;
        if (m10 == 1) {
            jc1Var.f40509a.m0.m(((TLRPC.Dialog) hVar.n(0)).f22032id, Integer.valueOf(i10), 61);
        } else {
            jc1Var.f40509a.m0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
