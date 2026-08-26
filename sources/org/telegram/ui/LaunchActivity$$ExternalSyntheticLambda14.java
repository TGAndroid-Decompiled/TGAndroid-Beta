package org.telegram.ui;

import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LaunchActivity$$ExternalSyntheticLambda14 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public LaunchActivity$$ExternalSyntheticLambda14(LaunchActivity launchActivity, int i, Browser.Progress progress) {
        this.f$0 = launchActivity;
        this.f$1 = i;
        this.f$2 = progress;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((LaunchActivity) this.f$0).lambda$checkAppUpdate$139(this.f$1, (Browser.Progress) this.f$2, tLObject, tL_error);
                break;
            default:
                ((ProfileActivity) this.f$0).lambda$getChannelParticipants$88((TLRPC.TL_channels_getParticipants) this.f$2, this.f$1, tLObject, tL_error);
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda14(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i) {
        this.f$0 = profileActivity;
        this.f$2 = tL_channels_getParticipants;
        this.f$1 = i;
    }
}
