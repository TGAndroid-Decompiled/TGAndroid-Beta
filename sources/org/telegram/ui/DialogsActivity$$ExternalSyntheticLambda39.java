package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.PermissionRequest;

public final class DialogsActivity$$ExternalSyntheticLambda39 implements Utilities.Callback {
    public final int $r8$classId;
    public final Activity f$0;

    public DialogsActivity$$ExternalSyntheticLambda39(Activity activity, int i) {
        this.$r8$classId = i;
        this.f$0 = activity;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.$r8$classId) {
            case 0:
                if (bool.booleanValue()) {
                    if (!PermissionRequest.canAskPermission()) {
                        PermissionRequest.showPermissionSettings();
                    } else {
                        this.f$0.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    }
                    break;
                }
                break;
            default:
                if (bool.booleanValue()) {
                    if (!PermissionRequest.canAskPermission()) {
                        PermissionRequest.showPermissionSettings();
                    } else {
                        this.f$0.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    }
                    break;
                }
                break;
        }
    }
}
