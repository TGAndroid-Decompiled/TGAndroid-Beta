package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ProfileActivity$6$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final long f$1;
    public final Object f$2;
    public final Object f$3;
    public final boolean f$4;
    public final Object f$5;

    public ProfileActivity$6$$ExternalSyntheticLambda12(long j, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, DialogsActivity dialogsActivity, ProfileActivity.AnonymousClass6 anonymousClass6, boolean z) {
        this.f$0 = anonymousClass6;
        this.f$1 = j;
        this.f$2 = tL_chatAdminRights;
        this.f$3 = str;
        this.f$4 = z;
        this.f$5 = dialogsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ProfileActivity.AnonymousClass6) this.f$0).lambda$onItemClick$4(this.f$1, (TLRPC.TL_chatAdminRights) this.f$2, (String) this.f$3, this.f$4, (DialogsActivity) this.f$5);
                break;
            default:
                ((GroupCallActivity) this.f$0).lambda$inviteUserToCall$62((AlertDialog[]) this.f$2, this.f$4, (TLRPC.TL_error) this.f$3, this.f$1, (TL_phone.inviteToGroupCall) this.f$5);
                break;
        }
    }

    public ProfileActivity$6$$ExternalSyntheticLambda12(GroupCallActivity groupCallActivity, AlertDialog[] alertDialogArr, boolean z, TLRPC.TL_error tL_error, long j, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.f$0 = groupCallActivity;
        this.f$2 = alertDialogArr;
        this.f$4 = z;
        this.f$3 = tL_error;
        this.f$1 = j;
        this.f$5 = invitetogroupcall;
    }
}
