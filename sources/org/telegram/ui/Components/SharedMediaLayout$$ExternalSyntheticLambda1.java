package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.AlertDialog;

public final class SharedMediaLayout$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final AlertDialog[] f$0;

    public SharedMediaLayout$$ExternalSyntheticLambda1(AlertDialog[] alertDialogArr, int i) {
        this.$r8$classId = i;
        this.f$0 = alertDialogArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SharedMediaLayout.lambda$new$21(this.f$0);
                break;
            case 1:
                DialogsBotsAdapter.lambda$new$1(this.f$0);
                break;
            default:
                SharedMediaLayout.lambda$new$17(this.f$0);
                break;
        }
    }
}
