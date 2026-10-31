package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f19951a;
    public final ConnectionsManager f19952b;
    public final int f19953c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f19951a = i11;
        this.f19952b = connectionsManager;
        this.f19953c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19951a) {
            case 0:
                ConnectionsManager.C(this.f19952b, this.f19953c);
                return;
            default:
                ConnectionsManager.k(this.f19952b, this.f19953c);
                return;
        }
    }
}
