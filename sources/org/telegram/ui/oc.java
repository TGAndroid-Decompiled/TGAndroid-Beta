package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class oc implements ResultCallback {
    public final int f48495a;
    public final pc f48496b;

    public oc(pc pcVar, int i7) {
        this.f48496b = pcVar;
        this.f48495a = i7;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.messenger.qs.f(this.f48495a).d(new org.telegram.ui.ActionBar.c(24, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f48496b.getContext(), tL_error.text, 0).show();
    }
}
