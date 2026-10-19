package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.by0;
import ri.j;
import ri.p;
public final class eo implements Runnable {
    public final int f36687a;
    public final long f36688b;
    public final long f36689c;
    public final Object d;

    public eo(Object obj, long j10, long j11, int i10) {
        this.f36687a = i10;
        this.d = obj;
        this.f36688b = j10;
        this.f36689c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.t61 t61Var;
        switch (this.f36687a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f36688b, this.f36689c, new g5((io) this.d, 4));
                return;
            case 1:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.d;
                long j10 = this.f36688b;
                long j11 = this.f36689c;
                x1Var.f42849f = j10;
                x1Var.h = j11;
                org.telegram.ui.Components.v61 v61Var = x1Var.f32025a;
                if (v61Var != null && (t61Var = v61Var.W2) != null && v61Var.G) {
                    t61Var.N(true);
                    return;
                }
                return;
            case 2:
                ri.p pVar = (ri.p) this.d;
                long j12 = this.f36688b;
                long j13 = this.f36689c;
                if (pVar.f45836m == ri.n.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    pVar.f45839p = j14;
                    pVar.f45841r = 0L;
                    pVar.f45842s = ri.p.q(j14);
                    pVar.i();
                    return;
                }
                return;
            default:
                long j15 = this.f36688b;
                long j16 = this.f36689c;
                final ri.p pVar2 = (ri.p) ((cc.e) this.d).f5093c;
                if (j15 == pVar2.f45838o) {
                    pVar2.f45837n = null;
                    pVar2.f45839p += j16;
                    pVar2.f45840q = 0L;
                    pVar2.h.removeCallbacks(pVar2.D);
                    ri.n nVar = pVar2.f45836m;
                    if (nVar == ri.n.f45825s) {
                        pVar2.c();
                        pVar2.s();
                        pVar2.l("cancelled");
                        return;
                    } else if (nVar == ri.n.f45824r) {
                        pVar2.c();
                        pVar2.s();
                        return;
                    } else if (pVar2.v) {
                        pVar2.v = false;
                        pVar2.i();
                        return;
                    } else if (nVar == ri.n.d) {
                        final ri.j jVar = pVar2.f45848z;
                        if (jVar == null) {
                            pVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j17 = pVar2.j();
                        pVar2.f45841r = 0L;
                        pVar2.f45842s = j17;
                        pVar2.f45832i.execute(new Runnable() {
                            @Override
                            public final void run() {
                                byte[] bArr;
                                p pVar3 = p.this;
                                j jVar2 = jVar;
                                try {
                                    bArr = AudioRecorderNative.e(jVar2.f45811b.getAbsolutePath());
                                } catch (Throwable th2) {
                                    pVar3.f45831g.a("waveform extraction failed", th2);
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
