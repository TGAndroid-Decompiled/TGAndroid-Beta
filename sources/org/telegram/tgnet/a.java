package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f22183a;
    public final ConnectionsManager f22184b;
    public final int f22185c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f22183a = i11;
        this.f22184b = connectionsManager;
        this.f22185c = i10;
    }

    @Override
    public final void run() {
        switch (this.f22183a) {
            case 0:
                this.f22184b.lambda$failNotRunningRequest$1(this.f22185c);
                return;
            default:
                this.f22184b.lambda$cancelRequestsForGuid$11(this.f22185c);
                return;
        }
    }
}
