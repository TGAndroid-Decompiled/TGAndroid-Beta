package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cd implements RequestDelegate {
    public final int f36670a;
    public final md f36671b;

    public cd(md mdVar, int i10) {
        this.f36670a = i10;
        this.f36671b = mdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36670a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(24, this.f36671b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new dd(this.f36671b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(22, this.f36671b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(this.f36671b, tL_error, tLObject, 11));
                return;
        }
    }
}
