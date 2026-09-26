package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f18491a;
    public final ConnectionsManager f18492b;
    public final int f18493c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f18491a = i11;
        this.f18492b = connectionsManager;
        this.f18493c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18491a) {
            case 0:
                this.f18492b.lambda$failNotRunningRequest$1(this.f18493c);
                return;
            default:
                this.f18492b.lambda$cancelRequestsForGuid$11(this.f18493c);
                return;
        }
    }
}
