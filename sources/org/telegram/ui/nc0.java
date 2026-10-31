package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nc0 implements RequestDelegate {
    public final int f39904a;
    public final wc0 f39905b;
    public final String f39906c;

    public nc0(wc0 wc0Var, String str, int i10) {
        this.f39904a = i10;
        this.f39905b = wc0Var;
        this.f39906c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39904a) {
            case 0:
                org.telegram.messenger.i0.g3(new pc0(this.f39905b, tL_error, this.f39906c, tLObject));
                return;
            default:
                org.telegram.messenger.i0.g3(new pc0(this.f39905b, tL_error, tLObject, this.f39906c));
                return;
        }
    }
}
