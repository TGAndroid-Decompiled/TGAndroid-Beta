package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f28322a;
    public final bf f28323b;
    public final int f28324c;

    public ze(bf bfVar, int i7, int i10) {
        this.f28322a = i10;
        this.f28323b = bfVar;
        this.f28324c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28322a) {
            case 0:
                bf bfVar = this.f28323b;
                try {
                    bfVar.f23079b.o(this.f28324c);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                bf bfVar2 = this.f28323b;
                try {
                    bfVar2.f23079b.o(this.f28324c);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 2:
                bf bfVar3 = this.f28323b;
                try {
                    bfVar3.f23079b.o(this.f28324c);
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                bf bfVar4 = this.f28323b;
                try {
                    bfVar4.f23079b.o(this.f28324c);
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
        }
    }
}
