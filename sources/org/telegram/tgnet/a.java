package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20499a;
    public final ConnectionsManager f20500b;
    public final int f20501c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20499a = i11;
        this.f20500b = connectionsManager;
        this.f20501c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20499a) {
            case 0:
                this.f20500b.lambda$failNotRunningRequest$1(this.f20501c);
                return;
            default:
                this.f20500b.lambda$cancelRequestsForGuid$11(this.f20501c);
                return;
        }
    }
}
