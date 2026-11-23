package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class nc implements ResultCallback {
    public final int f50289a;
    public final oc f50290b;

    public nc(oc ocVar, int i7) {
        this.f50290b = ocVar;
        this.f50289a = i7;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.messenger.ks.f(this.f50289a).d(new u5(12, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f50290b.getContext(), tL_error.text, 0).show();
    }
}
