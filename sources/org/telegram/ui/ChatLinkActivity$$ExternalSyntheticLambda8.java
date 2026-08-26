package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatLinkActivity$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final ChatLinkActivity f$0;
    public final AlertDialog[] f$1;
    public final int f$2;

    public ChatLinkActivity$$ExternalSyntheticLambda8(ChatLinkActivity chatLinkActivity, AlertDialog[] alertDialogArr, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatLinkActivity;
        this.f$1 = alertDialogArr;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                final ChatLinkActivity chatLinkActivity = this.f$0;
                chatLinkActivity.getClass();
                AlertDialog[] alertDialogArr = this.f$1;
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    final int i = this.f$2;
                    final int i2 = 0;
                    alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i2) {
                                case 0:
                                    chatLinkActivity.lambda$linkChat$14(i);
                                    break;
                                default:
                                    chatLinkActivity.lambda$createView$3(i);
                                    break;
                            }
                        }
                    });
                    chatLinkActivity.showDialog(alertDialogArr[0]);
                    break;
                }
                break;
            default:
                final ChatLinkActivity chatLinkActivity2 = this.f$0;
                AlertDialog[] alertDialogArr2 = this.f$1;
                AlertDialog alertDialog2 = alertDialogArr2[0];
                if (alertDialog2 != null) {
                    final int i3 = this.f$2;
                    final int i4 = 1;
                    alertDialog2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i4) {
                                case 0:
                                    chatLinkActivity2.lambda$linkChat$14(i3);
                                    break;
                                default:
                                    chatLinkActivity2.lambda$createView$3(i3);
                                    break;
                            }
                        }
                    });
                    chatLinkActivity2.showDialog(alertDialogArr2[0]);
                    break;
                }
                break;
        }
    }
}
