package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ip implements ResultCallback {
    public final org.telegram.messenger.f4 f36161a;
    public final lp f36162b;

    public ip(lp lpVar, org.telegram.messenger.f4 f4Var) {
        this.f36162b = lpVar;
        this.f36161a = f4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        int i7;
        Void r62 = (Void) obj;
        org.telegram.messenger.f4 f4Var = this.f36161a;
        if (f4Var.f23837f.f19535c) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        ArrayList e10 = f4Var.e(i7 | 5);
        lp lpVar = this.f36162b;
        org.telegram.messenger.ks.f(lpVar.f30189a).d(new mg(19, this, e10));
        lpVar.V1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f36162b.getContext(), tL_error.text, 0).show();
    }
}
