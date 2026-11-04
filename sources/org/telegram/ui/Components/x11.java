package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class x11 extends f21 {
    public final org.telegram.ui.xe R1;

    public x11(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i3, TL_iv.RichMessage richMessage, org.telegram.ui.xe xeVar) {
        super(activity, str, str2, null, inputPeer, i3, false, richMessage);
        this.R1 = xeVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.R1.run();
    }
}
