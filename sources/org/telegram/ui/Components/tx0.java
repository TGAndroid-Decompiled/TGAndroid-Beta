package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class tx0 extends uq0 {
    public final gy0 f28474b1;

    public tx0(gy0 gy0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.f28474b1 = gy0Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new wm(this, iVar, i10, 20), 100L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.n2 n2Var = this.f28474b1.L;
        if (n2Var instanceof org.telegram.ui.zn) {
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
            if (((org.telegram.ui.zn) n2Var).Y.getVisibility() == 0) {
                n2Var.getFragmentView().requestLayout();
            }
        }
    }
}
