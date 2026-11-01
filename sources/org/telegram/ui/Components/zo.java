package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class zo implements ResultCallback {
    public final org.telegram.messenger.g4 f33195a;
    public final dp f33196b;

    public zo(dp dpVar, org.telegram.messenger.g4 g4Var) {
        this.f33196b = dpVar;
        this.f33195a = g4Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        ArrayList e = this.f33195a.e(7);
        dp dpVar = this.f33196b;
        org.telegram.messenger.at.f(dpVar.f21584a).d(new cd(22, this, e));
        dpVar.R1 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f33196b.getContext(), tL_error.text, 0).show();
    }
}
