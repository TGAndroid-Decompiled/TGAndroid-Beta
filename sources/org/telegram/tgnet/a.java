package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f18268a;
    public final ConnectionsManager f18269b;
    public final int f18270c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f18268a = i11;
        this.f18269b = connectionsManager;
        this.f18270c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18268a) {
            case 0:
                this.f18269b.lambda$failNotRunningRequest$1(this.f18270c);
                return;
            default:
                this.f18269b.lambda$cancelRequestsForGuid$11(this.f18270c);
                return;
        }
    }
}
