package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dd implements RequestDelegate {
    public final int f36584a;
    public final md f36585b;

    public dd(md mdVar, int i10) {
        this.f36584a = i10;
        this.f36585b = mdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36584a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h0(19, this.f36585b, tLObject));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new h0(17, this.f36585b, tL_error));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new cd(this.f36585b, 3));
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1(this.f36585b, tL_error, tLObject, 11));
                return;
        }
    }
}
