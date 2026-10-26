package org.telegram.ui.Components;
public final class ls implements Runnable {
    public final int f30282a;
    public final rs f30283b;

    public ls(rs rsVar, int i10) {
        this.f30282a = i10;
        this.f30283b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f30282a) {
            case 0:
                this.f30283b.W(false);
                return;
            default:
                rs.Q(this.f30283b);
                return;
        }
    }
}
