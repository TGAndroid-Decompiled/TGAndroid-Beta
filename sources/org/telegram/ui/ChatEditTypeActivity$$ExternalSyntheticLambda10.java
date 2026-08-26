package org.telegram.ui;

import org.telegram.tgnet.TLObject;

public final class ChatEditTypeActivity$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final ChatEditTypeActivity f$0;
    public final TLObject f$1;

    public ChatEditTypeActivity$$ExternalSyntheticLambda10(ChatEditTypeActivity chatEditTypeActivity, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditTypeActivity;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$tryDeactivateAllLinks$14(this.f$1);
                break;
            default:
                this.f$0.lambda$loadAdminedChannels$21(this.f$1);
                break;
        }
    }
}
