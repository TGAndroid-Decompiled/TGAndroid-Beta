package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h21 extends p21 {
    public final org.telegram.ui.uf U1;

    public h21(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i7, TL_iv.RichMessage richMessage, org.telegram.ui.uf ufVar) {
        super(activity, str, str2, null, inputPeer, i7, false, richMessage);
        this.U1 = ufVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.U1.run();
    }
}
