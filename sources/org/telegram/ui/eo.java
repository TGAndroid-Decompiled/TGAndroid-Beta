package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.by0;
import ri.j;
import ri.p;
public final class eo implements Runnable {
    public final int f36693a;
    public final long f36694b;
    public final long f36695c;
    public final Object d;

    public eo(Object obj, long j10, long j11, int i10) {
        this.f36693a = i10;
        this.d = obj;
        this.f36694b = j10;
        this.f36695c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.t61 t61Var;
        switch (this.f36693a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f36694b, this.f36695c, new g5((io) this.d, 4));
                return;
            case 1:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.d;
                long j10 = this.f36694b;
                long j11 = this.f36695c;
                x1Var.f42848f = j10;
                x1Var.h = j11;
                org.telegram.ui.Components.v61 v61Var = x1Var.f32027a;
                if (v61Var != null && (t61Var = v61Var.W2) != null && v61Var.G) {
                    t61Var.N(true);
                    return;
                }
                return;
            case 2:
                ri.p pVar = (ri.p) this.d;
                long j12 = this.f36694b;
                long j13 = this.f36695c;
                if (pVar.f45834m == ri.n.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    pVar.f45837p = j14;
                    pVar.f45839r = 0L;
                    pVar.f45840s = ri.p.q(j14);
                    pVar.i();
                    return;
                }
                return;
            default:
                long j15 = this.f36694b;
                long j16 = this.f36695c;
                final ri.p pVar2 = (ri.p) ((cc.e) this.d).f5095c;
                if (j15 == pVar2.f45836o) {
                    pVar2.f45835n = null;
                    pVar2.f45837p += j16;
                    pVar2.f45838q = 0L;
                    pVar2.h.removeCallbacks(pVar2.D);
                    ri.n nVar = pVar2.f45834m;
                    if (nVar == ri.n.f45823s) {
                        pVar2.c();
                        pVar2.s();
                        pVar2.l("cancelled");
                        return;
                    } else if (nVar == ri.n.f45822r) {
                        pVar2.c();
                        pVar2.s();
                        return;
                    } else if (pVar2.v) {
                        pVar2.v = false;
                        pVar2.i();
                        return;
                    } else if (nVar == ri.n.d) {
                        final ri.j jVar = pVar2.f45846z;
                        if (jVar == null) {
                            pVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j17 = pVar2.j();
                        pVar2.f45839r = 0L;
                        pVar2.f45840s = j17;
                        pVar2.f45830i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                byte[] bArr;
                                p pVar3 = p.this;
                                j jVar2 = jVar;
                                try {
                                    bArr = AudioRecorderNative.e(jVar2.f45809b.getAbsolutePath());
                                } catch (Throwable th2) {
                                    pVar3.f45829g.a("waveform extraction failed", th2);
                                    bArr = null;
                                }
                                pVar3.h.post(new by0(pVar3, jVar2, bArr, 16));
                            }
                        });
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
