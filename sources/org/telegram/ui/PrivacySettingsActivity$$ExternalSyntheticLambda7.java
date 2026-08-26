package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class PrivacySettingsActivity$$ExternalSyntheticLambda7 implements AlertDialog.OnButtonClickListener, SessionsActivity.Delegate {
    public final int $r8$classId;
    public final PrivacySettingsActivity f$0;

    public PrivacySettingsActivity$$ExternalSyntheticLambda7(PrivacySettingsActivity privacySettingsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = privacySettingsActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$8(alertDialog, i);
                break;
            case 1:
                this.f$0.lambda$createView$18(alertDialog, i);
                break;
            case 2:
                this.f$0.lambda$createView$17(alertDialog, i);
                break;
            default:
                this.f$0.lambda$createView$10(alertDialog, i);
                break;
        }
    }

    @Override
    public void sessionsLoaded() {
        switch (this.$r8$classId) {
            case 3:
                this.f$0.lambda$onFragmentCreate$0();
                break;
            default:
                this.f$0.lambda$onFragmentCreate$1();
                break;
        }
    }
}
