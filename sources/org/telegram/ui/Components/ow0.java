package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ow0 extends op0 {
    public final cx0 R2;

    public ow0(cx0 cx0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = cx0Var;
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
        org.telegram.messenger.i0.h3(new ji0(this, hVar, i10, 10), 100L);
    }
}
