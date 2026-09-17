package org.telegram.ui.Components;
public final class yr implements Runnable {
    public final int f33019a;
    public final es f33020b;

    public yr(es esVar, int i10) {
        this.f33019a = i10;
        this.f33020b = esVar;
    }

    @Override
    public final void run() {
        switch (this.f33019a) {
            case 0:
                this.f33020b.W(false);
                return;
            default:
                es.Q(this.f33020b);
                return;
        }
    }
}
