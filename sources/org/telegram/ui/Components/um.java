package org.telegram.ui.Components;
public final class um implements Runnable {
    public final int f28901a;
    public final wn f28902b;
    public final int f28903c;

    public um(wn wnVar, int i10, int i11) {
        this.f28901a = i11;
        this.f28902b = wnVar;
        this.f28903c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28901a) {
            case 0:
                this.f28902b.e0(this.f28903c, null);
                return;
            case 1:
                this.f28902b.b0(this.f28903c);
                return;
            default:
                this.f28902b.e0(this.f28903c, null);
                return;
        }
    }
}
