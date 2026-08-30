package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class h81 extends org.telegram.ui.Components.lq0 {
    public final o81 Y0;

    public h81(o81 o81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.Y0 = o81Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new l01(this, hVar, i10), 250L);
    }
}
