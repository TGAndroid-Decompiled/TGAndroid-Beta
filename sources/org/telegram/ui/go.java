package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.ay0;
import ri.j;
import ri.p;
public final class go implements Runnable {
    public final int f37278a;
    public final long f37279b;
    public final long f37280c;
    public final Object d;

    public go(Object obj, long j10, long j11, int i10) {
        this.f37278a = i10;
        this.d = obj;
        this.f37279b = j10;
        this.f37280c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.s61 s61Var;
        switch (this.f37278a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f37279b, this.f37280c, new g5((ko) this.d, 4));
                return;
            case 1:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.d;
                long j10 = this.f37279b;
                long j11 = this.f37280c;
                x1Var.f42807f = j10;
                x1Var.h = j11;
                org.telegram.ui.Components.u61 u61Var = x1Var.f31190a;
                if (u61Var != null && (s61Var = u61Var.W2) != null && u61Var.G) {
                    s61Var.N(true);
                    return;
                }
                return;
            case 2:
                ri.p pVar = (ri.p) this.d;
                long j12 = this.f37279b;
                long j13 = this.f37280c;
                if (pVar.f45862m == ri.n.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    pVar.f45865p = j14;
                    pVar.f45867r = 0L;
                    pVar.f45868s = ri.p.q(j14);
                    pVar.i();
                    return;
                }
                return;
            default:
                long j15 = this.f37279b;
                long j16 = this.f37280c;
                final ri.p pVar2 = (ri.p) ((cc.e) this.d).f5095c;
                if (j15 == pVar2.f45864o) {
                    pVar2.f45863n = null;
                    pVar2.f45865p += j16;
                    pVar2.f45866q = 0L;
                    pVar2.h.removeCallbacks(pVar2.D);
                    ri.n nVar = pVar2.f45862m;
                    if (nVar == ri.n.f45851s) {
                        pVar2.c();
                        pVar2.s();
                        pVar2.l("cancelled");
                        return;
                    } else if (nVar == ri.n.f45850r) {
                        pVar2.c();
                        pVar2.s();
                        return;
                    } else if (pVar2.v) {
                        pVar2.v = false;
                        pVar2.i();
                        return;
                    } else if (nVar == ri.n.d) {
                        final ri.j jVar = pVar2.f45874z;
                        if (jVar == null) {
                            pVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j17 = pVar2.j();
                        pVar2.f45867r = 0L;
                        pVar2.f45868s = j17;
                        pVar2.f45858i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                byte[] bArr;
                                p pVar3 = p.this;
                                j jVar2 = jVar;
                                try {
                                    bArr = AudioRecorderNative.e(jVar2.f45837b.getAbsolutePath());
                                } catch (Throwable th2) {
                                    pVar3.f45857g.a("waveform extraction failed", th2);
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
