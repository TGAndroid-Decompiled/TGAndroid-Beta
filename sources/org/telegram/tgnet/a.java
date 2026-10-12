package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f19958a;
    public final ConnectionsManager f19959b;
    public final int f19960c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f19958a = i11;
        this.f19959b = connectionsManager;
        this.f19960c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19958a) {
            case 0:
                this.f19959b.lambda$failNotRunningRequest$1(this.f19960c);
                return;
            default:
                this.f19959b.lambda$cancelRequestsForGuid$11(this.f19960c);
                return;
        }
    }
}
