package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f18492a;
    public final ConnectionsManager f18493b;
    public final int f18494c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f18492a = i11;
        this.f18493b = connectionsManager;
        this.f18494c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18492a) {
            case 0:
                this.f18493b.lambda$failNotRunningRequest$1(this.f18494c);
                return;
            default:
                this.f18493b.lambda$cancelRequestsForGuid$11(this.f18494c);
                return;
        }
    }
}
