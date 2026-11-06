package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class w11 extends e21 {
    public final org.telegram.ui.af Q1;

    public w11(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i7, TL_iv.RichMessage richMessage, org.telegram.ui.af afVar) {
        super(activity, str, str2, null, inputPeer, i7, false, richMessage);
        this.Q1 = afVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Q1.run();
    }
}
