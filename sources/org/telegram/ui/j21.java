package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class j21 implements ResultCallback {
    public final u21 f37826a;

    public j21(u21 u21Var) {
        this.f37826a = u21Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f37826a.c0(list);
        u21.P = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f37826a.getParentActivity(), tL_error.text, 0).show();
    }
}
