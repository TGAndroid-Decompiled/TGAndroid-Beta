package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f18265a;
    public final ConnectionsManager f18266b;
    public final int f18267c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f18265a = i11;
        this.f18266b = connectionsManager;
        this.f18267c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18265a) {
            case 0:
                this.f18266b.lambda$failNotRunningRequest$1(this.f18267c);
                return;
            default:
                this.f18266b.lambda$cancelRequestsForGuid$11(this.f18267c);
                return;
        }
    }
}
