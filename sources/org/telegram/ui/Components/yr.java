package org.telegram.ui.Components;
public final class yr implements Runnable {
    public final int f32991a;
    public final es f32992b;

    public yr(es esVar, int i10) {
        this.f32991a = i10;
        this.f32992b = esVar;
    }

    @Override
    public final void run() {
        switch (this.f32991a) {
            case 0:
                this.f32992b.W(false);
                return;
            default:
                es.Q(this.f32992b);
                return;
        }
    }
}
