package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;

public final class DialogsActivity$$ExternalSyntheticLambda99 implements DialogInterface.OnClickListener {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;

    public DialogsActivity$$ExternalSyntheticLambda99(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((DialogsActivity) this.f$0).lambda$onArchiveLongPress$93(dialogInterface, i);
                break;
            case 1:
                ((LoginActivity.PhoneView) this.f$0).lambda$showDebugMenu$0(dialogInterface, i);
                break;
            case 2:
                ((PassportActivity) this.f$0).lambda$createIdentityInterface$50(dialogInterface, i);
                break;
            default:
                ((SettingsActivity) this.f$0).lambda$openDebugMenu$21(dialogInterface, i);
                break;
        }
    }
}
