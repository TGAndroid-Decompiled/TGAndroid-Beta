package org.telegram.ui;

import android.view.View;

public final class NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final NotificationsCustomSettingsActivity f$0;
    public final NotificationsSettingsActivity.NotificationException f$1;
    public final View f$2;

    public NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, NotificationsSettingsActivity.NotificationException notificationException, View view, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = notificationsCustomSettingsActivity;
        this.f$1 = notificationException;
        this.f$2 = view;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.updateMute(this.f$1, this.f$2, true);
                break;
            case 1:
                this.f$0.updateMute(this.f$1, this.f$2, false);
                break;
            case 2:
                this.f$0.deleteException(this.f$1, this.f$2);
                break;
            case 3:
                this.f$0.lambda$createView$4(this.f$1, this.f$2);
                break;
            case 4:
                this.f$0.lambda$createView$5(this.f$1, this.f$2);
                break;
            default:
                this.f$0.deleteException(this.f$1, this.f$2);
                break;
        }
    }

    public NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, NotificationsSettingsActivity.NotificationException notificationException, View view, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationsCustomSettingsActivity;
        this.f$1 = notificationException;
        this.f$2 = view;
    }
}
