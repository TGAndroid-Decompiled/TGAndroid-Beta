package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class w11 extends f21 {
    public final Runnable R1;

    public w11(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i3, boolean z10, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i3, z10, null);
        this.R1 = runnable;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.R1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
