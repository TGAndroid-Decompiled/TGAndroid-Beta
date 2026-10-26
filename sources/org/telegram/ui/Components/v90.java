package org.telegram.ui.Components;
public final class v90 implements Runnable {
    public final int f33603a;
    public final w90 f33604b;
    public final aa0 f33605c;

    public v90(w90 w90Var, aa0 aa0Var, int i10) {
        this.f33603a = i10;
        this.f33604b = w90Var;
        this.f33605c = aa0Var;
    }

    @Override
    public final void run() {
        switch (this.f33603a) {
            case 0:
                this.f33604b.k(this.f33605c, false);
                return;
            default:
                this.f33604b.k(this.f33605c, false);
                return;
        }
    }
}
