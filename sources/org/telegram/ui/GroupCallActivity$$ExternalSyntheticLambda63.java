package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class GroupCallActivity$$ExternalSyntheticLambda63 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final GroupCallActivity f$0;

    public GroupCallActivity$$ExternalSyntheticLambda63(GroupCallActivity groupCallActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setCommentsEnabled$79(updates, tL_error);
                break;
            default:
                this.f$0.lambda$toggleAdminSpeak$77(updates, tL_error);
                break;
        }
    }
}
