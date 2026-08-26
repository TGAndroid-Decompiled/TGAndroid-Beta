package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LaunchActivity$$ExternalSyntheticLambda177 implements RequestDelegate {
    public final int $r8$classId;
    public final int f$0;

    public LaunchActivity$$ExternalSyntheticLambda177(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity.lambda$runLinkRequest$68(this.f$0, tLObject, tL_error);
                break;
            default:
                LaunchActivity.lambda$runLinkRequest$65(this.f$0, tLObject, tL_error);
                break;
        }
    }
}
