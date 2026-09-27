package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f18485a;
    public final ConnectionsManager f18486b;
    public final int f18487c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f18485a = i11;
        this.f18486b = connectionsManager;
        this.f18487c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18485a) {
            case 0:
                this.f18486b.lambda$failNotRunningRequest$1(this.f18487c);
                return;
            default:
                this.f18486b.lambda$cancelRequestsForGuid$11(this.f18487c);
                return;
        }
    }
}
