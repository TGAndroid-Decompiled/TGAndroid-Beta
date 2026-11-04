package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class nt extends org.telegram.ui.Components.oo0 {
    public final ot S2;

    public nt(ot otVar, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.S2 = otVar;
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.p11(this, hVar, i3), 250L);
    }
}
