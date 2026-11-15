package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sg implements cl, org.telegram.ui.ActionBar.q1, te.i, ij0, ri.n, gh.d, ri.m, org.telegram.ui.ActionBar.l0, in, r4, si {
    public final int f39301a;
    public final ki f39302b;

    public sg(ki kiVar, int i7) {
        this.f39301a = i7;
        this.f39302b = kiVar;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        long j3;
        boolean u12;
        switch (this.f39301a) {
            case 14:
                ki kiVar = this.f39302b;
                ci ciVar = kiVar.f36509w2;
                if (ciVar != kiVar.f36447e2 && ciVar != kiVar.f36467l2) {
                    if (!ciVar.M(z10, i7, i10, 0L, kiVar.f1())) {
                        kiVar.B4 = true;
                        kiVar.dismiss();
                        return;
                    }
                    return;
                }
                kiVar.u1(z10, i7, 0, kiVar.L2, kiVar.f1());
                return;
            default:
                ki kiVar2 = this.f39302b;
                ue ueVar = kiVar2.f36442c2;
                if (ueVar != null) {
                    j3 = ueVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                sh shVar = kiVar2.G2;
                kiVar2.L2 = j10;
                shVar.setEffect(j10);
                ci ciVar2 = kiVar2.f36509w2;
                if (ciVar2 != kiVar2.f36447e2 && ciVar2 != kiVar2.f36467l2) {
                    if (!ciVar2.M(z10, i7, i10, j10, kiVar2.f1())) {
                        kiVar2.dismiss();
                    }
                    u12 = false;
                } else {
                    u12 = kiVar2.u1(z10, i7, i10, j10, kiVar2.f1());
                }
                ue ueVar2 = kiVar2.f36442c2;
                if (ueVar2 != null) {
                    ueVar2.h(!u12);
                    kiVar2.f36442c2 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        TLRPC.User user;
        if (view instanceof di) {
            di diVar = (di) view;
            ki kiVar = this.f39302b;
            if (!kiVar.Q1 && (user = diVar.f33953b) != null) {
                kiVar.k1(diVar.f33954c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void c(org.telegram.tgnet.TLRPC.MessageMedia r86, android.text.Editable r87, sh.d r88, java.util.ArrayList r89, final boolean r90, final int r91, final long r92) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sg.c(org.telegram.tgnet.TLRPC$MessageMedia, android.text.Editable, sh.d, java.util.ArrayList, boolean, int, long):void");
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        switch (this.f39301a) {
            case 0:
                ((org.telegram.ui.an) this.f39302b.f36436a2).d(messageMedia, i7, z10, i10, 0L);
                return;
            case 12:
                ((org.telegram.ui.an) this.f39302b.f36436a2).d(messageMedia, i7, z10, i10, j3);
                return;
            default:
                ((org.telegram.ui.an) this.f39302b.f36436a2).d(messageMedia, i7, z10, i10, j3);
                return;
        }
    }

    @Override
    public int e() {
        ki kiVar = this.f39302b;
        kiVar.getClass();
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, kiVar.J0);
    }

    @Override
    public void f(te.j jVar) {
        this.f39302b.i1();
    }

    @Override
    public void g(int i7) {
        this.f39302b.V2.getActionBarMenuOnItemClick().b(i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ki kiVar = this.f39302b;
        kiVar.B4 = true;
        kiVar.dismiss();
    }

    @Override
    public int j(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        float f10;
        int i7;
        switch (this.f39301a) {
            case 5:
                if (org.telegram.messenger.qc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                if (z10) {
                    i7 = org.telegram.ui.ActionBar.j6.f28792a7;
                } else {
                    i7 = org.telegram.ui.ActionBar.j6.f28940i5;
                }
                int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
                int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, e6Var);
                ki kiVar = this.f39302b;
                if (kiVar.f36466k4) {
                    return i0.a.f(0.75f, w03, kiVar.f36469l4);
                }
                return c8.g0.m(f10, w02, w03);
            case 6:
                if (this.f39302b.f36466k4) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 7:
                if (this.f39302b.f36466k4) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                ki kiVar2 = this.f39302b;
                if (kiVar2.f36466k4) {
                    if (org.telegram.messenger.g0.B(kiVar2.f36469l4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void k(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        CharSequence charSequence2;
        ki kiVar = this.f39302b;
        si siVar = kiVar.T1;
        if (siVar != null) {
            siVar.k(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36436a2;
        if (e2Var != null && (e2Var instanceof org.telegram.ui.an)) {
            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var;
            if (anVar.u7()) {
                anVar.D8(charSequence, null);
                org.telegram.messenger.c accountInstance = anVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                long j11 = anVar.f45259k6;
                org.telegram.messenger.gj gjVar = anVar.E5;
                org.telegram.messenger.gj gjVar2 = anVar.f45281m4;
                org.telegram.messenger.gj gjVar3 = anVar.G5;
                org.telegram.messenger.fw Y8 = anVar.Y8();
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.ez.J;
                new Thread(new org.telegram.messenger.mw(null, arrayList, j11, accountInstance, charSequence2, false, null, gjVar3, gjVar, gjVar2, z10, i7, i10, null, Y8, j3, z11, j10, null)).start();
                anVar.L6();
                return;
            }
            return;
        }
        ii iiVar = kiVar.X3;
        if (iiVar != null) {
            iiVar.b2(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
        }
    }

    @Override
    public void l(int i7) {
        ki kiVar = this.f39302b;
        dh.g gVar = kiVar.D4;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                ti.a e10 = kiVar.Y0.e();
                e10.b(kiVar.f29682b.getY(), kiVar.f29682b.getWidth(), kiVar.f29682b.getY() + kiVar.f29682b.getHeight());
                gVar.h(e10);
            }
            gVar.e(kiVar.H4, kiVar.f29682b.getWidth(), kiVar.f29682b.getHeight());
        }
    }

    @Override
    public void a() {
    }
}
