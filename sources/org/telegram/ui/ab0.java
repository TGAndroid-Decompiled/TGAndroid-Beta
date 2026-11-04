package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ab0 implements RequestDelegate {
    public final int f43703a;
    public final lb0 f43704b;
    public final String f43705c;

    public ab0(lb0 lb0Var, String str, int i3) {
        this.f43703a = i3;
        this.f43704b = lb0Var;
        this.f43705c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43703a) {
            case 0:
                org.telegram.messenger.g0.h3(new cb0(this.f43704b, tL_error, this.f43705c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new cb0(this.f43704b, tL_error, tLObject, this.f43705c));
                return;
        }
    }
}
