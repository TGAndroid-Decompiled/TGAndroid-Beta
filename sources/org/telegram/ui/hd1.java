package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class hd1 extends org.telegram.ui.Components.vq0 {
    public final jd1 f34126b1;

    public hd1(jd1 jd1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f34126b1 = jd1Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        jd1 jd1Var = this.f34126b1;
        if (m10 == 1) {
            jd1Var.f34846a.f38502l0.m(((TLRPC.Dialog) iVar.n(0)).f18300id, Integer.valueOf(i10), 61);
        } else {
            jd1Var.f34846a.f38502l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
