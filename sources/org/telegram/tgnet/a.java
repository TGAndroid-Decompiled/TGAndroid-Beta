package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f18239a;
    public final ConnectionsManager f18240b;
    public final int f18241c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f18239a = i11;
        this.f18240b = connectionsManager;
        this.f18241c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18239a) {
            case 0:
                this.f18240b.lambda$failNotRunningRequest$1(this.f18241c);
                return;
            default:
                this.f18240b.lambda$cancelRequestsForGuid$11(this.f18241c);
                return;
        }
    }
}
