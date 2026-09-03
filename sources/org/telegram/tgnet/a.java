package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f21001a;
    public final ConnectionsManager f21002b;
    public final int f21003c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f21001a = i11;
        this.f21002b = connectionsManager;
        this.f21003c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21001a) {
            case 0:
                this.f21002b.lambda$failNotRunningRequest$1(this.f21003c);
                return;
            default:
                this.f21002b.lambda$cancelRequestsForGuid$11(this.f21003c);
                return;
        }
    }
}
