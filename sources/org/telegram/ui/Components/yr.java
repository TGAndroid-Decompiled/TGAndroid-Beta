package org.telegram.ui.Components;
public final class yr implements Runnable {
    public final int f33018a;
    public final es f33019b;

    public yr(es esVar, int i10) {
        this.f33018a = i10;
        this.f33019b = esVar;
    }

    @Override
    public final void run() {
        switch (this.f33018a) {
            case 0:
                this.f33019b.W(false);
                return;
            default:
                es.Q(this.f33019b);
                return;
        }
    }
}
