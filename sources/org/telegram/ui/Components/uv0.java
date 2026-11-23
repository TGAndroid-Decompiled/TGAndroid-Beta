package org.telegram.ui.Components;
public final class uv0 implements Runnable {
    public final int f40478a;
    public final jw0 f40479b;

    public uv0(jw0 jw0Var, int i7) {
        this.f40478a = i7;
        this.f40479b = jw0Var;
    }

    @Override
    public final void run() {
        switch (this.f40478a) {
            case 0:
                this.f40479b.f36541o1.f();
                return;
            case 1:
                this.f40479b.f36541o1.f();
                return;
            case 2:
                jw0 jw0Var = this.f40479b;
                jw0Var.dismiss();
                org.telegram.messenger.ri.d0(jw0Var.f30223a).k2(jw0Var.getContext(), jw0Var.N1, 1, jw0Var.G1, false, false);
                return;
            case 3:
                jw0 jw0Var2 = this.f40479b;
                org.telegram.messenger.mp.u1(jw0Var2.f30223a).F3("stickers", jw0Var2.G1, 1, null);
                return;
            default:
                jw0 jw0Var3 = this.f40479b;
                jw0Var3.dismiss();
                org.telegram.messenger.ri.d0(jw0Var3.f30223a).k2(jw0Var3.getContext(), jw0Var3.N1, 1, jw0Var3.G1, false, false);
                return;
        }
    }
}
