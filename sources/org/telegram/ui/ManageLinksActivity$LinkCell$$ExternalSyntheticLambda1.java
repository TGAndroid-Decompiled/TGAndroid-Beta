package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ManageLinksActivity$LinkCell$$ExternalSyntheticLambda1 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final ManageLinksActivity.LinkCell f$0;
    public final TLRPC.TL_chatInviteExported f$1;

    public ManageLinksActivity$LinkCell$$ExternalSyntheticLambda1(ManageLinksActivity.LinkCell linkCell, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i) {
        this.$r8$classId = i;
        this.f$0 = linkCell;
        this.f$1 = tL_chatInviteExported;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$5(this.f$1, alertDialog, i);
                break;
            default:
                this.f$0.lambda$new$0(this.f$1, alertDialog, i);
                break;
        }
    }
}
