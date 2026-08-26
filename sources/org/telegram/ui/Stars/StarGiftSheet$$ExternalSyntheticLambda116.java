package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class StarGiftSheet$$ExternalSyntheticLambda116 implements RequestDelegate {
    public final int $r8$classId = 1;
    public final StarGiftSheet f$0;
    public final Object f$1;
    public final long f$2;
    public final long f$3;
    public final long f$4;

    public StarGiftSheet$$ExternalSyntheticLambda116(StarGiftSheet starGiftSheet, long j, long j2, Utilities.Callback callback, long j3) {
        this.f$0 = starGiftSheet;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$1 = callback;
        this.f$4 = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                StarGiftSheet starGiftSheet = this.f$0;
                starGiftSheet.getClass();
                AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda153(starGiftSheet, (AlertDialog) this.f$1, tLObject, this.f$2, this.f$3, this.f$4, tL_error));
                break;
            default:
                StarGiftSheet starGiftSheet2 = this.f$0;
                starGiftSheet2.getClass();
                AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda153(starGiftSheet2, tLObject, this.f$2, this.f$3, (Utilities.Callback) this.f$1, tL_error, this.f$4));
                break;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda116(StarGiftSheet starGiftSheet, AlertDialog alertDialog, long j, long j2, long j3) {
        this.f$0 = starGiftSheet;
        this.f$1 = alertDialog;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = j3;
    }
}
