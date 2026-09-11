package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cd implements RequestDelegate {
    public final int f35071a;
    public final md f35072b;

    public cd(md mdVar, int i10) {
        this.f35071a = i10;
        this.f35072b = mdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35071a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(23, this.f35072b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new dd(this.f35072b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(21, this.f35072b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(this.f35072b, tL_error, tLObject, 11));
                return;
        }
    }
}
