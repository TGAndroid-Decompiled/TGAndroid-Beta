package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f28589a;
    public final ConnectionsManager f28590b;
    public final int f28591c;

    public a(ConnectionsManager connectionsManager, int i7, int i10) {
        this.f28589a = i10;
        this.f28590b = connectionsManager;
        this.f28591c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28589a) {
            case 0:
                ConnectionsManager.D(this.f28590b, this.f28591c);
                return;
            default:
                ConnectionsManager.l(this.f28590b, this.f28591c);
                return;
        }
    }
}
