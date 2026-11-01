package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ap implements ResultCallback {
    public final org.telegram.messenger.g4 f24466a;
    public final dp f24467b;

    public ap(dp dpVar, org.telegram.messenger.g4 g4Var) {
        this.f24467b = dpVar;
        this.f24466a = g4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        Void r62 = (Void) obj;
        org.telegram.messenger.g4 g4Var = this.f24466a;
        if (g4Var.f15858f.f8113c) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        ArrayList e = g4Var.e(i10 | 5);
        dp dpVar = this.f24467b;
        org.telegram.messenger.at.f(dpVar.f21584a).d(new cd(23, this, e));
        dpVar.R1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f24467b.getContext(), tL_error.text, 0).show();
    }
}
