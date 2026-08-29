package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ax0 extends dq0 {
    public final nx0 X0;

    public ax0(nx0 nx0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.X0 = nx0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new rm(this, hVar, i10, 20), 100L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.o2 o2Var = this.X0.H;
        if (o2Var instanceof org.telegram.ui.tn) {
            AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
            if (((org.telegram.ui.tn) o2Var).U.getVisibility() == 0) {
                o2Var.getFragmentView().requestLayout();
            }
        }
    }
}
