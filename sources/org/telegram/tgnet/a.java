package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20432a;
    public final ConnectionsManager f20433b;
    public final int f20434c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20432a = i11;
        this.f20433b = connectionsManager;
        this.f20434c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20432a) {
            case 0:
                this.f20433b.lambda$failNotRunningRequest$1(this.f20434c);
                return;
            default:
                this.f20433b.lambda$cancelRequestsForGuid$11(this.f20434c);
                return;
        }
    }
}
