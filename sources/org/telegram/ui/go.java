package org.telegram.ui;
public final class go implements Runnable {
    public final int f37617a;
    public final long f37618b;
    public final long f37619c;
    public final Object d;

    public go(Object obj, long j10, long j11, int i10) {
        this.f37617a = i10;
        this.d = obj;
        this.f37618b = j10;
        this.f37619c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.a71 a71Var;
        switch (this.f37617a) {
            case 0:
                ko.W((ko) this.d, this.f37618b, this.f37619c);
                return;
            case 1:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                long j10 = this.f37618b;
                long j11 = this.f37619c;
                y1Var.f43327f = j10;
                y1Var.h = j11;
                org.telegram.ui.Components.c71 c71Var = y1Var.f25615a;
                if (c71Var != null && (a71Var = c71Var.Z2) != null && c71Var.G) {
                    a71Var.N(true);
                    return;
                }
                return;
            case 2:
                ri.o oVar = (ri.o) this.d;
                long j12 = this.f37618b;
                long j13 = this.f37619c;
                if (oVar.f46266n == ri.m.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    oVar.f46269q = j14;
                    oVar.f46271s = 0L;
                    oVar.f46272t = ri.o.q(j14);
                    oVar.i();
                    return;
                }
                return;
            default:
                long j15 = this.f37618b;
                long j16 = this.f37619c;
                ri.o oVar2 = (ri.o) ((cc.e) this.d).f5098c;
                if (j15 == oVar2.f46268p) {
                    oVar2.f46267o = null;
                    oVar2.f46269q += j16;
                    oVar2.f46270r = 0L;
                    oVar2.f46261i.removeCallbacks(oVar2.E);
                    ri.m mVar = oVar2.f46266n;
                    if (mVar == ri.m.f46254s) {
                        oVar2.c();
                        oVar2.s();
                        oVar2.l("cancelled");
                        return;
                    } else if (mVar == ri.m.f46253r) {
                        oVar2.c();
                        oVar2.s();
                        return;
                    } else if (oVar2.f46274w) {
                        oVar2.f46274w = false;
                        oVar2.i();
                        return;
                    } else if (mVar == ri.m.d) {
                        ri.i iVar = oVar2.A;
                        if (iVar == null) {
                            oVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j17 = oVar2.j();
                        oVar2.f46271s = 0L;
                        oVar2.f46272t = j17;
                        oVar2.f46262j.execute(new org.telegram.utils.recorder.audio.c(1, oVar2, iVar));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
