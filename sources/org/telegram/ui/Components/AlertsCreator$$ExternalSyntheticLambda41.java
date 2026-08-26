package org.telegram.ui.Components;

import android.content.DialogInterface;

public final class AlertsCreator$$ExternalSyntheticLambda41 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Runnable f$0;
    public final boolean[] f$1;

    public AlertsCreator$$ExternalSyntheticLambda41(int i, Runnable runnable, boolean[] zArr) {
        this.$r8$classId = i;
        this.f$0 = runnable;
        this.f$1 = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createPollCloseDatePickerDialog$170(this.f$0, this.f$1, dialogInterface);
                break;
            case 1:
                AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$257(this.f$0, this.f$1, dialogInterface);
                break;
            case 2:
                AlertsCreator.lambda$createScheduleDatePickerDialog$130(this.f$0, this.f$1, dialogInterface);
                break;
            default:
                AlertsCreator.lambda$createFormattedDatePickerDialog$163(this.f$0, this.f$1, dialogInterface);
                break;
        }
    }
}
