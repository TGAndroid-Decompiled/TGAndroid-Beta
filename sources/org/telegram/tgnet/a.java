package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f18484a;
    public final ConnectionsManager f18485b;
    public final int f18486c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f18484a = i11;
        this.f18485b = connectionsManager;
        this.f18486c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18484a) {
            case 0:
                this.f18485b.lambda$failNotRunningRequest$1(this.f18486c);
                return;
            default:
                this.f18485b.lambda$cancelRequestsForGuid$11(this.f18486c);
                return;
        }
    }
}
