package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f19315a;
    public final ConnectionsManager f19316b;
    public final int f19317c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f19315a = i11;
        this.f19316b = connectionsManager;
        this.f19317c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19315a) {
            case 0:
                this.f19316b.lambda$failNotRunningRequest$1(this.f19317c);
                return;
            default:
                this.f19316b.lambda$cancelRequestsForGuid$11(this.f19317c);
                return;
        }
    }
}
