package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ManageLinksActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final ManageLinksActivity f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;

    public ManageLinksActivity$$ExternalSyntheticLambda7(ManageLinksActivity manageLinksActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = manageLinksActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ManageLinksActivity manageLinksActivity = this.f$0;
                manageLinksActivity.getNotificationCenter().doOnIdle(new ManageLinksActivity$$ExternalSyntheticLambda7(manageLinksActivity, this.f$1, this.f$2, 1));
                break;
            default:
                this.f$0.lambda$loadLinks$0(this.f$2, this.f$1);
                break;
        }
    }
}
