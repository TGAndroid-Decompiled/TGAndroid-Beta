package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatActivity$$ExternalSyntheticLambda337 implements Runnable {
    public final int $r8$classId;
    public final AlertDialog[] f$0;

    public ChatActivity$$ExternalSyntheticLambda337(AlertDialog[] alertDialogArr, int i) {
        this.$r8$classId = i;
        this.f$0 = alertDialogArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertDialog[] alertDialogArr = this.f$0;
                try {
                    alertDialogArr[0].dismiss();
                    break;
                } catch (Throwable unused) {
                }
                alertDialogArr[0] = null;
                break;
            case 1:
                AlertDialog[] alertDialogArr2 = this.f$0;
                try {
                    alertDialogArr2[0].dismiss();
                    break;
                } catch (Throwable unused2) {
                }
                alertDialogArr2[0] = null;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda337(this.f$0, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda337(this.f$0, 5));
                break;
            case 4:
                this.f$0[0].dismiss();
                break;
            case 5:
                this.f$0[0].dismiss();
                break;
            case 6:
                AlertDialog alertDialog = this.f$0[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                break;
            case 7:
                AlertDialog[] alertDialogArr3 = this.f$0;
                try {
                    alertDialogArr3[0].dismiss();
                    break;
                } catch (Throwable unused3) {
                }
                alertDialogArr3[0] = null;
                break;
            default:
                AlertDialog[] alertDialogArr4 = this.f$0;
                try {
                    alertDialogArr4[0].dismiss();
                    break;
                } catch (Throwable unused4) {
                }
                alertDialogArr4[0] = null;
                break;
        }
    }
}
