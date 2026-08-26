package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog;

public final class SharedMediaLayout$$ExternalSyntheticLambda50 implements Runnable {
    public final int $r8$classId;
    public final AlertDialog[] f$0;
    public final int f$1;
    public final int f$2;

    public SharedMediaLayout$$ExternalSyntheticLambda50(AlertDialog[] alertDialogArr, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = alertDialogArr;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertDialog[] alertDialogArr = this.f$0;
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    final int i = this.f$1;
                    final int i2 = this.f$2;
                    final int i3 = 0;
                    alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i3) {
                                case 0:
                                    ConnectionsManager.getInstance(i).cancelRequest(i2, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i).cancelRequest(i2, true);
                                    break;
                            }
                        }
                    });
                    alertDialogArr[0].show();
                    break;
                }
                break;
            default:
                AlertDialog[] alertDialogArr2 = this.f$0;
                AlertDialog alertDialog2 = alertDialogArr2[0];
                if (alertDialog2 != null) {
                    final int i4 = this.f$1;
                    final int i5 = this.f$2;
                    final int i6 = 1;
                    alertDialog2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i6) {
                                case 0:
                                    ConnectionsManager.getInstance(i4).cancelRequest(i5, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i4).cancelRequest(i5, true);
                                    break;
                            }
                        }
                    });
                    alertDialogArr2[0].show();
                    break;
                }
                break;
        }
    }
}
