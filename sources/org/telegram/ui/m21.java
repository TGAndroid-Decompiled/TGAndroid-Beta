package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class m21 implements ResultCallback {
    public final x21 f35128a;

    public m21(x21 x21Var) {
        this.f35128a = x21Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f35128a.c0(list);
        x21.S = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f35128a.getParentActivity(), tL_error.text, 0).show();
    }
}
