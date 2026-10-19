package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20429a;
    public final ConnectionsManager f20430b;
    public final int f20431c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20429a = i11;
        this.f20430b = connectionsManager;
        this.f20431c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20429a) {
            case 0:
                this.f20430b.lambda$failNotRunningRequest$1(this.f20431c);
                return;
            default:
                this.f20430b.lambda$cancelRequestsForGuid$11(this.f20431c);
                return;
        }
    }
}
