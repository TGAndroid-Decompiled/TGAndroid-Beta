package org.telegram.ui.Components;
public final class op0 implements Runnable {
    public final int f38149a;
    public final bs0 f38150b;
    public final int f38151c;

    public op0(bs0 bs0Var, int i7, int i10) {
        this.f38149a = i10;
        this.f38150b = bs0Var;
        this.f38151c = i7;
    }

    @Override
    public final void run() {
        switch (this.f38149a) {
            case 0:
                this.f38150b.h.scrollBy(0, this.f38151c);
                return;
            case 1:
                this.f38150b.h.scrollBy(0, this.f38151c);
                return;
            default:
                this.f38150b.h.scrollBy(0, this.f38151c);
                return;
        }
    }
}
