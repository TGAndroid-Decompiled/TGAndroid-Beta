package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class PrivacyControlActivity$$ExternalSyntheticLambda1 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final PrivacyControlActivity f$0;

    public PrivacyControlActivity$$ExternalSyntheticLambda1(PrivacyControlActivity privacyControlActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = privacyControlActivity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.processDone$9();
                break;
            case 1:
                this.f$0.lambda$finished$12(alertDialog, i);
                break;
            default:
                this.f$0.lambda$checkDiscard$28(alertDialog, i);
                break;
        }
    }
}
