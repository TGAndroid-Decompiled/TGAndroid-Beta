package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20428a;
    public final ConnectionsManager f20429b;
    public final int f20430c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20428a = i11;
        this.f20429b = connectionsManager;
        this.f20430c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20428a) {
            case 0:
                this.f20429b.lambda$failNotRunningRequest$1(this.f20430c);
                return;
            default:
                this.f20429b.lambda$cancelRequestsForGuid$11(this.f20430c);
                return;
        }
    }
}
