package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f17351a;
    public final ConnectionsManager f17352b;
    public final int f17353c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f17351a = i11;
        this.f17352b = connectionsManager;
        this.f17353c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17351a) {
            case 0:
                this.f17352b.lambda$failNotRunningRequest$1(this.f17353c);
                return;
            default:
                this.f17352b.lambda$cancelRequestsForGuid$11(this.f17353c);
                return;
        }
    }
}
