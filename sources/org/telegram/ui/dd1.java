package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class dd1 extends org.telegram.ui.Components.zq0 {
    public final fd1 X0;

    public dd1(fd1 fd1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.X0 = fd1Var;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        fd1 fd1Var = this.X0;
        if (m10 == 1) {
            fd1Var.f36276a.f40068l0.m(((TLRPC.Dialog) iVar.n(0)).f20042id, Integer.valueOf(i10), 61);
        } else {
            fd1Var.f36276a.f40068l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
