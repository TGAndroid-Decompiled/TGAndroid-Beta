package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20194a;
    public final ConnectionsManager f20195b;
    public final int f20196c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20194a = i11;
        this.f20195b = connectionsManager;
        this.f20196c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20194a) {
            case 0:
                this.f20195b.lambda$failNotRunningRequest$1(this.f20196c);
                return;
            default:
                this.f20195b.lambda$cancelRequestsForGuid$11(this.f20196c);
                return;
        }
    }
}
