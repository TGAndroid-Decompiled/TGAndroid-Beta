package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20431a;
    public final ConnectionsManager f20432b;
    public final int f20433c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20431a = i11;
        this.f20432b = connectionsManager;
        this.f20433c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20431a) {
            case 0:
                this.f20432b.lambda$failNotRunningRequest$1(this.f20433c);
                return;
            default:
                this.f20432b.lambda$cancelRequestsForGuid$11(this.f20433c);
                return;
        }
    }
}
