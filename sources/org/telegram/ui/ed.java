package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ed implements ResultCallback {
    public final int f35518a;
    public final fd f35519b;

    public ed(fd fdVar, int i10) {
        this.f35519b = fdVar;
        this.f35518a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f35518a).doOnIdle(new fc(2, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f35519b.getContext(), tL_error.text, 0).show();
    }
}
