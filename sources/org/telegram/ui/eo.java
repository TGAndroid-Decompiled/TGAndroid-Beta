package org.telegram.ui;
public final class eo implements Runnable {
    public final int f36698a;
    public final long f36699b;
    public final long f36700c;
    public final Object d;

    public eo(Object obj, long j10, long j11, int i10) {
        this.f36698a = i10;
        this.d = obj;
        this.f36699b = j10;
        this.f36700c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.u61 u61Var;
        switch (this.f36698a) {
            case 0:
                io.W((io) this.d, this.f36699b, this.f36700c);
                return;
            case 1:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.d;
                long j10 = this.f36699b;
                long j11 = this.f36700c;
                x1Var.f42859f = j10;
                x1Var.h = j11;
                org.telegram.ui.Components.w61 w61Var = x1Var.f32360a;
                if (w61Var != null && (u61Var = w61Var.W2) != null && w61Var.G) {
                    u61Var.N(true);
                    return;
                }
                return;
            case 2:
                ri.o oVar = (ri.o) this.d;
                long j12 = this.f36699b;
                long j13 = this.f36700c;
                if (oVar.f45846n == ri.m.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    oVar.f45849q = j14;
                    oVar.f45851s = 0L;
                    oVar.f45852t = ri.o.q(j14);
                    oVar.i();
                    return;
                }
                return;
            default:
                long j15 = this.f36699b;
                long j16 = this.f36700c;
                ri.o oVar2 = (ri.o) ((cc.e) this.d).f5093c;
                if (j15 == oVar2.f45848p) {
                    oVar2.f45847o = null;
                    oVar2.f45849q += j16;
                    oVar2.f45850r = 0L;
                    oVar2.f45841i.removeCallbacks(oVar2.E);
                    ri.m mVar = oVar2.f45846n;
                    if (mVar == ri.m.f45834s) {
                        oVar2.c();
                        oVar2.s();
                        oVar2.l("cancelled");
                        return;
                    } else if (mVar == ri.m.f45833r) {
                        oVar2.c();
                        oVar2.s();
                        return;
                    } else if (oVar2.f45854w) {
                        oVar2.f45854w = false;
                        oVar2.i();
                        return;
                    } else if (mVar == ri.m.d) {
                        ri.i iVar = oVar2.A;
                        if (iVar == null) {
                            oVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j17 = oVar2.j();
                        oVar2.f45851s = 0L;
                        oVar2.f45852t = j17;
                        oVar2.f45842j.execute(new org.telegram.utils.recorder.audio.c(1, oVar2, iVar));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
