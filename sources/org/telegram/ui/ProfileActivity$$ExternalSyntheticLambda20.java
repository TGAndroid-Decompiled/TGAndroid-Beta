package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ProfileActivity$$ExternalSyntheticLambda20 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final ProfileActivity f$0;
    public final TLRPC.UserFull f$1;

    public ProfileActivity$$ExternalSyntheticLambda20(ProfileActivity profileActivity, TLRPC.UserFull userFull, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
        this.f$1 = userFull;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$editRow$154(this.f$1, alertDialog, i);
                break;
            default:
                this.f$0.lambda$editRow$148(this.f$1, alertDialog, i);
                break;
        }
    }
}
