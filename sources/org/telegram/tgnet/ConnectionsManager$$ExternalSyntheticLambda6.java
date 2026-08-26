package org.telegram.tgnet;

public final class ConnectionsManager$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final ConnectionsManager f$0;
    public final int f$1;

    public ConnectionsManager$$ExternalSyntheticLambda6(ConnectionsManager connectionsManager, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = connectionsManager;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$cancelRequestsForGuid$11(this.f$1);
                break;
            default:
                this.f$0.lambda$failNotRunningRequest$1(this.f$1);
                break;
        }
    }
}
