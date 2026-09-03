package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class m31 extends v31 {
    public final Runnable Q;

    public m31(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z4, Runnable runnable) {
        super(context, str, str2, charSequence, inputPeer, i10, z4, null);
        this.Q = runnable;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.Q;
        if (runnable != null) {
            runnable.run();
        }
    }
}
