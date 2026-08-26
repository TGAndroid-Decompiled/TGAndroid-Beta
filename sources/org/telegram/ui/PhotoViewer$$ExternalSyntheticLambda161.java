package org.telegram.ui;

import android.content.DialogInterface;

public final class PhotoViewer$$ExternalSyntheticLambda161 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Runnable f$0;

    public PhotoViewer$$ExternalSyntheticLambda161(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run();
                break;
            case 1:
                Runnable runnable = this.f$0;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                Runnable runnable2 = this.f$0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
        }
    }
}
