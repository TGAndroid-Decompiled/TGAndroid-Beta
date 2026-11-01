package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ew0 extends org.telegram.ui.Components.pp0 {
    public final fw0 R2;

    public ew0(fw0 fw0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.R2 = fw0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.i0.h3(new hr0(this, hVar, i10, 17), 250L);
    }
}
