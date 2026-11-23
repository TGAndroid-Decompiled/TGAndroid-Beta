package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f28592a;
    public final ConnectionsManager f28593b;
    public final int f28594c;

    public a(ConnectionsManager connectionsManager, int i7, int i10) {
        this.f28592a = i10;
        this.f28593b = connectionsManager;
        this.f28594c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28592a) {
            case 0:
                ConnectionsManager.D(this.f28593b, this.f28594c);
                return;
            default:
                ConnectionsManager.l(this.f28593b, this.f28594c);
                return;
        }
    }
}
