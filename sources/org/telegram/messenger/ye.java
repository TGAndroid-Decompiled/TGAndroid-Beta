package org.telegram.messenger;
public final class ye implements Runnable {
    public final int f28128a;
    public final af f28129b;
    public final int f28130c;

    public ye(af afVar, int i7, int i10) {
        this.f28128a = i10;
        this.f28129b = afVar;
        this.f28130c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28128a) {
            case 0:
                af afVar = this.f28129b;
                try {
                    afVar.f22867b.o(this.f28130c);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                af afVar2 = this.f28129b;
                try {
                    afVar2.f22867b.o(this.f28130c);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 2:
                af afVar3 = this.f28129b;
                try {
                    afVar3.f22867b.o(this.f28130c);
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                af afVar4 = this.f28129b;
                try {
                    afVar4.f22867b.o(this.f28130c);
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
        }
    }
}
