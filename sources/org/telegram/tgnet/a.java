package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f19340a;
    public final ConnectionsManager f19341b;
    public final int f19342c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f19340a = i11;
        this.f19341b = connectionsManager;
        this.f19342c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19340a) {
            case 0:
                this.f19341b.lambda$failNotRunningRequest$1(this.f19342c);
                return;
            default:
                this.f19341b.lambda$cancelRequestsForGuid$11(this.f19342c);
                return;
        }
    }
}
