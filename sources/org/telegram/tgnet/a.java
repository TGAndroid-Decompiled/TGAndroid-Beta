package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f28650a;
    public final ConnectionsManager f28651b;
    public final int f28652c;

    public a(ConnectionsManager connectionsManager, int i7, int i10) {
        this.f28650a = i10;
        this.f28651b = connectionsManager;
        this.f28652c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28650a) {
            case 0:
                ConnectionsManager.D(this.f28651b, this.f28652c);
                return;
            default:
                ConnectionsManager.l(this.f28651b, this.f28652c);
                return;
        }
    }
}
