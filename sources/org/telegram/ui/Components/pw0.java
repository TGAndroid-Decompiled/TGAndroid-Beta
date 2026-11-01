package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class pw0 extends pp0 {
    public final dx0 R2;

    public pw0(dx0 dx0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = dx0Var;
    }

    @Override
    public final void L() {
        super.L();
        org.telegram.ui.ActionBar.k2 k2Var = this.R2.C1;
        if (k2Var instanceof org.telegram.ui.un) {
            org.telegram.messenger.i0.Z2(k2Var.getParentActivity(), k2Var.getClassGuid());
            if (((org.telegram.ui.un) k2Var).Z.getVisibility() == 0) {
                k2Var.getFragmentView().requestLayout();
            }
        }
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.i0.h3(new ki0(this, hVar, i10, 10), 100L);
    }
}
