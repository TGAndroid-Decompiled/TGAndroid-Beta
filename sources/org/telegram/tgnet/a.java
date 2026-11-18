package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f28561a;
    public final ConnectionsManager f28562b;
    public final int f28563c;

    public a(ConnectionsManager connectionsManager, int i7, int i10) {
        this.f28561a = i10;
        this.f28562b = connectionsManager;
        this.f28563c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28561a) {
            case 0:
                ConnectionsManager.D(this.f28562b, this.f28563c);
                return;
            default:
                ConnectionsManager.l(this.f28562b, this.f28563c);
                return;
        }
    }
}
