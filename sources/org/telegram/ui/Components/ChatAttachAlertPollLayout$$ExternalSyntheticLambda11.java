package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public final class ChatAttachAlertPollLayout$$ExternalSyntheticLambda11 implements Utilities.Callback {
    public final int $r8$classId;
    public final ChatAttachAlert.AttachAlertLayout f$0;
    public final int f$1;

    public ChatAttachAlertPollLayout$$ExternalSyntheticLambda11(ChatAttachAlert.AttachAlertLayout attachAlertLayout, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = attachAlertLayout;
        this.f$1 = i;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatAttachAlertPollLayout) this.f$0).lambda$openAttachMenuForOptions$23(this.f$1, (PollAttachedMedia) obj);
                break;
            case 1:
                ((ChatAttachAlertPollLayout) this.f$0).lambda$openEditOrReplaceMenu$17(this.f$1, (String) obj);
                break;
            default:
                ((ChatAttachAlertLocationLayout) this.f$0).lambda$openShareLiveLocation$20(this.f$1, (Long) obj);
                break;
        }
    }
}
