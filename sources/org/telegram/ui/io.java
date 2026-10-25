package org.telegram.ui;
public final class io implements Runnable {
    public final int f40329a;
    public final long f40330b;
    public final long f40331c;
    public final Object d;

    public io(Object obj, long j10, long j11, int i10) {
        this.f40329a = i10;
        this.d = obj;
        this.f40330b = j10;
        this.f40331c = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.j71 j71Var;
        switch (this.f40329a) {
            case 0:
                mo.X((mo) this.d, this.f40330b, this.f40331c);
                return;
            case 1:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                long j10 = this.f40330b;
                long j11 = this.f40331c;
                y1Var.h = j10;
                y1Var.f45460n = j11;
                org.telegram.ui.Components.l71 l71Var = y1Var.f30417a;
                if (l71Var != null && (j71Var = l71Var.f32150g3) != null && l71Var.G) {
                    j71Var.O(true);
                    return;
                }
                return;
            case 2:
                ui.o oVar = (ui.o) this.d;
                long j12 = this.f40330b;
                long j13 = this.f40331c;
                if (oVar.f49956n == ui.m.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    oVar.f49959q = j14;
                    oVar.f49961s = 0L;
                    oVar.f49962t = ui.o.q(j14);
                    oVar.i();
                    return;
                }
                return;
            default:
                long j15 = this.f40330b;
                long j16 = this.f40331c;
                ui.o oVar2 = (ui.o) ((dc.e) this.d).f8321c;
                if (j15 == oVar2.f49958p) {
                    oVar2.f49957o = null;
                    oVar2.f49959q += j16;
                    oVar2.f49960r = 0L;
                    oVar2.f49951i.removeCallbacks(oVar2.E);
                    ui.m mVar = oVar2.f49956n;
                    if (mVar == ui.m.f49944s) {
                        oVar2.c();
                        oVar2.s();
                        oVar2.l("cancelled");
                        return;
                    } else if (mVar == ui.m.f49943r) {
                        oVar2.c();
                        oVar2.s();
                        return;
                    } else if (oVar2.f49964w) {
                        oVar2.f49964w = false;
                        oVar2.i();
                        return;
                    } else if (mVar == ui.m.d) {
                        ui.i iVar = oVar2.A;
                        if (iVar == null) {
                            oVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j17 = oVar2.j();
                        oVar2.f49961s = 0L;
                        oVar2.f49962t = j17;
                        oVar2.f49952j.execute(new org.telegram.utils.recorder.audio.c(1, oVar2, iVar));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
