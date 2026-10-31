package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e31 extends m31 {
    public final org.telegram.ui.mf Q1;

    public e31(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i10, TL_iv.RichMessage richMessage, org.telegram.ui.mf mfVar) {
        super(activity, str, str2, null, inputPeer, i10, false, richMessage);
        this.Q1 = mfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Q1.run();
    }
}
