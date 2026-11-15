package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f28209a;
    public final ConnectionsManager f28210b;
    public final int f28211c;

    public a(ConnectionsManager connectionsManager, int i7, int i10) {
        this.f28209a = i10;
        this.f28210b = connectionsManager;
        this.f28211c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28209a) {
            case 0:
                ConnectionsManager.D(this.f28210b, this.f28211c);
                return;
            default:
                ConnectionsManager.l(this.f28210b, this.f28211c);
                return;
        }
    }
}
