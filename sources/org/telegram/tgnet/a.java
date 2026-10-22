package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20435a;
    public final ConnectionsManager f20436b;
    public final int f20437c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20435a = i11;
        this.f20436b = connectionsManager;
        this.f20437c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20435a) {
            case 0:
                this.f20436b.lambda$failNotRunningRequest$1(this.f20437c);
                return;
            default:
                this.f20436b.lambda$cancelRequestsForGuid$11(this.f20437c);
                return;
        }
    }
}
