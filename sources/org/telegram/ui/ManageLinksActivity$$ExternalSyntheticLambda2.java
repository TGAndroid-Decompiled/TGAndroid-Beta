package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ManageLinksActivity$$ExternalSyntheticLambda2 implements RequestDelegate {
    public final int $r8$classId;
    public final ManageLinksActivity f$0;
    public final TLRPC.TL_chatInviteExported f$1;

    public ManageLinksActivity$$ExternalSyntheticLambda2(ManageLinksActivity manageLinksActivity, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i) {
        this.$r8$classId = i;
        this.f$0 = manageLinksActivity;
        this.f$1 = tL_chatInviteExported;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$deleteLink$14(this.f$1, tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$revokeLink$16(this.f$1, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$revokePermanent$12(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
