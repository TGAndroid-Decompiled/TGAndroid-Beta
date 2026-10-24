package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20500a;
    public final ConnectionsManager f20501b;
    public final int f20502c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20500a = i11;
        this.f20501b = connectionsManager;
        this.f20502c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20500a) {
            case 0:
                this.f20501b.lambda$failNotRunningRequest$1(this.f20502c);
                return;
            default:
                this.f20501b.lambda$cancelRequestsForGuid$11(this.f20502c);
                return;
        }
    }
}
