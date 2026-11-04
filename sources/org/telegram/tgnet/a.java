package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f27159a;
    public final ConnectionsManager f27160b;
    public final int f27161c;

    public a(ConnectionsManager connectionsManager, int i3, int i10) {
        this.f27159a = i10;
        this.f27160b = connectionsManager;
        this.f27161c = i3;
    }

    @Override
    public final void run() {
        switch (this.f27159a) {
            case 0:
                ConnectionsManager.D(this.f27160b, this.f27161c);
                return;
            default:
                ConnectionsManager.l(this.f27160b, this.f27161c);
                return;
        }
    }
}
