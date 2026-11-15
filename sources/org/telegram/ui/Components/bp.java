package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class bp implements ResultCallback {
    public final org.telegram.messenger.d4 f33337a;
    public final ep f33338b;

    public bp(ep epVar, org.telegram.messenger.d4 d4Var) {
        this.f33338b = epVar;
        this.f33337a = d4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        int i7;
        Void r62 = (Void) obj;
        org.telegram.messenger.d4 d4Var = this.f33337a;
        if (d4Var.f23036f.f19168c) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        ArrayList e10 = d4Var.e(i7 | 5);
        ep epVar = this.f33338b;
        org.telegram.messenger.ns.f(epVar.f29679a).d(new od(23, this, e10));
        epVar.V1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f33338b.getContext(), tL_error.text, 0).show();
    }
}
