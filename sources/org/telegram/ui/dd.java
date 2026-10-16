package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class dd implements ResultCallback {
    public final int f34960a;
    public final ed f34961b;

    public dd(ed edVar, int i10) {
        this.f34961b = edVar;
        this.f34960a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f34960a).doOnIdle(new org.telegram.messenger.voip.p0(27, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f34961b.getContext(), tL_error.text, 0).show();
    }
}
