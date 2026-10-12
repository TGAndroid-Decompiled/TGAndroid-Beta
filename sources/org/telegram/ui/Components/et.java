package org.telegram.ui.Components;
public final class et implements Runnable {
    public final int f25784a;
    public final lt f25785b;

    public et(lt ltVar, int i10) {
        this.f25784a = i10;
        this.f25785b = ltVar;
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
