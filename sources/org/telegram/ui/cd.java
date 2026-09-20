package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cd implements RequestDelegate {
    public final int f32710a;
    public final md f32711b;

    public cd(md mdVar, int i10) {
        this.f32710a = i10;
        this.f32711b = mdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32710a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(23, this.f32711b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new dd(this.f32711b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(21, this.f32711b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(this.f32711b, tL_error, tLObject, 11));
                return;
        }
    }
}
