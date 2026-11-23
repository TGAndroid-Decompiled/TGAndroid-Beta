package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class nc implements ResultCallback {
    public final int f50161a;
    public final oc f50162b;

    public nc(oc ocVar, int i7) {
        this.f50162b = ocVar;
        this.f50161a = i7;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.messenger.ls.f(this.f50161a).d(new k9(8, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f50162b.getContext(), tL_error.text, 0).show();
    }
}
