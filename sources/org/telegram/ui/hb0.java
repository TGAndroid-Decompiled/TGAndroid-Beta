package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hb0 implements RequestDelegate {
    public final int f46288a;
    public final rb0 f46289b;
    public final String f46290c;

    public hb0(rb0 rb0Var, String str, int i7) {
        this.f46288a = i7;
        this.f46289b = rb0Var;
        this.f46290c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46288a) {
            case 0:
                org.telegram.messenger.g0.h3(new jb0(this.f46289b, tL_error, this.f46290c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new jb0(this.f46289b, tL_error, tLObject, this.f46290c));
                return;
        }
    }
}
