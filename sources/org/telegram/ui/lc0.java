package org.telegram.ui;
public final class lc0 implements Runnable {
    public final int f47299a;
    public final mc0 f47300b;

    public lc0(mc0 mc0Var, int i3) {
        this.f47299a = i3;
        this.f47300b = mc0Var;
    }

    @Override
    public final void run() {
        switch (this.f47299a) {
            case 0:
                mc0 mc0Var = this.f47300b;
                nc0 nc0Var = mc0Var.d;
                if (mc0Var.f47649b) {
                    boolean z10 = nc0Var.L;
                    org.telegram.ui.Components.ch0 ch0Var = nc0Var.K;
                    xc xcVar = nc0Var.f47961n;
                    if (z10 && System.currentTimeMillis() - mc0Var.f47648a >= 10000) {
                        xcVar.setAnimation(ch0Var);
                        ch0Var.N(0, false, false);
                        ch0Var.f32745u0 = new lc0(mc0Var, 1);
                        xcVar.d();
                        mc0Var.f47648a = System.currentTimeMillis();
                    }
                    xcVar.postDelayed(mc0Var.f47650c, 1000L);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new lc0(this.f47300b, 2));
                return;
            default:
                nc0 nc0Var2 = this.f47300b.d;
                org.telegram.ui.Components.ch0 ch0Var2 = nc0Var2.J;
                ch0Var2.N(0, false, false);
                nc0Var2.f47961n.setAnimation(ch0Var2);
                return;
        }
    }
}
