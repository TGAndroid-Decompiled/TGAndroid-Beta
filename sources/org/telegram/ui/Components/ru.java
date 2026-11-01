package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ru extends pp0 {
    public final cv R2;

    public ru(cv cvVar, Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = cvVar;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.i0.h3(new ag.o0(this, hVar, i10, 23), 100L);
    }
}
