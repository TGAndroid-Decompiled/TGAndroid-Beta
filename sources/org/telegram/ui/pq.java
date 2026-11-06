package org.telegram.ui;
public final class pq implements Runnable {
    public final int f48904a;
    public final qq f48905b;

    public pq(qq qqVar, int i7) {
        this.f48904a = i7;
        this.f48905b = qqVar;
    }

    @Override
    public final void run() {
        switch (this.f48904a) {
            case 0:
                fi.w3 w3Var = this.f48905b.f36227a;
                if (w3Var != null) {
                    w3Var.f37160f3.O(true);
                    return;
                }
                return;
            default:
                fi.w3 w3Var2 = this.f48905b.f36227a;
                if (w3Var2 != null) {
                    w3Var2.f37160f3.O(true);
                    return;
                }
                return;
        }
    }
}
