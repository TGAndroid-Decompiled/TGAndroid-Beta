package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class wv0 extends ap0 {
    public final kw0 V2;

    public wv0(kw0 kw0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.V2 = kw0Var;
    }

    @Override
    public final void L() {
        super.L();
        org.telegram.ui.ActionBar.g2 g2Var = this.V2.G1;
        if (g2Var instanceof org.telegram.ui.bn) {
            org.telegram.messenger.g0.Z2(g2Var.getParentActivity(), g2Var.getClassGuid());
            if (((org.telegram.ui.bn) g2Var).f45950a0.getVisibility() == 0) {
                g2Var.getFragmentView().requestLayout();
            }
        }
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.h3(new org.telegram.ui.f0(this, hVar, i7, 26), 100L);
    }
}
