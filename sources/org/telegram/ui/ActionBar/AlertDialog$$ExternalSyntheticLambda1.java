package org.telegram.ui.ActionBar;

public final class AlertDialog$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final AlertDialog f$0;

    public AlertDialog$$ExternalSyntheticLambda1(AlertDialog alertDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = alertDialog;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.dismiss();
                break;
            default:
                AlertDialog alertDialog = this.f$0;
                if (!alertDialog.isShowing()) {
                    try {
                        alertDialog.show();
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
        }
    }
}
