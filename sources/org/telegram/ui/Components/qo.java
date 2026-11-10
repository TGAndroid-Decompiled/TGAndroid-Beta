package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class qo implements ResultCallback {
    public final org.telegram.messenger.d4 f37361a;
    public final vo f37362b;

    public qo(vo voVar, org.telegram.messenger.d4 d4Var) {
        this.f37362b = voVar;
        this.f37361a = d4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        ArrayList e10 = this.f37361a.e(7);
        vo voVar = this.f37362b;
        org.telegram.messenger.qs.f(voVar.f28669a).d(new org.telegram.ui.fq(29, this, e10));
        voVar.U1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f37362b.getContext(), tL_error.text, 0).show();
    }
}
