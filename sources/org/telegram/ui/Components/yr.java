package org.telegram.ui.Components;
public final class yr implements Runnable {
    public final int f32992a;
    public final es f32993b;

    public yr(es esVar, int i10) {
        this.f32992a = i10;
        this.f32993b = esVar;
    }

    @Override
    public final void run() {
        switch (this.f32992a) {
            case 0:
                this.f32993b.W(false);
                return;
            default:
                es.Q(this.f32993b);
                return;
        }
    }
}
