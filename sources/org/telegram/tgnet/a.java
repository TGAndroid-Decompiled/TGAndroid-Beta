package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f18499a;
    public final ConnectionsManager f18500b;
    public final int f18501c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f18499a = i11;
        this.f18500b = connectionsManager;
        this.f18501c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18499a) {
            case 0:
                this.f18500b.lambda$failNotRunningRequest$1(this.f18501c);
                return;
            default:
                this.f18500b.lambda$cancelRequestsForGuid$11(this.f18501c);
                return;
        }
    }
}
