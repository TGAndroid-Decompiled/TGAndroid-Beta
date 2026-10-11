package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20188a;
    public final ConnectionsManager f20189b;
    public final int f20190c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20188a = i11;
        this.f20189b = connectionsManager;
        this.f20190c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20188a) {
            case 0:
                this.f20189b.lambda$failNotRunningRequest$1(this.f20190c);
                return;
            default:
                this.f20189b.lambda$cancelRequestsForGuid$11(this.f20190c);
                return;
        }
    }
}
