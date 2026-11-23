package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f28556a;
    public final ConnectionsManager f28557b;
    public final int f28558c;

    public a(ConnectionsManager connectionsManager, int i7, int i10) {
        this.f28556a = i10;
        this.f28557b = connectionsManager;
        this.f28558c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28556a) {
            case 0:
                ConnectionsManager.D(this.f28557b, this.f28558c);
                return;
            default:
                ConnectionsManager.l(this.f28557b, this.f28558c);
                return;
        }
    }
}
