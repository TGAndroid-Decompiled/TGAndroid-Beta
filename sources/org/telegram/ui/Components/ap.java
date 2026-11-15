package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ap implements ResultCallback {
    public final org.telegram.messenger.d4 f33033a;
    public final ep f33034b;

    public ap(ep epVar, org.telegram.messenger.d4 d4Var) {
        this.f33034b = epVar;
        this.f33033a = d4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        ArrayList e10 = this.f33033a.e(7);
        ep epVar = this.f33034b;
        org.telegram.messenger.ns.f(epVar.f29679a).d(new od(22, this, e10));
        epVar.V1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f33034b.getContext(), tL_error.text, 0).show();
    }
}
