package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class p11 implements ResultCallback {
    public final z11 f41312a;

    public p11(z11 z11Var) {
        this.f41312a = z11Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f41312a.b0(list);
        z11.O = list;
    }

    @Override
    public final void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f41312a.getParentActivity(), tL_error.text, 0).show();
    }
}
