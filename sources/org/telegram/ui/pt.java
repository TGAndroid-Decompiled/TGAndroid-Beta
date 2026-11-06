package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class pt extends org.telegram.ui.Components.mo0 {
    public final qt R2;

    public pt(qt qtVar, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.R2 = qtVar;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.k51(this, hVar, i7), 250L);
    }
}
