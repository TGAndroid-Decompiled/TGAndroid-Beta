package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class kx0 extends mq0 {
    public final yx0 Y0;

    public kx0(yx0 yx0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.Y0 = yx0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new gy(this, hVar, i10, 18), 100L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.p2 p2Var = this.Y0.I;
        if (p2Var instanceof org.telegram.ui.xn) {
            AndroidUtilities.requestAdjustResize(p2Var.getParentActivity(), p2Var.getClassGuid());
            if (((org.telegram.ui.xn) p2Var).V.getVisibility() == 0) {
                p2Var.getFragmentView().requestLayout();
            }
        }
    }
}
