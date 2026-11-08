package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class gu extends mo0 {
    public final ru R2;

    public gu(ru ruVar, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.R2 = ruVar;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        org.telegram.messenger.g0.i3(new org.telegram.ui.q8(this, hVar, i7, 6), 100L);
    }
}
