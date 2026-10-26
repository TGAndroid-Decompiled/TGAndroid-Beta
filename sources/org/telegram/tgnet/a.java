package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f22185a;
    public final ConnectionsManager f22186b;
    public final int f22187c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f22185a = i11;
        this.f22186b = connectionsManager;
        this.f22187c = i10;
    }

    @Override
    public final void run() {
        switch (this.f22185a) {
            case 0:
                this.f22186b.lambda$failNotRunningRequest$1(this.f22187c);
                return;
            default:
                this.f22186b.lambda$cancelRequestsForGuid$11(this.f22187c);
                return;
        }
    }
}
