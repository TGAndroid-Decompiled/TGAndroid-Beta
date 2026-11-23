package org.telegram.ui;

import android.os.SystemClock;
import android.os.Trace;
import java.util.HashSet;
public final class ox0 implements Runnable {
    public final int f50780a;
    public final long f50781b;
    public final Object f50782c;

    public ox0(Object obj, long j3, int i7) {
        this.f50780a = i7;
        this.f50782c = obj;
        this.f50781b = j3;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f50780a;
        long j3 = this.f50781b;
        Object obj = this.f50782c;
        switch (i10) {
            case 0:
                org.telegram.messenger.az azVar = (org.telegram.messenger.az) obj;
                azVar.f23099e = SystemClock.elapsedRealtime();
                azVar.f23098c = false;
                if (j3 == -1) {
                    azVar.d = false;
                    azVar.f23097b = 0L;
                } else {
                    azVar.f23097b = j3;
                    azVar.d = true;
                }
                org.telegram.messenger.ks.e().k(281, azVar);
                return;
            case 1:
                ((ki.n2) obj).a(Long.valueOf(j3));
                return;
            case 2:
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj;
                a0Var.getClass();
                a0Var.presentFragment(bn.ua(j3));
                return;
            case 3:
                org.telegram.utils.twidget.p1 p1Var = (org.telegram.utils.twidget.p1) obj;
                Trace.beginSection("WidgetSandbox:Destroy");
                try {
                    p1Var.f55011c.e(j3);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 4:
                wg.v0 v0Var = (wg.v0) obj;
                HashSet hashSet = v0Var.f59939a2;
                hashSet.remove(Long.valueOf(j3));
                v0Var.U1.b(true, hashSet, new wg.q0(v0Var, 5), null);
                v0Var.o1(true, false);
                return;
            default:
                yi.j jVar = (yi.j) ((ac.e) obj).f1022c;
                if (j3 == jVar.f61458o && (i7 = jVar.G) != 9 && i7 != 10 && i7 != 8) {
                    SystemClock.elapsedRealtime();
                    jVar.f61465w = false;
                    jVar.s(3);
                    jVar.f61452i.removeCallbacks(jVar.D);
                    yi.b bVar = jVar.h;
                    bVar.b("recording started: retainedDurationMs=" + yi.j.r(jVar.f61459p));
                    return;
                }
                return;
        }
    }
}
