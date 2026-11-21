package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dh implements ll, org.telegram.ui.ActionBar.q1, te.i, sj0, ri.n, gh.d, ri.m, org.telegram.ui.ActionBar.l0, sn, a5, bj {
    public final int f34501a;
    public final ui f34502b;

    public dh(ui uiVar, int i7) {
        this.f34501a = i7;
        this.f34502b = uiVar;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        long j3;
        boolean v12;
        switch (this.f34501a) {
            case 14:
                ui uiVar = this.f34502b;
                mi miVar = uiVar.f40448w2;
                if (miVar != uiVar.f40386e2 && miVar != uiVar.f40406l2) {
                    if (!miVar.M(z10, i7, i10, 0L, uiVar.g1())) {
                        uiVar.B4 = true;
                        uiVar.dismiss();
                        return;
                    }
                    return;
                }
                uiVar.v1(z10, i7, 0, uiVar.L2, uiVar.g1());
                return;
            default:
                ui uiVar2 = this.f34502b;
                df dfVar = uiVar2.f40381c2;
                if (dfVar != null) {
                    j3 = dfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ci ciVar = uiVar2.G2;
                uiVar2.L2 = j10;
                ciVar.setEffect(j10);
                mi miVar2 = uiVar2.f40448w2;
                if (miVar2 != uiVar2.f40386e2 && miVar2 != uiVar2.f40406l2) {
                    if (!miVar2.M(z10, i7, i10, j10, uiVar2.g1())) {
                        uiVar2.dismiss();
                    }
                    v12 = false;
                } else {
                    v12 = uiVar2.v1(z10, i7, i10, j10, uiVar2.g1());
                }
                df dfVar2 = uiVar2.f40381c2;
                if (dfVar2 != null) {
                    dfVar2.h(!v12);
                    uiVar2.f40381c2 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        switch (this.f34501a) {
            case 0:
                ((org.telegram.ui.bn) this.f34502b.f40375a2).b(messageMedia, i7, z10, i10, 0L);
                return;
            case 12:
                ((org.telegram.ui.bn) this.f34502b.f40375a2).b(messageMedia, i7, z10, i10, j3);
                return;
            default:
                ((org.telegram.ui.bn) this.f34502b.f40375a2).b(messageMedia, i7, z10, i10, j3);
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        TLRPC.User user;
        if (view instanceof ni) {
            ni niVar = (ni) view;
            ui uiVar = this.f34502b;
            if (!uiVar.Q1 && (user = niVar.f37877b) != null) {
                uiVar.l1(niVar.f37878c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void d(org.telegram.tgnet.TLRPC.MessageMedia r86, android.text.Editable r87, sh.d r88, java.util.ArrayList r89, final boolean r90, final int r91, final long r92) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dh.d(org.telegram.tgnet.TLRPC$MessageMedia, android.text.Editable, sh.d, java.util.ArrayList, boolean, int, long):void");
    }

    @Override
    public int e() {
        ui uiVar = this.f34502b;
        uiVar.getClass();
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29378d6, uiVar.J0);
    }

    @Override
    public void f(te.j jVar) {
        this.f34502b.j1();
    }

    @Override
    public void g(int i7) {
        this.f34502b.V2.getActionBarMenuOnItemClick().b(i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ui uiVar = this.f34502b;
        uiVar.B4 = true;
        uiVar.dismiss();
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        CharSequence charSequence2;
        ui uiVar = this.f34502b;
        bj bjVar = uiVar.T1;
        if (bjVar != null) {
            bjVar.i(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40375a2;
        if (g2Var != null && (g2Var instanceof org.telegram.ui.bn)) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
            if (bnVar.u7()) {
                bnVar.D8(charSequence, null);
                org.telegram.messenger.c accountInstance = bnVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                long j11 = bnVar.f46099l6;
                org.telegram.messenger.fj fjVar = bnVar.F5;
                org.telegram.messenger.fj fjVar2 = bnVar.f46110m4;
                org.telegram.messenger.fj fjVar3 = bnVar.H5;
                org.telegram.messenger.bw Y8 = bnVar.Y8();
                org.telegram.messenger.q5 q5Var = org.telegram.messenger.zy.J;
                new Thread(new org.telegram.messenger.iw(null, arrayList, j11, accountInstance, charSequence2, false, null, fjVar3, fjVar, fjVar2, z10, i7, i10, null, Y8, j3, z11, j10, null)).start();
                bnVar.L6();
                return;
            }
            return;
        }
        si siVar = uiVar.X3;
        if (siVar != null) {
            siVar.b2(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
        }
    }

    @Override
    public int j(org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        float f10;
        int i7;
        switch (this.f34501a) {
            case 5:
                if (org.telegram.messenger.pc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                if (z10) {
                    i7 = org.telegram.ui.ActionBar.m6.f29321a7;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.f29469i5;
                }
                int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29378d6, h6Var);
                ui uiVar = this.f34502b;
                if (uiVar.f40405k4) {
                    return i0.a.f(0.75f, w03, uiVar.f40408l4);
                }
                return c8.i0.n(f10, w02, w03);
            case 6:
                if (this.f34502b.f40405k4) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 7:
                if (this.f34502b.f40405k4) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                ui uiVar2 = this.f34502b;
                if (uiVar2.f40405k4) {
                    if (org.telegram.messenger.g0.B(uiVar2.f40408l4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void l(int i7) {
        ui uiVar = this.f34502b;
        dh.g gVar = uiVar.D4;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.dd.a(i7, 4)) {
                ti.a e10 = uiVar.Y0.e();
                e10.b(uiVar.f30173b.getY(), uiVar.f30173b.getWidth(), uiVar.f30173b.getY() + uiVar.f30173b.getHeight());
                gVar.h(e10);
            }
            gVar.e(uiVar.H4, uiVar.f30173b.getWidth(), uiVar.f30173b.getHeight());
        }
    }

    @Override
    public void a() {
    }
}
