package org.telegram.ui;
public final class pq implements Runnable {
    public final int f48911a;
    public final qq f48912b;

    public pq(qq qqVar, int i7) {
        this.f48911a = i7;
        this.f48912b = qqVar;
    }

    @Override
    public final void run() {
        switch (this.f48911a) {
            case 0:
                fi.w3 w3Var = this.f48912b.f34211a;
                if (w3Var != null) {
                    w3Var.f35167f3.O(true);
                    return;
                }
                return;
            default:
                fi.w3 w3Var2 = this.f48912b.f34211a;
                if (w3Var2 != null) {
                    w3Var2.f35167f3.O(true);
                    return;
                }
                return;
        }
    }
}
