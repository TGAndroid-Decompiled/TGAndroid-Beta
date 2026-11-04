package org.telegram.ui;
public final class oq implements Runnable {
    public final int f48329a;
    public final pq f48330b;

    public oq(pq pqVar, int i3) {
        this.f48329a = i3;
        this.f48330b = pqVar;
    }

    @Override
    public final void run() {
        switch (this.f48329a) {
            case 0:
                ai.h4 h4Var = this.f48330b.f34298a;
                if (h4Var != null) {
                    h4Var.f35594g3.O(true);
                    return;
                }
                return;
            default:
                ai.h4 h4Var2 = this.f48330b.f34298a;
                if (h4Var2 != null) {
                    h4Var2.f35594g3.O(true);
                    return;
                }
                return;
        }
    }
}
