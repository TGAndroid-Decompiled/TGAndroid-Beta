package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

public final class o11 implements ResultCallback {

    public final y11 f40975a;

    public o11(y11 y11Var) {
        this.f40975a = y11Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f40975a.c0(list);
        y11.O = list;
    }

    @Override
    public final void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f40975a.getParentActivity(), tL_error.text, 0).show();
    }
}
