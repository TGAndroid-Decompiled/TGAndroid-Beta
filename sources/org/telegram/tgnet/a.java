package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f19072a;
    public final ConnectionsManager f19073b;
    public final int f19074c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f19072a = i11;
        this.f19073b = connectionsManager;
        this.f19074c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19072a) {
            case 0:
                this.f19073b.lambda$failNotRunningRequest$1(this.f19074c);
                return;
            default:
                this.f19073b.lambda$cancelRequestsForGuid$11(this.f19074c);
                return;
        }
    }
}
