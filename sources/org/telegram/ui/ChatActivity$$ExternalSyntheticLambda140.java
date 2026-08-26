package org.telegram.ui;

import org.telegram.ui.ActionBar.BaseFragment;

public final class ChatActivity$$ExternalSyntheticLambda140 implements Runnable {
    public final int $r8$classId;
    public final BaseFragment f$0;
    public final long f$1;
    public final long f$2;

    public ChatActivity$$ExternalSyntheticLambda140(BaseFragment baseFragment, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
        this.f$1 = j;
        this.f$2 = j2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$processNewMessages$202(this.f$1, this.f$2);
                break;
            case 1:
                ((ChatActivity) this.f$0).lambda$updateTopPanel$242(this.f$1, this.f$2);
                break;
            default:
                ((ChatEditActivity) this.f$0).lambda$createView$48(this.f$1, this.f$2);
                break;
        }
    }
}
