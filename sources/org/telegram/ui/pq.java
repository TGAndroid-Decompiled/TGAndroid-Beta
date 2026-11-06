package org.telegram.ui;
public final class pq implements Runnable {
    public final int f48905a;
    public final qq f48906b;

    public pq(qq qqVar, int i7) {
        this.f48905a = i7;
        this.f48906b = qqVar;
    }

    @Override
    public final void run() {
        switch (this.f48905a) {
            case 0:
                fi.w3 w3Var = this.f48906b.f35844a;
                if (w3Var != null) {
                    w3Var.f36781f3.O(true);
                    return;
                }
                return;
            default:
                fi.w3 w3Var2 = this.f48906b.f35844a;
                if (w3Var2 != null) {
                    w3Var2.f36781f3.O(true);
                    return;
                }
                return;
        }
    }
}
