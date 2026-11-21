package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class jp implements ResultCallback {
    public final org.telegram.messenger.f4 f36585a;
    public final np f36586b;

    public jp(np npVar, org.telegram.messenger.f4 f4Var) {
        this.f36586b = npVar;
        this.f36585a = f4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        ArrayList e10 = this.f36585a.e(7);
        np npVar = this.f36586b;
        org.telegram.messenger.ks.f(npVar.f30170a).d(new mf(20, this, e10));
        npVar.V1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f36586b.getContext(), tL_error.text, 0).show();
    }
}
