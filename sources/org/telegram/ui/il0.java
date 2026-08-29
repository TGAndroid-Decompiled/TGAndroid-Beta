package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class il0 implements RequestDelegate {
    public final int f39289a;
    public final vm0 f39290b;

    public il0(vm0 vm0Var, int i10) {
        this.f39289a = i10;
        this.f39290b = vm0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39289a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xe0(this.f39290b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new lf0(13, this.f39290b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new el0(this.f39290b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lf0(12, this.f39290b, tLObject));
                return;
        }
    }
}
