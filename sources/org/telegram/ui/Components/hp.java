package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class hp implements ResultCallback {
    public final org.telegram.messenger.f4 f35782a;
    public final kp f35783b;

    public hp(kp kpVar, org.telegram.messenger.f4 f4Var) {
        this.f35783b = kpVar;
        this.f35782a = f4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        int i7;
        Void r62 = (Void) obj;
        org.telegram.messenger.f4 f4Var = this.f35782a;
        if (f4Var.f23945f.f19633c) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        ArrayList e10 = f4Var.e(i7 | 5);
        kp kpVar = this.f35783b;
        org.telegram.messenger.ks.f(kpVar.f30223a).d(new xd(23, this, e10));
        kpVar.V1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f35783b.getContext(), tL_error.text, 0).show();
    }
}
