package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f27110a;
    public final ConnectionsManager f27111b;
    public final int f27112c;

    public a(ConnectionsManager connectionsManager, int i7, int i10) {
        this.f27110a = i10;
        this.f27111b = connectionsManager;
        this.f27112c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27110a) {
            case 0:
                ConnectionsManager.D(this.f27111b, this.f27112c);
                return;
            default:
                ConnectionsManager.l(this.f27111b, this.f27112c);
                return;
        }
    }
}
