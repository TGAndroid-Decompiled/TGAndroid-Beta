package org.telegram.ui;

import org.telegram.messenger.PasskeysController;
import org.telegram.tgnet.ConnectionsManager;

public final class GroupCallSheet$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final int f$0;
    public final int f$1;

    public GroupCallSheet$$ExternalSyntheticLambda1(int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = i;
        this.f$1 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ConnectionsManager.getInstance(this.f$0).cancelRequest(this.f$1, true);
                break;
            case 1:
                PasskeysController.lambda$login$11(this.f$0, this.f$1);
                break;
            case 2:
                ConnectionsManager.lambda$onConnectionStateChanged$15(this.f$0, this.f$1);
                break;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$18(this.f$0, this.f$1);
                break;
        }
    }
}
