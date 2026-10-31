package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ad0 implements RequestDelegate {
    public final int f35628a;
    public final bd0 f35629b;
    public final String f35630c;
    public final String d;

    public ad0(bd0 bd0Var, String str, String str2, int i10) {
        this.f35628a = i10;
        this.f35629b = bd0Var;
        this.f35630c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35628a) {
            case 0:
                org.telegram.messenger.i0.g3(new xc0(this.f35629b, tL_error, this.f35630c, this.d, tLObject));
                return;
            default:
                org.telegram.messenger.i0.g3(new xc0(this.f35629b, tL_error, tLObject, this.f35630c, this.d));
                return;
        }
    }
}
