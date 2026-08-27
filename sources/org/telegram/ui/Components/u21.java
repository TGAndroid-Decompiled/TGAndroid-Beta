package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public final class u21 extends b31 {
    public final org.telegram.ui.gf P;

    public u21(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.gf gfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.P = gfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.P.run();
    }
}
