package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f27114a;
    public final ConnectionsManager f27115b;
    public final int f27116c;

    public a(ConnectionsManager connectionsManager, int i7, int i10) {
        this.f27114a = i10;
        this.f27115b = connectionsManager;
        this.f27116c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27114a) {
            case 0:
                ConnectionsManager.D(this.f27115b, this.f27116c);
                return;
            default:
                ConnectionsManager.l(this.f27115b, this.f27116c);
                return;
        }
    }
}
