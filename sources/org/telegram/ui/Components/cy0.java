package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class cy0 extends er0 {
    public final py0 f25362c1;

    public cy0(py0 py0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, str, false, str2, false, d6Var);
        this.f25362c1 = py0Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.i4(this, hVar, i10, 26), 100L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.n2 n2Var = this.f25362c1.L;
        if (n2Var instanceof org.telegram.ui.qn) {
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
            if (((org.telegram.ui.qn) n2Var).Y.getVisibility() == 0) {
                n2Var.getFragmentView().requestLayout();
            }
        }
    }
}
