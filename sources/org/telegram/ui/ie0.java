package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ie0 implements RequestDelegate {
    public final int f38704a;
    public final ke0 f38705b;
    public final String f38706c;
    public final String d;

    public ie0(ke0 ke0Var, String str, String str2, int i10) {
        this.f38704a = i10;
        this.f38705b = ke0Var;
        this.f38706c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38704a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fe0(this.f38705b, tL_error, this.f38706c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fe0(this.f38705b, tL_error, tLObject, this.f38706c, this.d));
                return;
        }
    }
}
