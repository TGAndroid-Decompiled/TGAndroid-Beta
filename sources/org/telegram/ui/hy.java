package org.telegram.ui;
public final class hy implements Runnable {
    public final int f46006a;
    public final ez f46007b;

    public hy(ez ezVar, int i3) {
        this.f46006a = i3;
        this.f46007b = ezVar;
    }

    @Override
    public final void run() {
        switch (this.f46006a) {
            case 0:
                ez.a0(this.f46007b);
                return;
            default:
                ez.b0(this.f46007b);
                return;
        }
    }
}
