package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class d21 extends l21 {
    public final org.telegram.ui.xf Q1;

    public d21(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i7, TL_iv.RichMessage richMessage, org.telegram.ui.xf xfVar) {
        super(activity, str, str2, null, inputPeer, i7, false, richMessage);
        this.Q1 = xfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Q1.run();
    }
}
