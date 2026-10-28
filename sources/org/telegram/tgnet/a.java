package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f22186a;
    public final ConnectionsManager f22187b;
    public final int f22188c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f22186a = i11;
        this.f22187b = connectionsManager;
        this.f22188c = i10;
    }

    @Override
    public final void run() {
        switch (this.f22186a) {
            case 0:
                this.f22187b.lambda$failNotRunningRequest$1(this.f22188c);
                return;
            default:
                this.f22187b.lambda$cancelRequestsForGuid$11(this.f22188c);
                return;
        }
    }
}
