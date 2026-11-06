package org.telegram.ui.Components;
public final class di0 implements Runnable {
    public final int f32986a;
    public final gi0 f32987b;

    public di0(gi0 gi0Var, int i7) {
        this.f32986a = i7;
        this.f32987b = gi0Var;
    }

    @Override
    public final void run() {
        switch (this.f32986a) {
            case 0:
                if (this.f32987b.f33915a.getImageReceiver().B() != null && !this.f32987b.f33915a.getImageReceiver().B().f40964k0 && !this.f32987b.f33915a.getImageReceiver().B().y()) {
                    this.f32987b.f33915a.getImageReceiver().B().start();
                }
                this.f32987b.E = false;
                return;
            default:
                gi0 gi0Var = this.f32987b;
                ii0 ii0Var = gi0Var.P;
                try {
                    gi0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                ii0Var.m0 = ii0Var.T.indexOf(gi0Var.f33918e);
                ii0Var.f34632l0 = gi0Var.f33918e;
                ii0Var.invalidate();
                return;
        }
    }
}
