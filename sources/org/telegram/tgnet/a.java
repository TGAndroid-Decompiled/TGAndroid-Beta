package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f28563a;
    public final ConnectionsManager f28564b;
    public final int f28565c;

    public a(ConnectionsManager connectionsManager, int i7, int i10) {
        this.f28563a = i10;
        this.f28564b = connectionsManager;
        this.f28565c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28563a) {
            case 0:
                ConnectionsManager.D(this.f28564b, this.f28565c);
                return;
            default:
                ConnectionsManager.l(this.f28564b, this.f28565c);
                return;
        }
    }
}
