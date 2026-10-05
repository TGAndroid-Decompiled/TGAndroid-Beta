package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20203a;
    public final ConnectionsManager f20204b;
    public final int f20205c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20203a = i11;
        this.f20204b = connectionsManager;
        this.f20205c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20203a) {
            case 0:
                this.f20204b.lambda$failNotRunningRequest$1(this.f20205c);
                return;
            default:
                this.f20204b.lambda$cancelRequestsForGuid$11(this.f20205c);
                return;
        }
    }
}
