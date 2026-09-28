package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class k21 implements ResultCallback {
    public final w21 f34918a;

    public k21(w21 w21Var) {
        this.f34918a = w21Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f34918a.c0(list);
        w21.S = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f34918a.getParentActivity(), tL_error.text, 0).show();
    }
}
