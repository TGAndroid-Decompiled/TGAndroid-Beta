package org.telegram.ui;
public final class pq implements Runnable {
    public final int f48907a;
    public final qq f48908b;

    public pq(qq qqVar, int i7) {
        this.f48907a = i7;
        this.f48908b = qqVar;
    }

    @Override
    public final void run() {
        switch (this.f48907a) {
            case 0:
                fi.w3 w3Var = this.f48908b.f36243a;
                if (w3Var != null) {
                    w3Var.f37190f3.O(true);
                    return;
                }
                return;
            default:
                fi.w3 w3Var2 = this.f48908b.f36243a;
                if (w3Var2 != null) {
                    w3Var2.f37190f3.O(true);
                    return;
                }
                return;
        }
    }
}
