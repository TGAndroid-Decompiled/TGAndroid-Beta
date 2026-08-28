package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f22536a;
    public final ConnectionsManager f22537b;
    public final int f22538c;

    public a(ConnectionsManager connectionsManager, int i9, int i10) {
        this.f22536a = i10;
        this.f22537b = connectionsManager;
        this.f22538c = i9;
    }

    @Override
    public final void run() {
        switch (this.f22536a) {
            case 0:
                this.f22537b.lambda$failNotRunningRequest$1(this.f22538c);
                return;
            default:
                this.f22537b.lambda$cancelRequestsForGuid$11(this.f22538c);
                return;
        }
    }
}
