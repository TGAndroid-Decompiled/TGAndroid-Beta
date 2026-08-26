package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ProfileActivity$$ExternalSyntheticLambda26 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Utilities.Callback f$0;

    public ProfileActivity$$ExternalSyntheticLambda26(int i, Utilities.Callback callback) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity.lambda$onMemberClick$62(this.f$0, alertDialog, i);
                break;
            default:
                ChatUsersActivity.lambda$createMenuForParticipant$12(this.f$0, alertDialog, i);
                break;
        }
    }
}
