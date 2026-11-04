package org.telegram.ui;
public final class pa implements Runnable {
    public final int f48499a;
    public final kb f48500b;

    public pa(kb kbVar, int i3) {
        this.f48499a = i3;
        this.f48500b = kbVar;
    }

    @Override
    public final void run() {
        switch (this.f48499a) {
            case 0:
                kb kbVar = this.f48500b;
                kbVar.H0 = Integer.MAX_VALUE;
                kbVar.I0 = -1;
                kbVar.i1();
                kbVar.J0 = null;
                return;
            case 1:
                kb kbVar2 = this.f48500b;
                kbVar2.b1(false);
                kbVar2.F.f();
                return;
            default:
                this.f48500b.a1();
                return;
        }
    }
}
