package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class n31 extends v31 {
    public final org.telegram.ui.nf Q;

    public n31(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.nf nfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.Q = nfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Q.run();
    }
}
