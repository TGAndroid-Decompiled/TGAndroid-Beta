package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ManageLinksActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ManageLinksActivity f$0;
    public final TLRPC.TL_chatInviteExported f$1;
    public final TLRPC.TL_error f$2;
    public final TLObject f$3;
    public final boolean f$4;

    public ManageLinksActivity$$ExternalSyntheticLambda0(ManageLinksActivity manageLinksActivity, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = manageLinksActivity;
        this.f$1 = tL_chatInviteExported;
        this.f$2 = tL_error;
        this.f$3 = tLObject;
        this.f$4 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadLinks$4(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                this.f$0.lambda$loadLinks$3(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
        }
    }
}
