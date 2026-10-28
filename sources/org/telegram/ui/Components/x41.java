package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class x41 extends g51 {
    public final org.telegram.ui.ig Z;

    public x41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.ig igVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.Z = igVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Z.run();
    }
}
