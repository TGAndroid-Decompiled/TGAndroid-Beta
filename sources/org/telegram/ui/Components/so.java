package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class so implements ResultCallback {
    public final org.telegram.messenger.d4 f38094a;
    public final vo f38095b;

    public so(vo voVar, org.telegram.messenger.d4 d4Var) {
        this.f38095b = voVar;
        this.f38094a = d4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        int i3;
        Void r62 = (Void) obj;
        org.telegram.messenger.d4 d4Var = this.f38094a;
        if (d4Var.f22144f.f16749c) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        ArrayList e10 = d4Var.e(i3 | 5);
        vo voVar = this.f38095b;
        org.telegram.messenger.hs.f(voVar.f28583a).d(new cl(4, this, e10));
        voVar.S1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f38095b.getContext(), tL_error.text, 0).show();
    }
}
