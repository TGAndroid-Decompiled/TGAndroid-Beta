package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class nc implements ResultCallback {
    public final int f49542a;
    public final oc f49543b;

    public nc(oc ocVar, int i7) {
        this.f49543b = ocVar;
        this.f49542a = i7;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.messenger.ns.f(this.f49542a).d(new u5(12, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f49543b.getContext(), tL_error.text, 0).show();
    }
}
