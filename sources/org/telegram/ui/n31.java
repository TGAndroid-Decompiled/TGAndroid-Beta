package org.telegram.ui;

import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import java.util.HashSet;
public final class n31 implements Runnable {
    public final int f49439a;
    public final long f49440b;
    public final Object f49441c;

    public n31(Object obj, long j3, int i7) {
        this.f49439a = i7;
        this.f49441c = obj;
        this.f49440b = j3;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f49439a) {
            case 0:
                ((li.v) this.f49441c).a(Long.valueOf(this.f49440b));
                return;
            case 1:
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) this.f49441c;
                long j3 = this.f49440b;
                a0Var.getClass();
                a0Var.presentFragment(an.ua(j3));
                return;
            case 2:
                org.telegram.utils.twidget.l1 l1Var = (org.telegram.utils.twidget.l1) this.f49441c;
                long j10 = this.f49440b;
                Trace.beginSection("WidgetSandbox:Destroy");
                try {
                    org.telegram.utils.twidget.u0 u0Var = l1Var.f54301c;
                    org.telegram.utils.twidget.r0 r0Var = (org.telegram.utils.twidget.r0) u0Var.f54414e.remove(Long.valueOf(j10));
                    if (r0Var != null) {
                        org.telegram.utils.twidget.b h12 = r0Var.h1();
                        if (h12 != null) {
                            try {
                                h12.K(r0Var.d);
                            } catch (RemoteException unused) {
                            }
                        }
                        synchronized (u0Var.f54412b) {
                            u0Var.j(r0Var.f54388a);
                        }
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 3:
                wg.u0 u0Var2 = (wg.u0) this.f49441c;
                long j11 = this.f49440b;
                HashSet hashSet = u0Var2.f59243a2;
                hashSet.remove(Long.valueOf(j11));
                u0Var2.U1.b(true, hashSet, new wg.p0(u0Var2, 5), null);
                u0Var2.n1(true, false);
                return;
            default:
                long j12 = this.f49440b;
                yi.j jVar = (yi.j) ((ac.e) this.f49441c).f1023c;
                if (j12 == jVar.f60764o && (i7 = jVar.G) != 9 && i7 != 10 && i7 != 8) {
                    SystemClock.elapsedRealtime();
                    jVar.f60771w = false;
                    jVar.s(3);
                    jVar.f60758i.removeCallbacks(jVar.D);
                    yi.b bVar = jVar.h;
                    bVar.b("recording started: retainedDurationMs=" + yi.j.r(jVar.f60765p));
                    return;
                }
                return;
        }
    }
}
