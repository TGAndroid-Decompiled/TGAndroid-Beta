package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20224a;
    public final ConnectionsManager f20225b;
    public final int f20226c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20224a = i11;
        this.f20225b = connectionsManager;
        this.f20226c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20224a) {
            case 0:
                this.f20225b.lambda$failNotRunningRequest$1(this.f20226c);
                return;
            default:
                this.f20225b.lambda$cancelRequestsForGuid$11(this.f20226c);
                return;
        }
    }
}
