package org.telegram.ui.Components;

import android.content.DialogInterface;

public final class AlertsCreator$$ExternalSyntheticLambda18 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final boolean[] f$1;

    public AlertsCreator$$ExternalSyntheticLambda18(int i, Runnable runnable, boolean[] zArr) {
        this.$r8$classId = i;
        this.f$1 = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        boolean[] zArr = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                if (zArr[0]) {
                    EditTextCaption.lambda$makeSelectedDate$1();
                }
                break;
            default:
                if (zArr[0]) {
                    int i = ChatAttachAlertPollLayout.$r8$clinit;
                }
                break;
        }
    }
}
