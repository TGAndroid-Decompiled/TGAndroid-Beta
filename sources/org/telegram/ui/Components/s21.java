package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class s21 extends z21 {
    public final org.telegram.ui.gf P;

    public s21(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i9, TL_iv.RichMessage richMessage, org.telegram.ui.gf gfVar) {
        super(activity, str, str2, null, inputPeer, i9, false, richMessage);
        this.P = gfVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.P.run();
    }
}
