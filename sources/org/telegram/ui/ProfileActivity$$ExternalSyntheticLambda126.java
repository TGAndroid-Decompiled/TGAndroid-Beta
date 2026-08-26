package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ProfileActivity$$ExternalSyntheticLambda126 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final ProfileActivity f$0;
    public final TLRPC.UserFull f$1;
    public final int f$2;

    public ProfileActivity$$ExternalSyntheticLambda126(ProfileActivity profileActivity, TLRPC.UserFull userFull, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = profileActivity;
        this.f$1 = userFull;
        this.f$2 = i;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$editRow$131(this.f$1, this.f$2, alertDialog, i);
                break;
            default:
                this.f$0.lambda$editRow$136(this.f$1, this.f$2, alertDialog, i);
                break;
        }
    }
}
