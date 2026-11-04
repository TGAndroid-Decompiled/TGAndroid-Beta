package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class mc implements ResultCallback {
    public final int f47646a;
    public final nc f47647b;

    public mc(nc ncVar, int i3) {
        this.f47647b = ncVar;
        this.f47646a = i3;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.messenger.hs.f(this.f47646a).d(new org.telegram.messenger.voip.l0(28, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f47647b.getContext(), tL_error.text, 0).show();
    }
}
