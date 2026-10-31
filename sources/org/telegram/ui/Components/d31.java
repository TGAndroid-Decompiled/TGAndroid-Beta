package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class d31 extends m31 {
    public final Runnable Q1;

    public d31(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i10, z10, null);
        this.Q1 = runnable;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.Q1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
