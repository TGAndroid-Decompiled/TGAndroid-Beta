package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class kp implements ResultCallback {
    public final org.telegram.messenger.f4 f36944a;
    public final np f36945b;

    public kp(np npVar, org.telegram.messenger.f4 f4Var) {
        this.f36945b = npVar;
        this.f36944a = f4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        int i7;
        Void r62 = (Void) obj;
        org.telegram.messenger.f4 f4Var = this.f36944a;
        if (f4Var.f23857f.f19563c) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        ArrayList e10 = f4Var.e(i7 | 5);
        np npVar = this.f36945b;
        org.telegram.messenger.ls.f(npVar.f30173a).d(new mf(21, this, e10));
        npVar.V1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f36945b.getContext(), tL_error.text, 0).show();
    }
}
