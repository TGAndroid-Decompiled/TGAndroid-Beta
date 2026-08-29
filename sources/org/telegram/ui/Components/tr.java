package org.telegram.ui.Components;
public final class tr implements Runnable {
    public final int f33029a;
    public final as f33030b;

    public tr(as asVar, int i10) {
        this.f33029a = i10;
        this.f33030b = asVar;
    }

    @Override
    public final void run() {
        switch (this.f33029a) {
            case 0:
                this.f33030b.W(false);
                return;
            default:
                as.Q(this.f33030b);
                return;
        }
    }
}
