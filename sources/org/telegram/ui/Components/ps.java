package org.telegram.ui.Components;
public final class ps implements Runnable {
    public final int f29938a;
    public final vs f29939b;

    public ps(vs vsVar, int i10) {
        this.f29938a = i10;
        this.f29939b = vsVar;
    }

    @Override
    public final void run() {
        switch (this.f29938a) {
            case 0:
                this.f29939b.X(false);
                return;
            default:
                vs.R(this.f29939b);
                return;
        }
    }
}
