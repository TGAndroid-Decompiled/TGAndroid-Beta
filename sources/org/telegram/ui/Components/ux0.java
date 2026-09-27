package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ux0 extends vq0 {
    public final hy0 X0;

    public ux0(hy0 hy0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.X0 = hy0Var;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ym(this, iVar, i10, 20), 100L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.o2 o2Var = this.X0.L;
        if (o2Var instanceof org.telegram.ui.xn) {
            AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
            if (((org.telegram.ui.xn) o2Var).Y.getVisibility() == 0) {
                o2Var.getFragmentView().requestLayout();
            }
        }
    }
}
