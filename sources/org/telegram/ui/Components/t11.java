package org.telegram.ui.Components;
public final class t11 implements Runnable {
    public final int f29249a;
    public final w11 f29250b;
    public final v11 f29251c;

    public t11(w11 w11Var, v11 v11Var, int i10) {
        this.f29249a = i10;
        this.f29250b = w11Var;
        this.f29251c = v11Var;
    }

    @Override
    public final void run() {
        switch (this.f29249a) {
            case 0:
                this.f29250b.b(this.f29251c);
                return;
            case 1:
                this.f29250b.b(this.f29251c);
                return;
            default:
                this.f29250b.b(this.f29251c);
                return;
        }
    }
}
