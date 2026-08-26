package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class SessionsActivity$$ExternalSyntheticLambda4 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final SessionsActivity f$0;

    public SessionsActivity$$ExternalSyntheticLambda4(SessionsActivity sessionsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = sessionsActivity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$12(alertDialog, i);
                break;
            default:
                this.f$0.lambda$onRequestPermissionsResultFragment$27(alertDialog, i);
                break;
        }
    }
}
