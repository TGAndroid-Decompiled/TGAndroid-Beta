package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f22548a;
    public final ConnectionsManager f22549b;
    public final int f22550c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f22548a = i11;
        this.f22549b = connectionsManager;
        this.f22550c = i10;
    }

    @Override
    public final void run() {
        switch (this.f22548a) {
            case 0:
                this.f22549b.lambda$failNotRunningRequest$1(this.f22550c);
                return;
            default:
                this.f22549b.lambda$cancelRequestsForGuid$11(this.f22550c);
                return;
        }
    }
}
