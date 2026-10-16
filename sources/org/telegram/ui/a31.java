package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a31 implements ResultCallback {
    public final l31 f33733a;

    public a31(l31 l31Var) {
        this.f33733a = l31Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f33733a.b0(list);
        l31.S = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f33733a.getParentActivity(), tL_error.text, 0).show();
    }
}
