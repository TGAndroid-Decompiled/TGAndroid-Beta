package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class GroupCallActivity$$ExternalSyntheticLambda59 implements RequestDelegate {
    public final int $r8$classId;
    public final GroupCallActivity f$0;

    public GroupCallActivity$$ExternalSyntheticLambda59(GroupCallActivity groupCallActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$13(tLObject);
                break;
            default:
                this.f$0.lambda$new$11(tLObject);
                break;
        }
    }
}
