package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kg implements tk, org.telegram.ui.ActionBar.p1, qe.i, hj0, pi.n, hh.d, pi.m, org.telegram.ui.ActionBar.l0, zm, r4, ki {
    public final int f35395a;
    public final bi f35396b;

    public kg(bi biVar, int i3) {
        this.f35395a = i3;
        this.f35396b = biVar;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        long j10;
        boolean u12;
        switch (this.f35395a) {
            case 14:
                bi biVar = this.f35396b;
                th thVar = biVar.f32275t2;
                if (thVar != biVar.f32215b2 && thVar != biVar.f32235i2) {
                    if (!thVar.L(z10, i3, i10, 0L, biVar.f1())) {
                        biVar.f32297y4 = true;
                        biVar.dismiss();
                        return;
                    }
                    return;
                }
                biVar.u1(z10, i3, 0, biVar.I2, biVar.f1());
                return;
            default:
                bi biVar2 = this.f35396b;
                se seVar = biVar2.Z1;
                if (seVar != null) {
                    j10 = seVar.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                ih ihVar = biVar2.D2;
                biVar2.I2 = j11;
                ihVar.setEffect(j11);
                th thVar2 = biVar2.f32275t2;
                if (thVar2 != biVar2.f32215b2 && thVar2 != biVar2.f32235i2) {
                    if (!thVar2.L(z10, i3, i10, j11, biVar2.f1())) {
                        biVar2.dismiss();
                    }
                    u12 = false;
                } else {
                    u12 = biVar2.u1(z10, i3, i10, j11, biVar2.f1());
                }
                se seVar2 = biVar2.Z1;
                if (seVar2 != null) {
                    seVar2.g(!u12);
                    biVar2.Z1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(qe.j jVar) {
        this.f35396b.i1();
    }

    @Override
    public void c(org.telegram.tgnet.TLRPC.MessageMedia r86, android.text.Editable r87, th.d r88, java.util.ArrayList r89, final boolean r90, final int r91, final long r92) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kg.c(org.telegram.tgnet.TLRPC$MessageMedia, android.text.Editable, th.d, java.util.ArrayList, boolean, int, long):void");
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        switch (this.f35395a) {
            case 0:
                ((org.telegram.ui.wm) this.f35396b.X1).d(messageMedia, i3, z10, i10, 0L);
                return;
            case 12:
                ((org.telegram.ui.wm) this.f35396b.X1).d(messageMedia, i3, z10, i10, j10);
                return;
            default:
                ((org.telegram.ui.wm) this.f35396b.X1).d(messageMedia, i3, z10, i10, j10);
                return;
        }
    }

    @Override
    public int e() {
        bi biVar = this.f35396b;
        biVar.getClass();
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, biVar.J0);
    }

    @Override
    public boolean f(int i3, View view) {
        TLRPC.User user;
        if (view instanceof uh) {
            uh uhVar = (uh) view;
            bi biVar = this.f35396b;
            if (!biVar.N1 && (user = uhVar.f38746b) != null) {
                biVar.k1(uhVar.f38747c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        bi biVar = this.f35396b;
        biVar.f32297y4 = true;
        biVar.dismiss();
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
        CharSequence charSequence2;
        bi biVar = this.f35396b;
        ki kiVar = biVar.Q1;
        if (kiVar != null) {
            kiVar.h(arrayList, charSequence, z10, i3, i10, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if (d2Var != null && (d2Var instanceof org.telegram.ui.wm)) {
            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
            if (wmVar.t7()) {
                wmVar.B8(charSequence, null);
                org.telegram.messenger.c accountInstance = wmVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                long j12 = wmVar.f51376k6;
                org.telegram.messenger.zi ziVar = wmVar.E5;
                org.telegram.messenger.zi ziVar2 = wmVar.f51397m4;
                org.telegram.messenger.zi ziVar3 = wmVar.G5;
                org.telegram.messenger.zv W8 = wmVar.W8();
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.yy.J;
                new Thread(new org.telegram.messenger.hw(null, arrayList, j12, accountInstance, charSequence2, false, null, ziVar3, ziVar, ziVar2, z10, i3, i10, null, W8, j10, z11, j11, null)).start();
                wmVar.K6();
                return;
            }
            return;
        }
        zh zhVar = biVar.U3;
        if (zhVar != null) {
            zhVar.R1(arrayList, charSequence, z10, i3, i10, j10, z11, j11);
        }
    }

    @Override
    public void i(int i3) {
        this.f35396b.S2.getActionBarMenuOnItemClick().b(i3);
    }

    @Override
    public int j(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        float f10;
        int i3;
        switch (this.f35395a) {
            case 5:
                if (org.telegram.messenger.lc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                if (z10) {
                    i3 = org.telegram.ui.ActionBar.k6.f27824a7;
                } else {
                    i3 = org.telegram.ui.ActionBar.k6.f27971i5;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var);
                bi biVar = this.f35396b;
                if (biVar.f32234h4) {
                    return i0.a.f(0.75f, w03, biVar.f32236i4);
                }
                return b8.cd.n(f10, w02, w03);
            case 6:
                if (this.f35396b.f32234h4) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 7:
                if (this.f35396b.f32234h4) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                bi biVar2 = this.f35396b;
                if (biVar2.f32234h4) {
                    if (org.telegram.messenger.g0.B(biVar2.f32236i4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void l(int i3) {
        bi biVar = this.f35396b;
        eh.g gVar = biVar.A4;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (x7.u.a(i3, 4)) {
                ri.a e10 = biVar.Y0.e();
                e10.b(biVar.f28586b.getY(), biVar.f28586b.getWidth(), biVar.f28586b.getY() + biVar.f28586b.getHeight());
                gVar.h(e10);
            }
            gVar.e(biVar.E4, biVar.f28586b.getWidth(), biVar.f28586b.getHeight());
        }
    }

    @Override
    public void a() {
    }
}
