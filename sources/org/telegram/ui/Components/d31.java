package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class d31 extends k31 {
    public final org.telegram.ui.df P;

    public d31(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.df dfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.P = dfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.P.run();
    }
}
