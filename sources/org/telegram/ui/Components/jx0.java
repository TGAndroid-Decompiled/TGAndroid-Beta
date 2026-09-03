package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class jx0 extends lq0 {
    public final xx0 Y0;

    public jx0(xx0 xx0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.Y0 = xx0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ey(this, hVar, i10, 18), 100L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.p2 p2Var = this.Y0.I;
        if (p2Var instanceof org.telegram.ui.zn) {
            AndroidUtilities.requestAdjustResize(p2Var.getParentActivity(), p2Var.getClassGuid());
            if (((org.telegram.ui.zn) p2Var).V.getVisibility() == 0) {
                p2Var.getFragmentView().requestLayout();
            }
        }
    }
}
