package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.AlertDialog;

public final class AlertsCreator$$ExternalSyntheticLambda257 implements Runnable {
    public final int $r8$classId;
    public final AlertDialog f$0;

    public AlertsCreator$$ExternalSyntheticLambda257(AlertDialog alertDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = alertDialog;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$performAskAQuestion$49(this.f$0);
                break;
            default:
                this.f$0.dismiss();
                break;
        }
    }
}
