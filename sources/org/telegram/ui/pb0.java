package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pb0 implements RequestDelegate {
    public final int f48506a;
    public final qb0 f48507b;
    public final String f48508c;
    public final String d;

    public pb0(qb0 qb0Var, String str, String str2, int i3) {
        this.f48506a = i3;
        this.f48507b = qb0Var;
        this.f48508c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48506a) {
            case 0:
                org.telegram.messenger.g0.h3(new mb0(this.f48507b, tL_error, this.f48508c, this.d, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new mb0(this.f48507b, tL_error, tLObject, this.f48508c, this.d));
                return;
        }
    }
}
