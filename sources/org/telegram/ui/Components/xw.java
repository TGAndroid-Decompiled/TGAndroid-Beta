package org.telegram.ui.Components;
public final class xw implements Runnable {
    public final int f32708a;
    public final fz f32709b;

    public xw(fz fzVar, int i10) {
        this.f32708a = i10;
        this.f32709b = fzVar;
    }

    @Override
    public final void run() {
        switch (this.f32708a) {
            case 0:
            default:
                this.f32709b.e();
                return;
        }
    }
}
