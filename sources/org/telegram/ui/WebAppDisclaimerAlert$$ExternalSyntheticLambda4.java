package org.telegram.ui;

import android.content.DialogInterface;

public final class WebAppDisclaimerAlert$$ExternalSyntheticLambda4 implements DialogInterface.OnDismissListener {
    public final int $r8$classId = 1;
    public final boolean[] f$0;
    public final Runnable f$1;

    public WebAppDisclaimerAlert$$ExternalSyntheticLambda4(Runnable runnable, boolean[] zArr) {
        this.f$1 = runnable;
        this.f$0 = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                boolean[] zArr = this.f$0;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable = this.f$1;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                break;
            default:
                Runnable runnable2 = this.f$1;
                if (runnable2 != null && this.f$0[0]) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }

    public WebAppDisclaimerAlert$$ExternalSyntheticLambda4(boolean[] zArr, Runnable runnable) {
        this.f$0 = zArr;
        this.f$1 = runnable;
    }
}
