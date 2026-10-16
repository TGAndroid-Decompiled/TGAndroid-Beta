package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class hy0 extends ir0 {
    public final uy0 f25431b1;

    public hy0(uy0 uy0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.f25431b1 = uy0Var;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.gm(this, hVar, i10, 22), 100L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.m2 m2Var = this.f25431b1.L;
        if (m2Var instanceof org.telegram.ui.fo) {
            AndroidUtilities.requestAdjustResize(m2Var.getParentActivity(), m2Var.getClassGuid());
            if (((org.telegram.ui.fo) m2Var).Y.getVisibility() == 0) {
                m2Var.getFragmentView().requestLayout();
            }
        }
    }
}
