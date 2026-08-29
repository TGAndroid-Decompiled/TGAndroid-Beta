package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class q11 implements ResultCallback {
    public final a21 f41504a;

    public q11(a21 a21Var) {
        this.f41504a = a21Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f41504a.c0(list);
        a21.O = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f41504a.getParentActivity(), tL_error.text, 0).show();
    }
}
