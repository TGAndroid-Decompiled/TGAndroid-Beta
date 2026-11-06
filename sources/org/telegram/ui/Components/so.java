package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class so implements ResultCallback {
    public final org.telegram.messenger.d4 f38128a;
    public final vo f38129b;

    public so(vo voVar, org.telegram.messenger.d4 d4Var) {
        this.f38129b = voVar;
        this.f38128a = d4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        int i7;
        Void r62 = (Void) obj;
        org.telegram.messenger.d4 d4Var = this.f38128a;
        if (d4Var.f21953f.f18060c) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        ArrayList e10 = d4Var.e(i7 | 5);
        vo voVar = this.f38129b;
        org.telegram.messenger.qs.f(voVar.f28612a).d(new f(29, this, e10));
        voVar.R1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f38129b.getContext(), tL_error.text, 0).show();
    }
}
