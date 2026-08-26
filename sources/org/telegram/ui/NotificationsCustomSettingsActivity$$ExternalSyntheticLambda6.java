package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6 implements AlertDialog.OnButtonClickListener, ProfileNotificationsActivity.ProfileNotificationsActivityDelegate {
    public final NotificationsCustomSettingsActivity f$0;

    public NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f$0 = notificationsCustomSettingsActivity;
    }

    @Override
    public void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException) {
        this.f$0.lambda$createView$7(notificationException);
    }

    @Override
    public void didRemoveException(long j) {
        ProfileNotificationsActivity.ProfileNotificationsActivityDelegate.CC.$default$didRemoveException(this, j);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$createView$9(alertDialog, i);
    }
}
