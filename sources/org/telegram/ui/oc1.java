package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class oc1 extends org.telegram.ui.Components.lq0 {
    public final qc1 Y0;

    public oc1(qc1 qc1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.Y0 = qc1Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        int m9 = hVar.m();
        qc1 qc1Var = this.Y0;
        if (m9 == 1) {
            qc1Var.f37723a.f33313i0.m(((TLRPC.Dialog) hVar.n(0)).f19188id, Integer.valueOf(i10), 61);
        } else {
            qc1Var.f37723a.f33313i0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
