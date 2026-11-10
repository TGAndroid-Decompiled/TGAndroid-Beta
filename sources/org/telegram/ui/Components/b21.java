package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class b21 extends k21 {
    public final Runnable T1;

    public b21(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i7, boolean z9, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i7, z9, null);
        this.T1 = runnable;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.T1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
