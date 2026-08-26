package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.ActionBar.AlertDialog;

public final class AlertsCreator$$ExternalSyntheticLambda100 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Activity f$0;

    public AlertsCreator$$ExternalSyntheticLambda100(Activity activity, int i) {
        this.$r8$classId = i;
        this.f$0 = activity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createBackgroundLocationPermissionDialog$209(this.f$0, alertDialog, i);
                break;
            case 1:
                PermissionRequest.lambda$ensureAllPermissions$2(this.f$0, alertDialog, i);
                break;
            default:
                PermissionRequest.lambda$ensureEitherPermission$0(this.f$0, alertDialog, i);
                break;
        }
    }
}
