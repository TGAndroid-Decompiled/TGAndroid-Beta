package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class c31 extends k31 {
    public final Runnable P;

    public c31(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i10, z10, null);
        this.P = runnable;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }
}
