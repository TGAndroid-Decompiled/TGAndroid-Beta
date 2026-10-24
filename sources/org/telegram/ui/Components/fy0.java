package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class fy0 extends hr0 {
    public final sy0 f26445e1;

    public fy0(sy0 sy0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.f26445e1 = sy0Var;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.h4(this, hVar, i10, 26), 100L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.o2 o2Var = this.f26445e1.L;
        if (o2Var instanceof org.telegram.ui.sn) {
            AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
            if (((org.telegram.ui.sn) o2Var).Y.getVisibility() == 0) {
                o2Var.getFragmentView().requestLayout();
            }
        }
    }
}
