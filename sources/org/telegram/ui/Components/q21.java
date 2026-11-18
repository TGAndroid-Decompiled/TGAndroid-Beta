package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class q21 extends y21 {
    public final org.telegram.ui.vf U1;

    public q21(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i7, TL_iv.RichMessage richMessage, org.telegram.ui.vf vfVar) {
        super(activity, str, str2, null, inputPeer, i7, false, richMessage);
        this.U1 = vfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.U1.run();
    }
}
