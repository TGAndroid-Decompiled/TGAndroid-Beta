package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f27118a;
    public final ConnectionsManager f27119b;
    public final int f27120c;

    public a(ConnectionsManager connectionsManager, int i7, int i10) {
        this.f27118a = i10;
        this.f27119b = connectionsManager;
        this.f27120c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27118a) {
            case 0:
                ConnectionsManager.D(this.f27119b, this.f27120c);
                return;
            default:
                ConnectionsManager.l(this.f27119b, this.f27120c);
                return;
        }
    }
}
