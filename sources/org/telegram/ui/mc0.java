package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mc0 implements RequestDelegate {
    public final int f39502a;
    public final vc0 f39503b;
    public final String f39504c;

    public mc0(vc0 vc0Var, String str, int i10) {
        this.f39502a = i10;
        this.f39503b = vc0Var;
        this.f39504c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39502a) {
            case 0:
                org.telegram.messenger.i0.g3(new oc0(this.f39503b, tL_error, this.f39504c, tLObject));
                return;
            default:
                org.telegram.messenger.i0.g3(new oc0(this.f39503b, tL_error, tLObject, this.f39504c));
                return;
        }
    }
}
