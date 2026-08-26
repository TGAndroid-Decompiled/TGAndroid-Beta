package org.telegram.ui.Stars;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class StarGiftSheet$$ExternalSyntheticLambda153 implements Runnable {
    public final int $r8$classId = 1;
    public final StarGiftSheet f$0;
    public final Object f$1;
    public final TLObject f$2;
    public final long f$3;
    public final long f$4;
    public final long f$5;
    public final TLRPC.TL_error f$6;

    public StarGiftSheet$$ExternalSyntheticLambda153(StarGiftSheet starGiftSheet, TLObject tLObject, long j, long j2, Utilities.Callback callback, TLRPC.TL_error tL_error, long j3) {
        this.f$0 = starGiftSheet;
        this.f$2 = tLObject;
        this.f$3 = j;
        this.f$4 = j2;
        this.f$1 = callback;
        this.f$6 = tL_error;
        this.f$5 = j3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$convert$103((AlertDialog) this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
                break;
            default:
                this.f$0.lambda$doTransfer$165(this.f$2, this.f$3, this.f$4, (Utilities.Callback) this.f$1, this.f$6, this.f$5);
                break;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda153(StarGiftSheet starGiftSheet, AlertDialog alertDialog, TLObject tLObject, long j, long j2, long j3, TLRPC.TL_error tL_error) {
        this.f$0 = starGiftSheet;
        this.f$1 = alertDialog;
        this.f$2 = tLObject;
        this.f$3 = j;
        this.f$4 = j2;
        this.f$5 = j3;
        this.f$6 = tL_error;
    }
}
