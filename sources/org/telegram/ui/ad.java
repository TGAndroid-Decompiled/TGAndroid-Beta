package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ad implements ResultCallback {
    public final int f35412a;
    public final bd f35413b;

    public ad(bd bdVar, int i10) {
        this.f35413b = bdVar;
        this.f35412a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f35412a).doOnIdle(new i0(16, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f35413b.getContext(), tL_error.text, 0).show();
    }
}
