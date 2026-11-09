package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class lv0 extends no0 {
    public final zv0 R2;

    public lv0(zv0 zv0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.R2 = zv0Var;
    }

    @Override
    public final void K() {
        super.K();
        org.telegram.ui.ActionBar.f2 f2Var = this.R2.C1;
        if (f2Var instanceof org.telegram.ui.cn) {
            org.telegram.messenger.g0.a3(f2Var.getParentActivity(), f2Var.getClassGuid());
            if (((org.telegram.ui.cn) f2Var).Z.getVisibility() == 0) {
                f2Var.getFragmentView().requestLayout();
            }
        }
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        org.telegram.messenger.g0.i3(new org.telegram.ui.q8(this, hVar, i7, 23), 100L);
    }
}
