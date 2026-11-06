package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class kv0 extends mo0 {
    public final yv0 R2;

    public kv0(yv0 yv0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.R2 = yv0Var;
    }

    @Override
    public final void K() {
        super.K();
        org.telegram.ui.ActionBar.f2 f2Var = this.R2.C1;
        if (f2Var instanceof org.telegram.ui.an) {
            org.telegram.messenger.g0.a3(f2Var.getParentActivity(), f2Var.getClassGuid());
            if (((org.telegram.ui.an) f2Var).Z.getVisibility() == 0) {
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
