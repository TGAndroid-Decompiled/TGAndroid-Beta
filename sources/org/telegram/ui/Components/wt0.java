package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class wt0 extends er0 {
    public final org.telegram.ui.ActionBar.n2 f32212c1;

    public wt0(Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null, str, false, str2, false, d6Var);
        this.f32212c1 = n2Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.i4(this.f32212c1, hVar, i10, 20), 100L);
    }
}
