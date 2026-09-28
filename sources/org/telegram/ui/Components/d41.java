package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class d41 extends k41 {
    public final org.telegram.ui.rg T;

    public d41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.rg rgVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = rgVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
