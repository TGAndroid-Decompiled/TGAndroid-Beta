package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class ChatActivity$$ExternalSyntheticLambda498 implements Runnable {
    public final int $r8$classId;
    public final Utilities.Callback2 f$0;

    public ChatActivity$$ExternalSyntheticLambda498(int i, Utilities.Callback2 callback2) {
        this.$r8$classId = i;
        this.f$0 = callback2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.lambda$requestLinkPreview$141(this.f$0);
                break;
            default:
                CacheControlActivity.lambda$getDeviceTotalSize$3(this.f$0);
                break;
        }
    }
}
