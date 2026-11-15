package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ap implements ResultCallback {
    public final org.telegram.messenger.d4 f33036a;
    public final ep f33037b;

    public ap(ep epVar, org.telegram.messenger.d4 d4Var) {
        this.f33037b = epVar;
        this.f33036a = d4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        ArrayList e10 = this.f33036a.e(7);
        ep epVar = this.f33037b;
        org.telegram.messenger.ns.f(epVar.f29679a).d(new od(22, this, e10));
        epVar.V1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f33037b.getContext(), tL_error.text, 0).show();
    }
}
