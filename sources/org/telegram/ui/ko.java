package org.telegram.ui;
public final class ko implements Runnable {
    public final int f40895a;
    public final long f40896b;
    public final long f40897c;
    public final Object d;

    public ko(Object obj, long j10, long j11, int i10) {
        this.f40895a = i10;
        this.d = obj;
        this.f40896b = j10;
        this.f40897c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.k71 k71Var;
        switch (this.f40895a) {
            case 0:
                oo.X((oo) this.d, this.f40896b, this.f40897c);
                return;
            case 1:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                long j10 = this.f40896b;
                long j11 = this.f40897c;
                y1Var.h = j10;
                y1Var.f44974n = j11;
                org.telegram.ui.Components.m71 m71Var = y1Var.f30764a;
                if (m71Var != null && (k71Var = m71Var.f32504g3) != null && m71Var.G) {
                    k71Var.O(true);
                    return;
                }
                return;
            case 2:
                ui.o oVar = (ui.o) this.d;
                long j12 = this.f40896b;
                long j13 = this.f40897c;
                if (oVar.f49994n == ui.m.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    oVar.f49997q = j14;
                    oVar.f49999s = 0L;
                    oVar.f50000t = ui.o.q(j14);
                    oVar.i();
                    return;
                }
                return;
            default:
                long j15 = this.f40896b;
                long j16 = this.f40897c;
                ui.o oVar2 = (ui.o) ((dc.e) this.d).f8321c;
                if (j15 == oVar2.f49996p) {
                    oVar2.f49995o = null;
                    oVar2.f49997q += j16;
                    oVar2.f49998r = 0L;
                    oVar2.f49989i.removeCallbacks(oVar2.E);
                    ui.m mVar = oVar2.f49994n;
                    if (mVar == ui.m.f49982s) {
                        oVar2.c();
                        oVar2.s();
                        oVar2.l("cancelled");
                        return;
                    } else if (mVar == ui.m.f49981r) {
                        oVar2.c();
                        oVar2.s();
                        return;
                    } else if (oVar2.f50002w) {
                        oVar2.f50002w = false;
                        oVar2.i();
                        return;
                    } else if (mVar == ui.m.d) {
                        ui.i iVar = oVar2.A;
                        if (iVar == null) {
                            oVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j17 = oVar2.j();
                        oVar2.f49999s = 0L;
                        oVar2.f50000t = j17;
                        oVar2.f49990j.execute(new org.telegram.utils.recorder.audio.c(1, oVar2, iVar));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
