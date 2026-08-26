package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class JoinToSendSettingsView$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final JoinToSendSettingsView f$0;
    public final boolean f$1;

    public JoinToSendSettingsView$$ExternalSyntheticLambda4(JoinToSendSettingsView joinToSendSettingsView, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = joinToSendSettingsView;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new JoinToSendSettingsView$$ExternalSyntheticLambda4(this.f$0, this.f$1, 1));
                break;
            default:
                this.f$0.setJoinRequest(this.f$1);
                break;
        }
    }
}
