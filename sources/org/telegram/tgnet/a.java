package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f19372a;
    public final ConnectionsManager f19373b;
    public final int f19374c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f19372a = i11;
        this.f19373b = connectionsManager;
        this.f19374c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19372a) {
            case 0:
                this.f19373b.lambda$failNotRunningRequest$1(this.f19374c);
                return;
            default:
                this.f19373b.lambda$cancelRequestsForGuid$11(this.f19374c);
                return;
        }
    }
}
