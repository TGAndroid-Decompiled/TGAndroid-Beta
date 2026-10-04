package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20198a;
    public final ConnectionsManager f20199b;
    public final int f20200c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20198a = i11;
        this.f20199b = connectionsManager;
        this.f20200c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20198a) {
            case 0:
                this.f20199b.lambda$failNotRunningRequest$1(this.f20200c);
                return;
            default:
                this.f20199b.lambda$cancelRequestsForGuid$11(this.f20200c);
                return;
        }
    }
}
