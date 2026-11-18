package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class hp implements ResultCallback {
    public final org.telegram.messenger.f4 f35945a;
    public final lp f35946b;

    public hp(lp lpVar, org.telegram.messenger.f4 f4Var) {
        this.f35946b = lpVar;
        this.f35945a = f4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        ArrayList e10 = this.f35945a.e(7);
        lp lpVar = this.f35946b;
        org.telegram.messenger.ks.f(lpVar.f30187a).d(new mg(18, this, e10));
        lpVar.V1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f35946b.getContext(), tL_error.text, 0).show();
    }
}
