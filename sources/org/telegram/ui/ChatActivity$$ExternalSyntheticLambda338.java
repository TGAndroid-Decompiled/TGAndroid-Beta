package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatActivity$$ExternalSyntheticLambda338 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final AlertDialog[] f$1;
    public final int f$2;

    public ChatActivity$$ExternalSyntheticLambda338(ChatActivity chatActivity, AlertDialog[] alertDialogArr, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatActivity;
        this.f$1 = alertDialogArr;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                final ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                AlertDialog[] alertDialogArr = this.f$1;
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    final int i = this.f$2;
                    final int i2 = 1;
                    alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i2) {
                                case 0:
                                    chatActivity.getConnectionsManager().cancelRequest(i, true);
                                    break;
                                case 1:
                                    chatActivity.getConnectionsManager().cancelRequest(i, true);
                                    break;
                                default:
                                    chatActivity.getConnectionsManager().cancelRequest(i, true);
                                    break;
                            }
                        }
                    });
                    chatActivity.showDialog(alertDialogArr[0]);
                    break;
                }
                break;
            case 1:
                final ChatActivity chatActivity2 = this.f$0;
                chatActivity2.getClass();
                AlertDialog[] alertDialogArr2 = this.f$1;
                AlertDialog alertDialog2 = alertDialogArr2[0];
                if (alertDialog2 != null) {
                    final int i3 = this.f$2;
                    final int i4 = 0;
                    alertDialog2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i4) {
                                case 0:
                                    chatActivity2.getConnectionsManager().cancelRequest(i3, true);
                                    break;
                                case 1:
                                    chatActivity2.getConnectionsManager().cancelRequest(i3, true);
                                    break;
                                default:
                                    chatActivity2.getConnectionsManager().cancelRequest(i3, true);
                                    break;
                            }
                        }
                    });
                    chatActivity2.showDialog(alertDialogArr2[0]);
                    break;
                }
                break;
            default:
                final ChatActivity chatActivity3 = this.f$0;
                chatActivity3.getClass();
                AlertDialog[] alertDialogArr3 = this.f$1;
                AlertDialog alertDialog3 = alertDialogArr3[0];
                if (alertDialog3 != null) {
                    final int i5 = this.f$2;
                    final int i6 = 2;
                    alertDialog3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i6) {
                                case 0:
                                    chatActivity3.getConnectionsManager().cancelRequest(i5, true);
                                    break;
                                case 1:
                                    chatActivity3.getConnectionsManager().cancelRequest(i5, true);
                                    break;
                                default:
                                    chatActivity3.getConnectionsManager().cancelRequest(i5, true);
                                    break;
                            }
                        }
                    });
                    chatActivity3.showDialog(alertDialogArr3[0]);
                    break;
                }
                break;
        }
    }
}
