package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;

public final class ProfileNotificationsActivity$$ExternalSyntheticLambda1 implements AlertDialog.OnButtonClickListener, AlertsCreator.SoundFrequencyDelegate {
    public final ProfileNotificationsActivity f$0;
    public final String f$1;

    public ProfileNotificationsActivity$$ExternalSyntheticLambda1(ProfileNotificationsActivity profileNotificationsActivity, String str) {
        this.f$0 = profileNotificationsActivity;
        this.f$1 = str;
    }

    @Override
    public void didSelectValues(int i, int i2) {
        this.f$0.lambda$createView$4(this.f$1, i, i2);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$createView$0(this.f$1, alertDialog, i);
    }
}
