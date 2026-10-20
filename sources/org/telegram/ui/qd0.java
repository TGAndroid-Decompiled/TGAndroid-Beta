package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qd0 implements RequestDelegate {
    public final int f40549a;
    public final sd0 f40550b;
    public final String f40551c;
    public final String d;

    public qd0(sd0 sd0Var, String str, String str2, int i10) {
        this.f40549a = i10;
        this.f40550b = sd0Var;
        this.f40551c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40549a) {
            case 0:
                AndroidUtilities.runOnUIThread(new nd0(this.f40550b, tL_error, this.f40551c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new nd0(this.f40550b, tL_error, tLObject, this.f40551c, this.d));
                return;
        }
    }
}
