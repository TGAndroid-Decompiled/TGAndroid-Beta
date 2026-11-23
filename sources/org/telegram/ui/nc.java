package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class nc implements ResultCallback {
    public final int f50173a;
    public final oc f50174b;

    public nc(oc ocVar, int i7) {
        this.f50174b = ocVar;
        this.f50173a = i7;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.messenger.ls.f(this.f50173a).d(new u8(10, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f50174b.getContext(), tL_error.text, 0).show();
    }
}
