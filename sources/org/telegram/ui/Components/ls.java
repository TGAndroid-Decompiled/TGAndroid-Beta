package org.telegram.ui.Components;
public final class ls implements Runnable {
    public final int f30296a;
    public final rs f30297b;

    public ls(rs rsVar, int i10) {
        this.f30296a = i10;
        this.f30297b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f30296a) {
            case 0:
                this.f30297b.W(false);
                return;
            default:
                rs.Q(this.f30297b);
                return;
        }
    }
}
