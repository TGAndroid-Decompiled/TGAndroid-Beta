package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ro implements ResultCallback {
    public final org.telegram.messenger.d4 f37761a;
    public final vo f37762b;

    public ro(vo voVar, org.telegram.messenger.d4 d4Var) {
        this.f37762b = voVar;
        this.f37761a = d4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        ArrayList e10 = this.f37761a.e(7);
        vo voVar = this.f37762b;
        org.telegram.messenger.hs.f(voVar.f28583a).d(new cl(3, this, e10));
        voVar.S1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f37762b.getContext(), tL_error.text, 0).show();
    }
}
