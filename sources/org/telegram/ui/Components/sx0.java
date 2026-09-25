package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class sx0 extends uq0 {
    public final fy0 f28337b1;

    public sx0(fy0 fy0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, str, false, str2, false, d6Var);
        this.f28337b1 = fy0Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new xm(this, iVar, i10, 20), 100L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.m2 m2Var = this.f28337b1.L;
        if (m2Var instanceof org.telegram.ui.wn) {
            AndroidUtilities.requestAdjustResize(m2Var.getParentActivity(), m2Var.getClassGuid());
            if (((org.telegram.ui.wn) m2Var).Y.getVisibility() == 0) {
                m2Var.getFragmentView().requestLayout();
            }
        }
    }
}
