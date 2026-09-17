package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20025a;
    public final ConnectionsManager f20026b;
    public final int f20027c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20025a = i11;
        this.f20026b = connectionsManager;
        this.f20027c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20025a) {
            case 0:
                this.f20026b.lambda$failNotRunningRequest$1(this.f20027c);
                return;
            default:
                this.f20026b.lambda$cancelRequestsForGuid$11(this.f20027c);
                return;
        }
    }
}
