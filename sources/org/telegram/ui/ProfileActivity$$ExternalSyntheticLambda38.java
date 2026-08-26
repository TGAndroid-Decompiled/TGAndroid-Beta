package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ProfileActivity$$ExternalSyntheticLambda38 implements Runnable {
    public final int $r8$classId;
    public final ProfileActivity f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;
    public final TLRPC.TL_channels_getParticipants f$3;

    public ProfileActivity$$ExternalSyntheticLambda38(int i, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, TLRPC.TL_error tL_error, ProfileActivity profileActivity) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = tL_channels_getParticipants;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getChannelParticipants$86(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$getChannelParticipants$87(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
