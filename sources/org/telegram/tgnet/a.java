package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f18477a;
    public final ConnectionsManager f18478b;
    public final int f18479c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f18477a = i11;
        this.f18478b = connectionsManager;
        this.f18479c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18477a) {
            case 0:
                this.f18478b.lambda$failNotRunningRequest$1(this.f18479c);
                return;
            default:
                this.f18478b.lambda$cancelRequestsForGuid$11(this.f18479c);
                return;
        }
    }
}
