package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f27111a;
    public final ConnectionsManager f27112b;
    public final int f27113c;

    public a(ConnectionsManager connectionsManager, int i7, int i10) {
        this.f27111a = i10;
        this.f27112b = connectionsManager;
        this.f27113c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27111a) {
            case 0:
                ConnectionsManager.D(this.f27112b, this.f27113c);
                return;
            default:
                ConnectionsManager.l(this.f27112b, this.f27113c);
                return;
        }
    }
}
