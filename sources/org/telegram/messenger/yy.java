package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yy implements RequestDelegate {
    public final Runnable f26790a;
    public final zy f26791b;

    public yy(zy zyVar, Runnable runnable) {
        this.f26791b = zyVar;
        this.f26790a = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new lg(this, tLObject, this.f26790a, 28));
    }
}
