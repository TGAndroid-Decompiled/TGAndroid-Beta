package org.telegram.tgnet;
public final class a implements Runnable {
    public final int f19952a;
    public final ConnectionsManager f19953b;
    public final int f19954c;

    public a(ConnectionsManager connectionsManager, int i10, int i11) {
        this.f19952a = i11;
        this.f19953b = connectionsManager;
        this.f19954c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19952a) {
            case 0:
                ConnectionsManager.C(this.f19953b, this.f19954c);
                return;
            default:
                ConnectionsManager.k(this.f19953b, this.f19954c);
                return;
        }
    }
}
