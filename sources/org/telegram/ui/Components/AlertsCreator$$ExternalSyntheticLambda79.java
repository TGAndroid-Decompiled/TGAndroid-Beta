package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.LaunchActivity;

public final class AlertsCreator$$ExternalSyntheticLambda79 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final LaunchActivity f$0;

    public AlertsCreator$$ExternalSyntheticLambda79(LaunchActivity launchActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createLanguageAlert$10(this.f$0, alertDialog, i);
                break;
            default:
                AlertsCreator.lambda$createFreeSpaceDialog$215(this.f$0, alertDialog, i);
                break;
        }
    }
}
