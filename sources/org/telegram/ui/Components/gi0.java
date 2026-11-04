package org.telegram.ui.Components;
public final class gi0 implements Runnable {
    public final int f34120a;
    public final ji0 f34121b;

    public gi0(ji0 ji0Var, int i3) {
        this.f34120a = i3;
        this.f34121b = ji0Var;
    }

    @Override
    public final void run() {
        switch (this.f34120a) {
            case 0:
                if (this.f34121b.f35077a.getImageReceiver().B() != null && !this.f34121b.f35077a.getImageReceiver().B().f32734l0 && !this.f34121b.f35077a.getImageReceiver().B().y()) {
                    this.f34121b.f35077a.getImageReceiver().B().start();
                }
                this.f34121b.F = false;
                return;
            default:
                ji0 ji0Var = this.f34121b;
                li0 li0Var = ji0Var.Q;
                try {
                    ji0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                li0Var.f35762n0 = li0Var.U.indexOf(ji0Var.f35080e);
                li0Var.m0 = ji0Var.f35080e;
                li0Var.invalidate();
                return;
        }
    }
}
