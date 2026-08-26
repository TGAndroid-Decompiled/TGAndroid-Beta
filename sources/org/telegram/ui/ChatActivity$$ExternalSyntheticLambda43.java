package org.telegram.ui;

import org.telegram.ui.ActionBar.BaseFragment;

public final class ChatActivity$$ExternalSyntheticLambda43 implements Runnable {
    public final int $r8$classId;
    public final BaseFragment f$0;
    public final boolean f$1;
    public final int f$2;

    public ChatActivity$$ExternalSyntheticLambda43(BaseFragment baseFragment, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseFragment;
        this.f$1 = z;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$updateMessagesVisiblePart$157(this.f$1, this.f$2);
                break;
            default:
                ((FilterCreateActivity) this.f$0).lambda$onUpdate$29(this.f$1, this.f$2);
                break;
        }
    }
}
