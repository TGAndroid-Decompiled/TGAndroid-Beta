package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cm0 implements RequestDelegate {
    public final int f32836a;
    public final on0 f32837b;

    public cm0(on0 on0Var, int i10) {
        this.f32836a = i10;
        this.f32837b = on0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32836a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pf0(this.f32837b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ml0(4, this.f32837b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new xl0(this.f32837b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ml0(3, this.f32837b, tLObject));
                return;
        }
    }
}
