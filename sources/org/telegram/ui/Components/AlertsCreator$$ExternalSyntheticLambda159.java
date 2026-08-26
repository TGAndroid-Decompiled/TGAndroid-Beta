package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class AlertsCreator$$ExternalSyntheticLambda159 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final BaseFragment f$0;

    public AlertsCreator$$ExternalSyntheticLambda159(BaseFragment baseFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.performAskAQuestion(this.f$0);
                break;
            default:
                AlertsCreator.lambda$showAddUserAlert$201(this.f$0, alertDialog, i);
                break;
        }
    }
}
