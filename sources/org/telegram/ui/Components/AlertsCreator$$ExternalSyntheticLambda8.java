package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog;

public final class AlertsCreator$$ExternalSyntheticLambda8 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Context f$0;

    public AlertsCreator$$ExternalSyntheticLambda8(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createBackgroundActivityDialog$1(this.f$0, alertDialog, i);
                break;
            case 1:
                AlertsCreator.lambda$createApkRestrictedDialog$6(this.f$0, alertDialog, i);
                break;
            case 2:
                AlertsCreator.lambda$createLocationRequiredDialog$0(this.f$0, alertDialog, i);
                break;
            case 3:
                AlertsCreator.lambda$showUpdateAppAlert$9(this.f$0, alertDialog, i);
                break;
            default:
                AlertsCreator.lambda$createDrawOverlayGroupCallPermissionDialog$212(this.f$0, alertDialog, i);
                break;
        }
    }
}
