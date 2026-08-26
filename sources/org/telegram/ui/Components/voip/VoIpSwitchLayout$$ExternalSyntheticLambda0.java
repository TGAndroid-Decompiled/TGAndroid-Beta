package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;

public final class VoIpSwitchLayout$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final VoIpSwitchLayout f$0;
    public final int f$1;

    public VoIpSwitchLayout$$ExternalSyntheticLambda0(VoIpSwitchLayout voIpSwitchLayout, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = voIpSwitchLayout;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                VoIpSwitchLayout voIpSwitchLayout = this.f$0;
                voIpSwitchLayout.getClass();
                AndroidUtilities.runOnUIThread(new VoIpSwitchLayout$$ExternalSyntheticLambda0(voIpSwitchLayout, this.f$1, 2));
                break;
            case 1:
                VoIpSwitchLayout voIpSwitchLayout2 = this.f$0;
                voIpSwitchLayout2.getClass();
                AndroidUtilities.runOnUIThread(new VoIpSwitchLayout$$ExternalSyntheticLambda0(voIpSwitchLayout2, this.f$1, 3));
                break;
            case 2:
                this.f$0.attachSpeakerToBt(this.f$1);
                break;
            default:
                this.f$0.attachBtToSpeaker(this.f$1);
                break;
        }
    }
}
