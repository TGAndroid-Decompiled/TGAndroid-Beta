package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class mv0 extends po0 {
    public final bw0 V2;

    public mv0(bw0 bw0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.V2 = bw0Var;
    }

    @Override
    public final void L() {
        super.L();
        org.telegram.ui.ActionBar.e2 e2Var = this.V2.G1;
        if (e2Var instanceof org.telegram.ui.an) {
            org.telegram.messenger.g0.a3(e2Var.getParentActivity(), e2Var.getClassGuid());
            if (((org.telegram.ui.an) e2Var).f45118a0.getVisibility() == 0) {
                e2Var.getFragmentView().requestLayout();
            }
        }
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.i3(new org.telegram.ui.f0(this, hVar, i7, 26), 100L);
    }
}
