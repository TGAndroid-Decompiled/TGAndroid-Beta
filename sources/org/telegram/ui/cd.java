package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class cd implements ResultCallback {
    public final int f36396a;
    public final dd f36397b;

    public cd(dd ddVar, int i10) {
        this.f36397b = ddVar;
        this.f36396a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f36396a).doOnIdle(new org.telegram.ui.ActionBar.f6(18, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.m.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f36397b.getContext(), tL_error.text, 0).show();
    }
}
