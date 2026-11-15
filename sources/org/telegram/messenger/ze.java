package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f27927a;
    public final bf f27928b;
    public final int f27929c;

    public ze(bf bfVar, int i7, int i10) {
        this.f27927a = i10;
        this.f27928b = bfVar;
        this.f27929c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27927a) {
            case 0:
                bf bfVar = this.f27928b;
                try {
                    bfVar.f22690b.o(this.f27929c);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                bf bfVar2 = this.f27928b;
                try {
                    bfVar2.f22690b.o(this.f27929c);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 2:
                bf bfVar3 = this.f27928b;
                try {
                    bfVar3.f22690b.o(this.f27929c);
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                bf bfVar4 = this.f27928b;
                try {
                    bfVar4.f22690b.o(this.f27929c);
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
        }
    }
}
