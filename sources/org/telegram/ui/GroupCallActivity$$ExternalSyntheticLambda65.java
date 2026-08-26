package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class GroupCallActivity$$ExternalSyntheticLambda65 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final GroupCallActivity f$0;

    public GroupCallActivity$$ExternalSyntheticLambda65(GroupCallActivity groupCallActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.$r8$classId) {
            case 0:
                GroupCallActivity groupCallActivity = this.f$0;
                if (updates != null) {
                    groupCallActivity.accountInstance.getMessagesController().processUpdates(updates, false);
                } else {
                    groupCallActivity.getClass();
                }
                AndroidUtilities.runOnUIThread(new GroupCallActivity$$ExternalSyntheticLambda8(groupCallActivity, 10));
                break;
            default:
                GroupCallActivity groupCallActivity2 = this.f$0;
                if (updates == null) {
                    groupCallActivity2.getClass();
                } else {
                    groupCallActivity2.accountInstance.getMessagesController().processUpdates(updates, false);
                }
                break;
        }
    }
}
