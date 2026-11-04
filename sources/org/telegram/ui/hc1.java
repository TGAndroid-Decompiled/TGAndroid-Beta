package org.telegram.ui;
public final class hc1 implements Runnable {
    public final int f45899a;
    public final Object f45900b;
    public final Object f45901c;

    public hc1(int i3, Object obj, Object obj2) {
        this.f45899a = i3;
        this.f45900b = obj;
        this.f45901c = obj2;
    }

    private final void a() {
        t2.c cVar = (t2.c) this.f45900b;
        hc1 hc1Var = (hc1) this.f45901c;
        cVar.f54816c.d();
        t2.f fVar = cVar.f54815b;
        synchronized (fVar.f54829a) {
            fVar.b();
            hc1Var.run();
        }
    }

    private final void b() {
        ta.a aVar;
        t9.p pVar = (t9.p) this.f45900b;
        ta.b bVar = (ta.b) this.f45901c;
        if (pVar.f55074b == t9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f55073a;
                pVar.f55073a = null;
                pVar.f55074b = bVar;
            }
            aVar.c(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void c() {
        t9.o oVar = (t9.o) this.f45900b;
        ta.b bVar = (ta.b) this.f45901c;
        synchronized (oVar) {
            try {
                if (oVar.f55071b == null) {
                    oVar.f55070a.add(bVar);
                } else {
                    oVar.f55071b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hc1.run():void");
    }
}
