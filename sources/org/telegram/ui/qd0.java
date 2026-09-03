package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qd0 implements RequestDelegate {
    public final int f37391a;
    public final ae0 f37392b;
    public final String f37393c;

    public qd0(ae0 ae0Var, String str, int i10) {
        this.f37391a = i10;
        this.f37392b = ae0Var;
        this.f37393c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37391a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sd0(this.f37392b, tL_error, this.f37393c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sd0(this.f37392b, tL_error, tLObject, this.f37393c));
                return;
        }
    }
}
