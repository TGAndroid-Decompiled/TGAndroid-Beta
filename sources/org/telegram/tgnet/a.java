package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f19959a;
    public final ConnectionsManager f19960b;
    public final int f19961c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f19959a = i11;
        this.f19960b = connectionsManager;
        this.f19961c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19959a) {
            case 0:
                this.f19960b.lambda$failNotRunningRequest$1(this.f19961c);
                return;
            default:
                this.f19960b.lambda$cancelRequestsForGuid$11(this.f19961c);
                return;
        }
    }
}
