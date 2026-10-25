package org.telegram.ui.Components;
public final class ls implements Runnable {
    public final int f30280a;
    public final rs f30281b;

    public ls(rs rsVar, int i10) {
        this.f30280a = i10;
        this.f30281b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f30280a) {
            case 0:
                this.f30281b.W(false);
                return;
            default:
                rs.Q(this.f30281b);
                return;
        }
    }
}
