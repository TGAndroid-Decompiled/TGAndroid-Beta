package org.telegram.ui.Components;
public final class ei0 implements Runnable {
    public final int f33414a;
    public final hi0 f33415b;

    public ei0(hi0 hi0Var, int i7) {
        this.f33414a = i7;
        this.f33415b = hi0Var;
    }

    @Override
    public final void run() {
        switch (this.f33414a) {
            case 0:
                if (this.f33415b.f34303a.getImageReceiver().B() != null && !this.f33415b.f34303a.getImageReceiver().B().f31834k0 && !this.f33415b.f34303a.getImageReceiver().B().y()) {
                    this.f33415b.f34303a.getImageReceiver().B().start();
                }
                this.f33415b.E = false;
                return;
            default:
                hi0 hi0Var = this.f33415b;
                ji0 ji0Var = hi0Var.P;
                try {
                    hi0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                ji0Var.m0 = ji0Var.T.indexOf(hi0Var.f34306e);
                ji0Var.f35052l0 = hi0Var.f34306e;
                ji0Var.invalidate();
                return;
        }
    }
}
