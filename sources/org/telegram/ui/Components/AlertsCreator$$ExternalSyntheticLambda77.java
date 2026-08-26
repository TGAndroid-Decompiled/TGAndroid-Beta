package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.ActionBar.AlertDialog;

public final class AlertsCreator$$ExternalSyntheticLambda77 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final MessagesStorage.BooleanCallback f$0;
    public final boolean[] f$1;

    public AlertsCreator$$ExternalSyntheticLambda77(MessagesStorage.BooleanCallback booleanCallback, boolean[] zArr, int i) {
        this.$r8$classId = i;
        this.f$0 = booleanCallback;
        this.f$1 = zArr;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createClearOrDeleteDialogsAlert$82(this.f$0, this.f$1, alertDialog, i);
                break;
            default:
                AlertsCreator.lambda$createClearDaysDialogAlert$84(this.f$0, this.f$1, alertDialog, i);
                break;
        }
    }
}
