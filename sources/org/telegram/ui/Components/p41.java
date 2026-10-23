package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class p41 extends y41 {
    public final org.telegram.ui.kf Z;

    public p41(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.kf kfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.Z = kfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Z.run();
    }
}
