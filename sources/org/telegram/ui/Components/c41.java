package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class c41 extends j41 {
    public final org.telegram.ui.ug T;

    public c41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.ug ugVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.T = ugVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T.run();
    }
}
