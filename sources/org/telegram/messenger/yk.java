package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.ui.Components.f41;
public final class yk implements Runnable {
    public final int f26650a;
    public final long f26651b;
    public final long f26652c;
    public final Object d;

    public yk(Object obj, long j3, long j10, int i7) {
        this.f26650a = i7;
        this.d = obj;
        this.f26651b = j3;
        this.f26652c = j10;
    }

    @Override
    public final void run() {
        f41 f41Var;
        switch (this.f26650a) {
            case 0:
                qp qpVar = (qp) this.d;
                long j3 = this.f26651b;
                long j10 = this.f26652c;
                a0.h hVar = qpVar.Q1;
                HashMap hashMap = qpVar.S1;
                if (j3 != 0) {
                    String str = j10 + "_" + j3;
                    ip ipVar = (ip) hashMap.get(str);
                    if (ipVar != null) {
                        qpVar.R(ipVar);
                        qpVar.R1.remove(ipVar);
                        hashMap.remove(str);
                        return;
                    }
                    return;
                }
                ip ipVar2 = (ip) hVar.f(j10);
                if (ipVar2 != null) {
                    qpVar.R(ipVar2);
                    qpVar.P1.remove(ipVar2);
                    hVar.l(j10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.pn.b0((org.telegram.ui.pn) this.d, this.f26651b, this.f26652c);
                return;
            case 2:
                org.telegram.ui.web.o1 o1Var = (org.telegram.ui.web.o1) this.d;
                long j11 = this.f26651b;
                long j12 = this.f26652c;
                o1Var.h = j11;
                o1Var.f51250n = j12;
                fi.w3 w3Var = o1Var.f34211a;
                if (w3Var != null && (f41Var = w3Var.f35167f3) != null && w3Var.G) {
                    f41Var.O(true);
                    return;
                }
                return;
            case 3:
                vi.h hVar2 = (vi.h) this.d;
                long j13 = this.f26651b;
                long j14 = this.f26652c;
                if (hVar2.G == 7) {
                    long j15 = ((j13 - j14) * 48000) / 1000;
                    hVar2.f57437p = j15;
                    hVar2.f57439r = 0L;
                    hVar2.f57440s = vi.h.r(j15);
                    hVar2.i();
                    return;
                }
                return;
            default:
                long j16 = this.f26651b;
                long j17 = this.f26652c;
                vi.h hVar3 = (vi.h) ((ac.e) this.d).f1025c;
                if (j16 == hVar3.f57436o) {
                    hVar3.f57435n = null;
                    hVar3.f57437p += j17;
                    hVar3.f57438q = 0L;
                    hVar3.f57430i.removeCallbacks(hVar3.D);
                    int i7 = hVar3.G;
                    if (i7 == 10) {
                        hVar3.c();
                        hVar3.t();
                        hVar3.l("cancelled");
                        return;
                    } else if (i7 == 9) {
                        hVar3.c();
                        hVar3.t();
                        return;
                    } else if (hVar3.v) {
                        hVar3.v = false;
                        hVar3.i();
                        return;
                    } else if (i7 == 4) {
                        vi.g gVar = hVar3.f57446z;
                        if (gVar == null) {
                            hVar3.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j18 = hVar3.j();
                        hVar3.f57439r = 0L;
                        hVar3.f57440s = j18;
                        hVar3.f57431j.execute(new org.telegram.utils.recorder.audio.c(1, hVar3, gVar));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
