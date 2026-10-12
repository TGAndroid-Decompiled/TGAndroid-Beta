package org.telegram.ui.Components;
public final class et implements Runnable {
    public final int f25784a;
    public final kt f25785b;

    public et(kt ktVar, int i10) {
        this.f25784a = i10;
        this.f25785b = ktVar;
    }

    @Override
    public final void run() {
        switch (this.f25784a) {
            case 0:
                this.f25785b.W(false);
                return;
            default:
                this.f25785b.N(true);
                return;
        }
    }
}
