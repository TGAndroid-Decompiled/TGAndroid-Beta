package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.AlertDialog;

public final class SharedMediaLayout$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final AlertDialog[] f$0;
    public final int f$1;
    public final int f$2;

    public SharedMediaLayout$$ExternalSyntheticLambda8(AlertDialog[] alertDialogArr, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = alertDialogArr;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SharedMediaLayout.lambda$new$19(this.f$0, this.f$1, this.f$2);
                break;
            default:
                SharedMediaLayout.lambda$new$25(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
