package org.telegram.ui.Components;
public final class dp0 implements Runnable {
    public final int f33177a;
    public final rr0 f33178b;
    public final int f33179c;

    public dp0(rr0 rr0Var, int i3, int i10) {
        this.f33177a = i10;
        this.f33178b = rr0Var;
        this.f33179c = i3;
    }

    @Override
    public final void run() {
        switch (this.f33177a) {
            case 0:
                this.f33178b.h.scrollBy(0, this.f33179c);
                return;
            case 1:
                this.f33178b.h.scrollBy(0, this.f33179c);
                return;
            default:
                this.f33178b.h.scrollBy(0, this.f33179c);
                return;
        }
    }
}
