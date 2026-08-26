package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ManageLinksActivity$$ExternalSyntheticLambda5 implements RequestDelegate {
    public final int $r8$classId;
    public final ManageLinksActivity f$0;

    public ManageLinksActivity$$ExternalSyntheticLambda5(ManageLinksActivity manageLinksActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = manageLinksActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadLinks$2(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$createView$7(tLObject, tL_error);
                break;
        }
    }
}
