package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class qy0 extends sr0 {
    public final dz0 f29955b1;

    public qy0(dz0 dz0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.f29955b1 = dz0Var;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new bl(this, iVar, i10, 21), 100L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.m2 m2Var = this.f29955b1.L;
        if (m2Var instanceof org.telegram.ui.eo) {
            AndroidUtilities.requestAdjustResize(m2Var.getParentActivity(), m2Var.getClassGuid());
            if (((org.telegram.ui.eo) m2Var).Y.getVisibility() == 0) {
                m2Var.getFragmentView().requestLayout();
            }
        }
    }
}
