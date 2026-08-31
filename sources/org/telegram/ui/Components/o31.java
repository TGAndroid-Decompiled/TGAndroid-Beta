package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class o31 extends w31 {
    public final org.telegram.ui.lf Q;

    public o31(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.lf lfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.Q = lfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Q.run();
    }
}
