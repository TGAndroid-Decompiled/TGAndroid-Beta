package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class oy0 extends mr0 {
    public final cz0 f31393a1;

    public oy0(cz0 cz0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, str, false, str2, false, u6Var);
        this.f31393a1 = cz0Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.g4(this, hVar, i10, 24), 100L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.r2 r2Var = this.f31393a1.L;
        if (r2Var instanceof org.telegram.ui.un) {
            AndroidUtilities.requestAdjustResize(r2Var.getParentActivity(), r2Var.getClassGuid());
            if (((org.telegram.ui.un) r2Var).Y.getVisibility() == 0) {
                r2Var.getFragmentView().requestLayout();
            }
        }
    }
}
