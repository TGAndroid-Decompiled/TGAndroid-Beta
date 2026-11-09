package org.telegram.ui;

import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import java.util.HashSet;
public final class q31 implements Runnable {
    public final int f48879a;
    public final long f48880b;
    public final Object f48881c;

    public q31(Object obj, long j3, int i7) {
        this.f48879a = i7;
        this.f48881c = obj;
        this.f48880b = j3;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f48879a) {
            case 0:
                ((org.telegram.messenger.voip.k) this.f48881c).a(Long.valueOf(this.f48880b));
                return;
            case 1:
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) this.f48881c;
                long j3 = this.f48880b;
                b0Var.getClass();
                b0Var.presentFragment(cn.ta(j3));
                return;
            case 2:
                org.telegram.utils.twidget.i1 i1Var = (org.telegram.utils.twidget.i1) this.f48881c;
                long j10 = this.f48880b;
                Trace.beginSection("WidgetSandbox:Destroy");
                try {
                    org.telegram.utils.twidget.r0 r0Var = i1Var.f52851c;
                    org.telegram.utils.twidget.o0 o0Var = (org.telegram.utils.twidget.o0) r0Var.f52972e.remove(Long.valueOf(j10));
                    if (o0Var != null) {
                        org.telegram.utils.twidget.b h12 = o0Var.h1();
                        if (h12 != null) {
                            try {
                                h12.J(o0Var.d);
                            } catch (RemoteException unused) {
                            }
                        }
                        synchronized (r0Var.f52970b) {
                            r0Var.j(o0Var.f52943a);
                        }
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 3:
                long j11 = this.f48880b;
                vi.h hVar = (vi.h) ((ac.e) this.f48881c).f1025c;
                if (j11 == hVar.f57565o && (i7 = hVar.G) != 9 && i7 != 10 && i7 != 8) {
                    SystemClock.elapsedRealtime();
                    hVar.f57572w = false;
                    hVar.s(3);
                    hVar.f57559i.removeCallbacks(hVar.D);
                    vi.b bVar = hVar.h;
                    bVar.b("recording started: retainedDurationMs=" + vi.h.r(hVar.f57566p));
                    return;
                }
                return;
            default:
                wg.w0 w0Var = (wg.w0) this.f48881c;
                long j12 = this.f48880b;
                HashSet hashSet = w0Var.W1;
                hashSet.remove(Long.valueOf(j12));
                w0Var.Q1.b(true, hashSet, new wg.r0(w0Var, 5), null);
                w0Var.n1(true, false);
                return;
        }
    }
}
