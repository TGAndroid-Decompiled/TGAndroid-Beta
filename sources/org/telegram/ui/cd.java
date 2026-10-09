package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cd implements RequestDelegate {
    public final int f36624a;
    public final md f36625b;

    public cd(md mdVar, int i10) {
        this.f36624a = i10;
        this.f36625b = mdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36624a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(24, this.f36625b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new dd(this.f36625b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(22, this.f36625b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(this.f36625b, tL_error, tLObject, 11));
                return;
        }
    }
}
