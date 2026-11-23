package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class gp implements ResultCallback {
    public final org.telegram.messenger.f4 f35509a;
    public final kp f35510b;

    public gp(kp kpVar, org.telegram.messenger.f4 f4Var) {
        this.f35510b = kpVar;
        this.f35509a = f4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        ArrayList e10 = this.f35509a.e(7);
        kp kpVar = this.f35510b;
        org.telegram.messenger.ks.f(kpVar.f30223a).d(new xd(22, this, e10));
        kpVar.V1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f35510b.getContext(), tL_error.text, 0).show();
    }
}
