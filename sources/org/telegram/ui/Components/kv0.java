package org.telegram.ui.Components;
public final class kv0 implements Runnable {
    public final int f36634a;
    public final bw0 f36635b;

    public kv0(bw0 bw0Var, int i7) {
        this.f36634a = i7;
        this.f36635b = bw0Var;
    }

    @Override
    public final void run() {
        switch (this.f36634a) {
            case 0:
                this.f36635b.f33410o1.f();
                return;
            case 1:
                this.f36635b.f33410o1.f();
                return;
            case 2:
                bw0 bw0Var = this.f36635b;
                bw0Var.dismiss();
                org.telegram.messenger.si.b0(bw0Var.f29679a).f2(bw0Var.getContext(), bw0Var.N1, 1, bw0Var.G1, false, false);
                return;
            case 3:
                bw0 bw0Var2 = this.f36635b;
                org.telegram.messenger.np.s1(bw0Var2.f29679a).y3("stickers", bw0Var2.G1, 1, null);
                return;
            default:
                bw0 bw0Var3 = this.f36635b;
                bw0Var3.dismiss();
                org.telegram.messenger.si.b0(bw0Var3.f29679a).f2(bw0Var3.getContext(), bw0Var3.N1, 1, bw0Var3.G1, false, false);
                return;
        }
    }
}
