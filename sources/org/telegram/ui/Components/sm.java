package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f39649a;
    public final qn f39650b;
    public final int f39651c;

    public sm(qn qnVar, int i7, int i10) {
        this.f39649a = i10;
        this.f39650b = qnVar;
        this.f39651c = i7;
    }

    @Override
    public final void run() {
        switch (this.f39649a) {
            case 0:
                this.f39650b.j0(this.f39651c, null);
                return;
            case 1:
                this.f39650b.g0(this.f39651c);
                return;
            default:
                this.f39650b.j0(this.f39651c, null);
                return;
        }
    }
}
