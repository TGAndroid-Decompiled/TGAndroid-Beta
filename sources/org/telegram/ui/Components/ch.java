package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ch implements jl, org.telegram.ui.ActionBar.q1, te.i, sj0, ri.n, gh.d, ri.m, org.telegram.ui.ActionBar.l0, pn, z4, aj {
    public final int f34054a;
    public final ti f34055b;

    public ch(ti tiVar, int i7) {
        this.f34054a = i7;
        this.f34055b = tiVar;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        long j3;
        boolean v12;
        switch (this.f34054a) {
            case 14:
                ti tiVar = this.f34055b;
                li liVar = tiVar.f40029w2;
                if (liVar != tiVar.f39967e2 && liVar != tiVar.f39987l2) {
                    if (!liVar.M(z10, i7, i10, 0L, tiVar.g1())) {
                        tiVar.B4 = true;
                        tiVar.dismiss();
                        return;
                    }
                    return;
                }
                tiVar.v1(z10, i7, 0, tiVar.L2, tiVar.g1());
                return;
            default:
                ti tiVar2 = this.f34055b;
                ef efVar = tiVar2.f39962c2;
                if (efVar != null) {
                    j3 = efVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                bi biVar = tiVar2.G2;
                tiVar2.L2 = j10;
                biVar.setEffect(j10);
                li liVar2 = tiVar2.f40029w2;
                if (liVar2 != tiVar2.f39967e2 && liVar2 != tiVar2.f39987l2) {
                    if (!liVar2.M(z10, i7, i10, j10, tiVar2.g1())) {
                        tiVar2.dismiss();
                    }
                    v12 = false;
                } else {
                    v12 = tiVar2.v1(z10, i7, i10, j10, tiVar2.g1());
                }
                ef efVar2 = tiVar2.f39962c2;
                if (efVar2 != null) {
                    efVar2.h(!v12);
                    tiVar2.f39962c2 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        TLRPC.User user;
        if (view instanceof mi) {
            mi miVar = (mi) view;
            ti tiVar = this.f34055b;
            if (!tiVar.Q1 && (user = miVar.f37458b) != null) {
                tiVar.l1(miVar.f37459c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void c(org.telegram.tgnet.TLRPC.MessageMedia r86, android.text.Editable r87, sh.d r88, java.util.ArrayList r89, final boolean r90, final int r91, final long r92) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ch.c(org.telegram.tgnet.TLRPC$MessageMedia, android.text.Editable, sh.d, java.util.ArrayList, boolean, int, long):void");
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        switch (this.f34054a) {
            case 0:
                ((org.telegram.ui.bn) this.f34055b.f39956a2).d(messageMedia, i7, z10, i10, 0L);
                return;
            case 12:
                ((org.telegram.ui.bn) this.f34055b.f39956a2).d(messageMedia, i7, z10, i10, j3);
                return;
            default:
                ((org.telegram.ui.bn) this.f34055b.f39956a2).d(messageMedia, i7, z10, i10, j3);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        CharSequence charSequence2;
        ti tiVar = this.f34055b;
        aj ajVar = tiVar.T1;
        if (ajVar != null) {
            ajVar.e(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
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
                long j11 = bnVar.f46271l6;
                org.telegram.messenger.fj fjVar = bnVar.F5;
                org.telegram.messenger.fj fjVar2 = bnVar.f46282m4;
                org.telegram.messenger.fj fjVar3 = bnVar.H5;
                org.telegram.messenger.bw Y8 = bnVar.Y8();
                org.telegram.messenger.q5 q5Var = org.telegram.messenger.zy.J;
                new Thread(new org.telegram.messenger.iw(null, arrayList, j11, accountInstance, charSequence2, false, null, fjVar3, fjVar, fjVar2, z10, i7, i10, null, Y8, j3, z11, j10, null)).start();
                bnVar.L6();
                return;
            }
            return;
        }
        ri riVar = tiVar.X3;
        if (riVar != null) {
            riVar.W1(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
        }
    }

    @Override
    public int f(org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        float f10;
        int i7;
        switch (this.f34054a) {
            case 5:
                if (org.telegram.messenger.pc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                if (z10) {
                    i7 = org.telegram.ui.ActionBar.n6.f29394a7;
                } else {
                    i7 = org.telegram.ui.ActionBar.n6.f29542i5;
                }
                int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
                int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, i6Var);
                ti tiVar = this.f34055b;
                if (tiVar.f39986k4) {
                    return i0.a.f(0.75f, w03, tiVar.f39989l4);
                }
                return c8.j0.n(f10, w02, w03);
            case 6:
                if (this.f34055b.f39986k4) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 7:
                if (this.f34055b.f39986k4) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                ti tiVar2 = this.f34055b;
                if (tiVar2.f39986k4) {
                    if (org.telegram.messenger.g0.B(tiVar2.f39989l4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void g(te.j jVar) {
        this.f34055b.j1();
    }

    @Override
    public void h(int i7) {
        this.f34055b.V2.getActionBarMenuOnItemClick().b(i7);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ti tiVar = this.f34055b;
        tiVar.B4 = true;
        tiVar.dismiss();
    }

    @Override
    public int j() {
        ti tiVar = this.f34055b;
        tiVar.getClass();
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, tiVar.J0);
    }

    @Override
    public void k(int i7) {
        ti tiVar = this.f34055b;
        dh.g gVar = tiVar.D4;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.ed.a(i7, 4)) {
                ti.a e10 = tiVar.Y0.e();
                e10.b(tiVar.f30226b.getY(), tiVar.f30226b.getWidth(), tiVar.f30226b.getY() + tiVar.f30226b.getHeight());
                gVar.h(e10);
            }
            gVar.e(tiVar.H4, tiVar.f30226b.getWidth(), tiVar.f30226b.getHeight());
        }
    }

    @Override
    public void a() {
    }
}
