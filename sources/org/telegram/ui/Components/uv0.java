package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class uv0 extends yo0 {
    public final iw0 V2;

    public uv0(iw0 iw0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = iw0Var;
    }

    @Override
    public final void L() {
        super.L();
        org.telegram.ui.ActionBar.h2 h2Var = this.V2.G1;
        if (h2Var instanceof org.telegram.ui.bn) {
            org.telegram.messenger.g0.Z2(h2Var.getParentActivity(), h2Var.getClassGuid());
            if (((org.telegram.ui.bn) h2Var).f45923a0.getVisibility() == 0) {
                h2Var.getFragmentView().requestLayout();
            }
        }
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.h3(new org.telegram.ui.b0(this, hVar, i7, 27), 100L);
    }
}
