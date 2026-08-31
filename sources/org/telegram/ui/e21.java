package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class e21 implements ResultCallback {
    public final o21 f36382a;

    public e21(o21 o21Var) {
        this.f36382a = o21Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f36382a.c0(list);
        o21.P = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f36382a.getParentActivity(), tL_error.text, 0).show();
    }
}
