package org.telegram.ui.Components;
public final class zr0 implements Runnable {
    public final int f33325a;
    public final qu0 f33326b;
    public final int f33327c;

    public zr0(qu0 qu0Var, int i10, int i11) {
        this.f33325a = i11;
        this.f33326b = qu0Var;
        this.f33327c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33325a) {
            case 0:
                this.f33326b.h.scrollBy(0, this.f33327c);
                return;
            default:
                this.f33326b.h.scrollBy(0, this.f33327c);
                return;
        }
    }
}
