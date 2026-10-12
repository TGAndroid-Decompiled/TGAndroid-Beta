package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n00 implements RequestDelegate {
    public final int f38390a;
    public final l10 f38391b;

    public n00(l10 l10Var, int i10) {
        this.f38390a = i10;
        this.f38391b = l10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38390a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o00(2, this.f38391b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new br(this.f38391b, tL_error, tLObject, 6));
                return;
        }
    }
}
