package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ux0 extends sq0 {
    public final hy0 f27759b1;

    public ux0(hy0 hy0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.f27759b1 = hy0Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new my(this, iVar, i10, 18), 100L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.p2 p2Var = this.f27759b1.L;
        if (p2Var instanceof org.telegram.ui.eo) {
            AndroidUtilities.requestAdjustResize(p2Var.getParentActivity(), p2Var.getClassGuid());
            if (((org.telegram.ui.eo) p2Var).Y.getVisibility() == 0) {
                p2Var.getFragmentView().requestLayout();
            }
        }
    }
}
