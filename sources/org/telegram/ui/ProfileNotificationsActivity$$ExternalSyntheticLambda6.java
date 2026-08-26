package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class ProfileNotificationsActivity$$ExternalSyntheticLambda6 implements AlertDialog.OnButtonClickListener {
    public final ProfileNotificationsActivity f$0;
    public final String f$1;

    public ProfileNotificationsActivity$$ExternalSyntheticLambda6(ProfileNotificationsActivity profileNotificationsActivity, String str) {
        this.f$0 = profileNotificationsActivity;
        this.f$1 = str;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$createView$0(this.f$1);
    }
}
