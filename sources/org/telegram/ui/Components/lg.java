package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lg implements uk, org.telegram.ui.ActionBar.r1, te.i, dj0, oi.n, gh.d, oi.m, org.telegram.ui.ActionBar.m0, zm, s4, ji {
    public final int f35667a;
    public final ci f35668b;

    public lg(ci ciVar, int i7) {
        this.f35667a = i7;
        this.f35668b = ciVar;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        long j3;
        boolean u12;
        switch (this.f35667a) {
            case 14:
                ci ciVar = this.f35668b;
                uh uhVar = ciVar.f32660v2;
                if (uhVar != ciVar.d2 && uhVar != ciVar.f32619k2) {
                    if (!uhVar.L(z9, i7, i10, 0L, ciVar.f1())) {
                        ciVar.A4 = true;
                        ciVar.dismiss();
                        return;
                    }
                    return;
                }
                ciVar.u1(z9, i7, 0, ciVar.K2, ciVar.f1());
                return;
            default:
                ci ciVar2 = this.f35668b;
                te teVar = ciVar2.f32594b2;
                if (teVar != null) {
                    j3 = teVar.j();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                kh khVar = ciVar2.F2;
                ciVar2.K2 = j10;
                khVar.setEffect(j10);
                uh uhVar2 = ciVar2.f32660v2;
                if (uhVar2 != ciVar2.d2 && uhVar2 != ciVar2.f32619k2) {
                    if (!uhVar2.L(z9, i7, i10, j10, ciVar2.f1())) {
                        ciVar2.dismiss();
                    }
                    u12 = false;
                } else {
                    u12 = ciVar2.u1(z9, i7, i10, j10, ciVar2.f1());
                }
                te teVar2 = ciVar2.f32594b2;
                if (teVar2 != null) {
                    teVar2.g(!u12);
                    ciVar2.f32594b2 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(org.telegram.tgnet.TLRPC.MessageMedia r86, android.text.Editable r87, sh.e r88, java.util.ArrayList r89, final boolean r90, final int r91, final long r92) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lg.b(org.telegram.tgnet.TLRPC$MessageMedia, android.text.Editable, sh.e, java.util.ArrayList, boolean, int, long):void");
    }

    @Override
    public boolean c(int i7, View view) {
        TLRPC.User user;
        if (view instanceof vh) {
            vh vhVar = (vh) view;
            ci ciVar = this.f35668b;
            if (!ciVar.P1 && (user = vhVar.f39006b) != null) {
                ciVar.k1(vhVar.f39007c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        switch (this.f35667a) {
            case 0:
                ((org.telegram.ui.cn) this.f35668b.Z1).d(messageMedia, i7, z9, i10, 0L);
                return;
            case 12:
                ((org.telegram.ui.cn) this.f35668b.Z1).d(messageMedia, i7, z9, i10, j3);
                return;
            default:
                ((org.telegram.ui.cn) this.f35668b.Z1).d(messageMedia, i7, z9, i10, j3);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        CharSequence charSequence2;
        ci ciVar = this.f35668b;
        ji jiVar = ciVar.S1;
        if (jiVar != null) {
            jiVar.e(arrayList, charSequence, z9, i7, i10, j3, z10, j10);
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        if (f2Var != null && (f2Var instanceof org.telegram.ui.cn)) {
            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
            if (cnVar.u7()) {
                cnVar.C8(charSequence, null);
                org.telegram.messenger.c accountInstance = cnVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                long j11 = cnVar.f44545j6;
                org.telegram.messenger.ij ijVar = cnVar.D5;
                org.telegram.messenger.ij ijVar2 = cnVar.f44568l4;
                org.telegram.messenger.ij ijVar3 = cnVar.F5;
                org.telegram.messenger.hw X8 = cnVar.X8();
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.gz.I;
                new Thread(new org.telegram.messenger.ow(null, arrayList, j11, accountInstance, charSequence2, false, null, ijVar3, ijVar, ijVar2, z9, i7, i10, null, X8, j3, z10, j10, null)).start();
                cnVar.L6();
                return;
            }
            return;
        }
        ai aiVar = ciVar.W3;
        if (aiVar != null) {
            aiVar.M1(arrayList, charSequence, z9, i7, i10, j3, z10, j10);
        }
    }

    @Override
    public void f(te.j jVar) {
        this.f35668b.i1();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ci ciVar = this.f35668b;
        ciVar.A4 = true;
        ciVar.dismiss();
    }

    @Override
    public int h() {
        ci ciVar = this.f35668b;
        ciVar.getClass();
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, ciVar.I0);
    }

    @Override
    public void i(int i7) {
        this.f35668b.U2.getActionBarMenuOnItemClick().b(i7);
    }

    @Override
    public int k(org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        float f10;
        int i7;
        switch (this.f35667a) {
            case 5:
                if (org.telegram.messenger.sc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                if (z9) {
                    i7 = org.telegram.ui.ActionBar.m6.f27834a7;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.f27981i5;
                }
                int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, h6Var);
                ci ciVar = this.f35668b;
                if (ciVar.f32618j4) {
                    return i0.a.f(0.75f, w03, ciVar.f32621k4);
                }
                return c8.g0.m(f10, w02, w03);
            case 6:
                if (this.f35668b.f32618j4) {
                    return 0;
                }
                if (z9) {
                    return 687865855;
                }
                return -1;
            case 7:
                if (this.f35668b.f32618j4) {
                    return 0;
                }
                if (z9) {
                    return 352321535;
                }
                return -1;
            default:
                ci ciVar2 = this.f35668b;
                if (ciVar2.f32618j4) {
                    if (org.telegram.messenger.g0.B(ciVar2.f32621k4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z9) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void l(int i7) {
        ci ciVar = this.f35668b;
        dh.g gVar = ciVar.C4;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                qi.a e10 = ciVar.X0.e();
                e10.b(ciVar.f28672b.getY(), ciVar.f28672b.getWidth(), ciVar.f28672b.getY() + ciVar.f28672b.getHeight());
                gVar.h(e10);
            }
            gVar.e(ciVar.G4, ciVar.f28672b.getWidth(), ciVar.f28672b.getHeight());
        }
    }

    @Override
    public void a() {
    }
}
