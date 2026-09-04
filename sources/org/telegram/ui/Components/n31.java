package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class n31 extends u31 {
    public final org.telegram.ui.qf T;

    public n31(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.qf qfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = qfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
