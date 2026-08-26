package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ManageLinksActivity$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final ManageLinksActivity f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;
    public final TLRPC.TL_chatInviteExported f$3;

    public ManageLinksActivity$$ExternalSyntheticLambda15(ManageLinksActivity manageLinksActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i) {
        this.$r8$classId = i;
        this.f$0 = manageLinksActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = tL_chatInviteExported;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$revokeLink$15(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$revokePermanent$11(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
