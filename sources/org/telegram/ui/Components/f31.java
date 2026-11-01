package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f31 extends n31 {
    public final org.telegram.ui.ng Q1;

    public f31(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.ng ngVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.Q1 = ngVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Q1.run();
    }
}
