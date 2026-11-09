package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ro implements ResultCallback {
    public final org.telegram.messenger.d4 f37773a;
    public final vo f37774b;

    public ro(vo voVar, org.telegram.messenger.d4 d4Var) {
        this.f37774b = voVar;
        this.f37773a = d4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        ArrayList e10 = this.f37773a.e(7);
        vo voVar = this.f37774b;
        org.telegram.messenger.qs.f(voVar.f28621a).d(new f(28, this, e10));
        voVar.R1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f37774b.getContext(), tL_error.text, 0).show();
    }
}
