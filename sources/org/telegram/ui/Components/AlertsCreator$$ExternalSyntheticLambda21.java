package org.telegram.ui.Components;

import android.view.View;

public final class AlertsCreator$$ExternalSyntheticLambda21 implements View.OnClickListener {
    public final int $r8$classId;
    public final boolean[] f$0;

    public AlertsCreator$$ExternalSyntheticLambda21(boolean[] zArr, int i) {
        this.$r8$classId = i;
        this.f$0 = zArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createDeleteMessagesAlert$233(this.f$0, view);
                break;
            case 1:
                AlertsCreator.lambda$createClearOrDeleteDialogAlert$69(this.f$0, view);
                break;
            case 2:
                AlertsCreator.lambda$createClearDaysDialogAlert$83(this.f$0, view);
                break;
            case 3:
                AlertsCreator.lambda$showAlertWithCheckbox$67(this.f$0, view);
                break;
            case 4:
                AlertsCreator.lambda$createDeleteMessagesAlert$234(this.f$0, view);
                break;
            case 5:
                AlertsCreator.lambda$createClearOrDeleteDialogsAlert$81(this.f$0, view);
                break;
            case 6:
                ClearHistoryAlert.lambda$new$0(this.f$0, view);
                break;
            default:
                SharedMediaLayout.lambda$new$10(this.f$0, view);
                break;
        }
    }
}
