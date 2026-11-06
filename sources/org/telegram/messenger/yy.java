package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yy implements RequestDelegate {
    public final Runnable f26765a;
    public final zy f26766b;

    public yy(zy zyVar, Runnable runnable) {
        this.f26766b = zyVar;
        this.f26765a = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new lg(this, tLObject, this.f26765a, 28));
    }
}
