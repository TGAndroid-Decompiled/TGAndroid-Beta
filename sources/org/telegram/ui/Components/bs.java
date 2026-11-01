package org.telegram.ui.Components;
public final class bs implements Runnable {
    public final int f24913a;
    public final gs f24914b;

    public bs(gs gsVar, int i10) {
        this.f24913a = i10;
        this.f24914b = gsVar;
    }

    @Override
    public final void run() {
        switch (this.f24913a) {
            case 0:
                this.f24914b.X(false);
                return;
            default:
                this.f24914b.O(true);
                return;
        }
    }
}
