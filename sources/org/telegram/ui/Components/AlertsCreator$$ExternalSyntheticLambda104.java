package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class AlertsCreator$$ExternalSyntheticLambda104 implements Runnable {
    public final int $r8$classId;
    public final EditTextBoldCursor f$0;
    public final AlertDialog f$1;
    public final BaseFragment f$2;

    public AlertsCreator$$ExternalSyntheticLambda104(EditTextBoldCursor editTextBoldCursor, AlertDialog alertDialog, BaseFragment baseFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = editTextBoldCursor;
        this.f$1 = alertDialog;
        this.f$2 = baseFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new AlertsCreator$$ExternalSyntheticLambda104(this.f$0, this.f$1, this.f$2, 1));
                break;
            default:
                AlertsCreator.processCreate(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
