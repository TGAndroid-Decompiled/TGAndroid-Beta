package org.telegram.ui;
public final class go implements Runnable {
    public final int f37639a;
    public final long f37640b;
    public final long f37641c;
    public final Object d;

    public go(Object obj, long j10, long j11, int i10) {
        this.f37639a = i10;
        this.d = obj;
        this.f37640b = j10;
        this.f37641c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.b71 b71Var;
        switch (this.f37639a) {
            case 0:
                ko.W((ko) this.d, this.f37640b, this.f37641c);
                return;
            case 1:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                long j10 = this.f37640b;
                long j11 = this.f37641c;
                y1Var.f43338f = j10;
                y1Var.h = j11;
                org.telegram.ui.Components.d71 d71Var = y1Var.f25907a;
                if (d71Var != null && (b71Var = d71Var.Z2) != null && d71Var.G) {
                    b71Var.N(true);
                    return;
                }
                return;
            case 2:
                ri.o oVar = (ri.o) this.d;
                long j12 = this.f37640b;
                long j13 = this.f37641c;
                if (oVar.f46267n == ri.m.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    oVar.f46270q = j14;
                    oVar.f46272s = 0L;
                    oVar.f46273t = ri.o.q(j14);
                    oVar.i();
                    return;
                }
                return;
            default:
                long j15 = this.f37640b;
                long j16 = this.f37641c;
                ri.o oVar2 = (ri.o) ((cc.e) this.d).f5098c;
                if (j15 == oVar2.f46269p) {
                    oVar2.f46268o = null;
                    oVar2.f46270q += j16;
                    oVar2.f46271r = 0L;
                    oVar2.f46262i.removeCallbacks(oVar2.E);
                    ri.m mVar = oVar2.f46267n;
                    if (mVar == ri.m.f46255s) {
                        oVar2.c();
                        oVar2.s();
                        oVar2.l("cancelled");
                        return;
                    } else if (mVar == ri.m.f46254r) {
                        oVar2.c();
                        oVar2.s();
                        return;
                    } else if (oVar2.f46275w) {
                        oVar2.f46275w = false;
                        oVar2.i();
                        return;
                    } else if (mVar == ri.m.d) {
                        ri.i iVar = oVar2.A;
                        if (iVar == null) {
                            oVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j17 = oVar2.j();
                        oVar2.f46272s = 0L;
                        oVar2.f46273t = j17;
                        oVar2.f46263j.execute(new org.telegram.utils.recorder.audio.c(1, oVar2, iVar));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
