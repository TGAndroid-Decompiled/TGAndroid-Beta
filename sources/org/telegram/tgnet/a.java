package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f18508a;
    public final ConnectionsManager f18509b;
    public final int f18510c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f18508a = i11;
        this.f18509b = connectionsManager;
        this.f18510c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18508a) {
            case 0:
                this.f18509b.lambda$failNotRunningRequest$1(this.f18510c);
                return;
            default:
                this.f18509b.lambda$cancelRequestsForGuid$11(this.f18510c);
                return;
        }
    }
}
