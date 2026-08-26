package org.telegram.ui;

import android.content.DialogInterface;

public final class SettingsActivity$$ExternalSyntheticLambda4 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;

    public SettingsActivity$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                SettingsActivity.lambda$createView$2(dialogInterface);
                break;
            case 1:
                AccountFrozenAlert.shown = false;
                break;
            default:
                GroupCallActivity.lambda$processSelectedOption$73(dialogInterface);
                break;
        }
    }
}
