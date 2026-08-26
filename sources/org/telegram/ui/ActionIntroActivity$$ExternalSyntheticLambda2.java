package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class ActionIntroActivity$$ExternalSyntheticLambda2 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final ActionIntroActivity f$0;

    public ActionIntroActivity$$ExternalSyntheticLambda2(ActionIntroActivity actionIntroActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = actionIntroActivity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onRequestPermissionsResultFragment$6(alertDialog, i);
                break;
            default:
                this.f$0.lambda$createView$1(alertDialog, i);
                break;
        }
    }
}
