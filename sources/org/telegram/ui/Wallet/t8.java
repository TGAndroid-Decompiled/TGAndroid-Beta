package org.telegram.ui.Wallet;
public final class t8 implements Runnable {
    public final int f33712a;
    public final Object f33713b;
    public final Object f33714c;

    public t8(int i10, Object obj, Object obj2) {
        this.f33712a = i10;
        this.f33713b = obj;
        this.f33714c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f33713b;
        t8 t8Var = (t8) this.f33714c;
        cVar.f43813c.r0();
        r2.f fVar = cVar.f43812b;
        synchronized (fVar.f43823a) {
            fVar.b();
            t8Var.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.f33713b;
        qa.b bVar = (qa.b) this.f33714c;
        if (pVar.f44060b == r9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f44059a;
                pVar.f44059a = null;
                pVar.f44060b = bVar;
            }
            aVar.f(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        r9.o oVar = (r9.o) this.f33713b;
        qa.b bVar = (qa.b) this.f33714c;
        synchronized (oVar) {
            try {
                if (oVar.f44057b == null) {
                    oVar.f44056a.add(bVar);
                } else {
                    oVar.f44057b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.t8.run():void");
    }
}
