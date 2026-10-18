package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.ay0;
import ri.j;
import ri.p;
public final class go implements Runnable {
    public final int f37210a;
    public final long f37211b;
    public final long f37212c;
    public final Object d;

    public go(Object obj, long j10, long j11, int i10) {
        this.f37210a = i10;
        this.d = obj;
        this.f37211b = j10;
        this.f37212c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.s61 s61Var;
        switch (this.f37210a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f37211b, this.f37212c, new g5((ko) this.d, 4));
                return;
            case 1:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                long j10 = this.f37211b;
                long j11 = this.f37212c;
                y1Var.f42816f = j10;
                y1Var.h = j11;
                org.telegram.ui.Components.u61 u61Var = y1Var.f31190a;
                if (u61Var != null && (s61Var = u61Var.W2) != null && u61Var.G) {
                    s61Var.N(true);
                    return;
                }
                return;
            case 2:
                ri.p pVar = (ri.p) this.d;
                long j12 = this.f37211b;
                long j13 = this.f37212c;
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
                long j15 = this.f37211b;
                long j16 = this.f37212c;
                final ri.p pVar2 = (ri.p) ((cc.e) this.d).f5096c;
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
                                pVar3.h.post(new ay0(pVar3, jVar2, bArr, 16));
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
