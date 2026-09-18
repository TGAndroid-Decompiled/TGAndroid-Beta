package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f18452a;
    public final ConnectionsManager f18453b;
    public final int f18454c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f18452a = i11;
        this.f18453b = connectionsManager;
        this.f18454c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18452a) {
            case 0:
                this.f18453b.lambda$failNotRunningRequest$1(this.f18454c);
                return;
            default:
                this.f18453b.lambda$cancelRequestsForGuid$11(this.f18454c);
                return;
        }
    }
}
