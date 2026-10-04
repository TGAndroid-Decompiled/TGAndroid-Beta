package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f20193a;
    public final ConnectionsManager f20194b;
    public final int f20195c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f20193a = i11;
        this.f20194b = connectionsManager;
        this.f20195c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20193a) {
            case 0:
                this.f20194b.lambda$failNotRunningRequest$1(this.f20195c);
                return;
            default:
                this.f20194b.lambda$cancelRequestsForGuid$11(this.f20195c);
                return;
        }
    }
}
