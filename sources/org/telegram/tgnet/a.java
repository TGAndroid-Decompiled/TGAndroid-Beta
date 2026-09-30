package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f18493a;
    public final ConnectionsManager f18494b;
    public final int f18495c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f18493a = i11;
        this.f18494b = connectionsManager;
        this.f18495c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18493a) {
            case 0:
                this.f18494b.lambda$failNotRunningRequest$1(this.f18495c);
                return;
            default:
                this.f18494b.lambda$cancelRequestsForGuid$11(this.f18495c);
                return;
        }
    }
}
