package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class LaunchActivity$$ExternalSyntheticLambda66 implements Utilities.Callback {
    public final int $r8$classId;
    public final LaunchActivity f$0;

    public LaunchActivity$$ExternalSyntheticLambda66(LaunchActivity launchActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onPowerSaver(((Boolean) obj).booleanValue());
                break;
            default:
                this.f$0.lambda$processAttachedMenuBotFromShortcut$121((TLRPC.User) obj);
                break;
        }
    }
}
