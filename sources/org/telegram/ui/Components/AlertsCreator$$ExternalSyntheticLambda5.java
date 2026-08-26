package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class AlertsCreator$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final EditTextBoldCursor f$0;
    public final AlertDialog f$1;
    public final BaseFragment f$2;

    public AlertsCreator$$ExternalSyntheticLambda5(EditTextBoldCursor editTextBoldCursor, AlertDialog alertDialog, BaseFragment baseFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = editTextBoldCursor;
        this.f$1 = alertDialog;
        this.f$2 = baseFragment;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createThemeCreateDialog$242(this.f$0, this.f$1, this.f$2);
                break;
            default:
                AlertsCreator.processCreate(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
