package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class vv0 extends zo0 {
    public final jw0 V2;

    public vv0(jw0 jw0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = jw0Var;
    }

    @Override
    public final void L() {
        super.L();
        org.telegram.ui.ActionBar.g2 g2Var = this.V2.G1;
        if (g2Var instanceof org.telegram.ui.bn) {
            org.telegram.messenger.g0.Z2(g2Var.getParentActivity(), g2Var.getClassGuid());
            if (((org.telegram.ui.bn) g2Var).f46118a0.getVisibility() == 0) {
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
