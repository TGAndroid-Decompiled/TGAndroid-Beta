package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class pw0 extends rp0 {
    public final cx0 X0;

    public pw0(cx0 cx0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, str, false, str2, false, b6Var);
        this.X0 = cx0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(this, hVar, i9, 21), 100L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.o2 o2Var = this.X0.H;
        if (o2Var instanceof org.telegram.ui.qn) {
            AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
            if (((org.telegram.ui.qn) o2Var).U.getVisibility() == 0) {
                o2Var.getFragmentView().requestLayout();
            }
        }
    }
}
