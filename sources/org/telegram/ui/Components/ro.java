package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ro implements ResultCallback {
    public final org.telegram.messenger.d4 f37811a;
    public final vo f37812b;

    public ro(vo voVar, org.telegram.messenger.d4 d4Var) {
        this.f37812b = voVar;
        this.f37811a = d4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        ArrayList e10 = this.f37811a.e(7);
        vo voVar = this.f37812b;
        org.telegram.messenger.qs.f(voVar.f28612a).d(new f(28, this, e10));
        voVar.R1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f37812b.getContext(), tL_error.text, 0).show();
    }
}
