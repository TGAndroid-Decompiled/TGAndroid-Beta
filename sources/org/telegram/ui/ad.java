package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ad implements ResultCallback {
    public final int f32553a;
    public final bd f32554b;

    public ad(bd bdVar, int i10) {
        this.f32554b = bdVar;
        this.f32553a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f32553a).doOnIdle(new hc(1, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f32554b.getContext(), tL_error.text, 0).show();
    }
}
