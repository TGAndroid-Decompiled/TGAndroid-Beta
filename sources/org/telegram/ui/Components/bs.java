package org.telegram.ui.Components;
public final class bs implements Runnable {
    public final int f24872a;
    public final gs f24873b;

    public bs(gs gsVar, int i10) {
        this.f24872a = i10;
        this.f24873b = gsVar;
    }

    @Override
    public final void run() {
        switch (this.f24872a) {
            case 0:
                this.f24873b.X(false);
                return;
            default:
                this.f24873b.O(true);
                return;
        }
    }
}
