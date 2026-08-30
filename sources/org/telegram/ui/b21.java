package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class b21 implements ResultCallback {
    public final m21 f32776a;

    public b21(m21 m21Var) {
        this.f32776a = m21Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f32776a.c0(list);
        m21.P = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f32776a.getParentActivity(), tL_error.text, 0).show();
    }
}
