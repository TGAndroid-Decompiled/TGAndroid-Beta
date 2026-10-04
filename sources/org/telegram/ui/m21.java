package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class m21 implements ResultCallback {
    public final y21 f38392a;

    public m21(y21 y21Var) {
        this.f38392a = y21Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f38392a.c0(list);
        y21.S = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f38392a.getParentActivity(), tL_error.text, 0).show();
    }
}
