package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20999a;
    public final ConnectionsManager f21000b;
    public final int f21001c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20999a = i11;
        this.f21000b = connectionsManager;
        this.f21001c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20999a) {
            case 0:
                this.f21000b.lambda$failNotRunningRequest$1(this.f21001c);
                return;
            default:
                this.f21000b.lambda$cancelRequestsForGuid$11(this.f21001c);
                return;
        }
    }
}
