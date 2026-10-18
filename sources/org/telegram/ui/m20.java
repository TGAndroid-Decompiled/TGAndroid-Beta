package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m20 implements RequestDelegate {
    public final int f39018a;
    public final s50 f39019b;

    public m20(s50 s50Var, int i10) {
        this.f39018a = i10;
        this.f39019b = s50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39018a) {
            case 0:
                s50.w(this.f39019b, tLObject);
                return;
            default:
                s50.t(this.f39019b, tLObject);
                return;
        }
    }
}
