package org.telegram.ui.Components;
public final class q70 implements Runnable {
    public final int f38723a;
    public final s70 f38724b;
    public final boolean f38725c;

    public q70(s70 s70Var, boolean z10, int i7) {
        this.f38723a = i7;
        this.f38724b = s70Var;
        this.f38725c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38723a) {
            case 0:
                org.telegram.messenger.g0.g3(new q70(this.f38724b, this.f38725c, 1));
                return;
            default:
                this.f38724b.setJoinRequest(this.f38725c);
                return;
        }
    }
}
