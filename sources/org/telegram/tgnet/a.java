package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20052a;
    public final ConnectionsManager f20053b;
    public final int f20054c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20052a = i11;
        this.f20053b = connectionsManager;
        this.f20054c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20052a) {
            case 0:
                this.f20053b.lambda$failNotRunningRequest$1(this.f20054c);
                return;
            default:
                this.f20053b.lambda$cancelRequestsForGuid$11(this.f20054c);
                return;
        }
    }
}
