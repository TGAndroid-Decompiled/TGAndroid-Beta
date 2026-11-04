package org.telegram.ui;
public final class og0 implements Runnable {
    public final int f48286a;
    public final vg0 f48287b;

    public og0(vg0 vg0Var, int i3) {
        this.f48286a = i3;
        this.f48287b = vg0Var;
    }

    @Override
    public final void run() {
        switch (this.f48286a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f48287b.f50512j1);
                return;
            default:
                org.telegram.messenger.g0.K3(this.f48287b.k1.getEditText());
                return;
        }
    }
}
