package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f18277a;
    public final ConnectionsManager f18278b;
    public final int f18279c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f18277a = i11;
        this.f18278b = connectionsManager;
        this.f18279c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18277a) {
            case 0:
                this.f18278b.lambda$failNotRunningRequest$1(this.f18279c);
                return;
            default:
                this.f18278b.lambda$cancelRequestsForGuid$11(this.f18279c);
                return;
        }
    }
}
